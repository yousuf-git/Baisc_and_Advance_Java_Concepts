package Optionals;

import java.util.Random;

public class License {
    long licenseNumber;
    License() {
        licenseNumber = new Random().nextLong(2000000);
    }
}