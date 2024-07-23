package Enumeration;

// Defining an interface
interface TrafficLight {
    public TrafficLight next();
}


enum TrafficLights implements TrafficLight {
    RED {
        @Override
        public TrafficLight next() {
            return YELLOW;
        }
    },

    YELLOW {
        @Override
        public TrafficLight next() {
            return GREEN;
        }
    },

    GREEN {
        @Override
        public TrafficLight next() {
            return RED;
        }
    };
}


public class TrafficLightsEnum {

    public static void main(String[] args) {
        TrafficLights[] lights = TrafficLights.values();
        for (TrafficLights light : lights) {
            System.out.println("Current: " + light + ", Next: " + light.next());
        }
    }
}
