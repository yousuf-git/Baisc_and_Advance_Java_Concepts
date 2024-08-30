package com.restapi;

import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

public class App {
    public static String CurrencyName = "";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Currency Converter ! \n");
        System.out.println("Available currency codes are: ");

        // List of currency codes in Uppercase as an ArrayList
        List<String> currencyCodes = Arrays.asList("USD", "AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD",
                "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTN", "BWP",
                "BYN", "BZD", "CAD", "CDF", "CHF", "CLP", "CNY", "COP", "CRC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP",
                "DZD", "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "FOK", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF",
                "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP",
                "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KID", "KMF", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR",
                "LRD", "LSL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRU", "MUR", "MVR", "MWK", "MXN",
                "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN",
                "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP");

        for (int i = 0; i < currencyCodes.size(); i++) {
            System.out.print(currencyCodes.get(i) + "   ");
            if (i % 9 == 0 && i != 0) {
                System.out.println();
            }
        }
        String from, to;
        double amount;

        char ch = 'y';
        while (ch == 'y') {
            System.out.println("\n------------------ Input your choice of currency codes ------------------ ");

            choiceloop: while (true) {
                try {
                    System.out.print("From: ");
                    from = sc.next();
                    CurrencyName = from;

                    System.out.print("To: ");
                    to = sc.next();

                    // Validation checks
                    if (!currencyCodes.contains(from.toUpperCase()) || !currencyCodes.contains(to.toUpperCase()))
                        throw new Exception();

                    System.out.print("\nInput Amount: ");
                    amount = sc.nextFloat();
                    System.out.println();

                    break choiceloop;
                } catch (Exception e) {
                    System.out.println("Invalid Input !, Try again");
                }
            }

            // Creating a GET request
            HttpRequest getRequest;
            try {
                getRequest = HttpRequest.newBuilder()
                        .uri(new URI("https://cdn.jsdelivr.net/npm/@fawazahmed0/currency-api@latest/v1/currencies/"
                                + from.toLowerCase()
                                + ".json"))
                        .GET().build();
                // Creating a client to sent the request
                HttpClient client = HttpClient.newHttpClient();

                // Getting response from the server
                HttpResponse<String> response = client.send(getRequest, BodyHandlers.ofString());

                // Parse the JSON response
                JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();

                // Extract the date from the JSON response
                String date = jsonObject.get("date").getAsString();

                // Remove the date from the JsonObject, leaving only the rates
                jsonObject.remove("date");

                // Convert the remaining JSON into a Map<String, Map<String, Double>>
                Gson gson = new Gson();
                Type type = new TypeToken<Map<String, Map<String, Double>>>() {
                }.getType();

                /*
                 * 
                 * new TypeToken<Map<String, Map<String, Double>>>() {}:
                 * This creates an anonymous subclass of TypeToken with the specific generic
                 * type Map<String, Map<String, Double>>.
                 * This tells Gson that you want to capture the exact type Map<String,
                 * Map<String, Double>>.
                 * getType():
                 * The getType() method of TypeToken returns a Type object representing the full
                 * type information of Map<String, Map<String, Double>>.
                 * This Type object includes all the generic type parameters, so it knows that
                 * the outer map has String keys and Map<String, Double> values, and that the
                 * inner map has String keys and Double values.
                 * 
                 */

                Map<String, Map<String, Double>> rates = gson.fromJson(jsonObject, type);

                Double result = rates.get(from.toLowerCase()).get(to.toLowerCase()) * amount;
                System.out.println(amount + " " + from.toUpperCase() + " = " + result + " " + to.toUpperCase());

                System.out.println("Date: " + date + " \n");

            } catch (Exception e) {
                System.out.println(e);

            }

            System.out.println("Do you want to try again? (y/n): ");
            ch = sc.next().charAt(0);
        }

        System.out.println("\nThank you, Have a nice day \n");

        sc.close();

    }
}
