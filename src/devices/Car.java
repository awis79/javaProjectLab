package devices;

public class Car extends Device{
    public final Double engineVolume;

    public String plates;
    private Double value = 2000.0;


    public Car(String producer, String model, Integer yearOfProduction, Double engineVolumne) {

        this.engineVolume = engineVolumne;
    }

    public Double getValue(){
        return this.value;
    }

    public String toString() {
        return this.producer + " " + this.model + " " + this.plates;
    }
}