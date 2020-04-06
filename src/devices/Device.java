package devices;

public class Device {
    public final String producer;
    public final String model;
    public final Integer yearOfProduction;
    private Double value = 2000.0;

    public Device() {
        this.producer = "producer";
        this.model = "model";
        this.yearOfProduction = 1999;
    }
}
