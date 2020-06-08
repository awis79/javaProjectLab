package com.company.devices;
import java.util.Comparator;

public class Application {

        public static Comparator<Application> nameComparator = new Comparator<Application>() {
            @Override
            public int compare(Application one, Application two) {
                return one.name.compareTo(two.name);
            }
        };
        public static Comparator<Application> priceComparator = new Comparator<Application>() {
            @Override
            public int compare(Application one, Application two) {
                return one.price.compareTo(two.price);
            }
        };
        public String name;
        public String version;
        public Double price;

        public Application(String name, Double price) {
            this.name = name;
            this.price = price;
        }

        public String toString() {
            return name + " " + version + " " + price;
        }
}
