package devices;

public class Phone extends Device {
    public final Double screenSize;
    public final boolean isAndroid;

    public Phone(String producer, String model, Double screenSize, boolean isAndroid, Integer yearOfProduction) {
        this.screenSize = screenSize;
        this.isAndroid = isAndroid;
    }

    public String toString(){
        return this.producer + " " + this.model + " " + this.isAndroid;
    }
}