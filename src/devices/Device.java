package devices;

import com.company.Human;
import com.company.Saleable;

public abstract class Device implements Saleable {
    public final String producer;
    public final String model;
    public final Integer yearOfProduction;
    private Double value = 2000.0;

    public Device(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public Device(String producer, String model) {
        this.producer = producer;
        this.model = model;
        yearOfProduction = 2000;
    }

    abstract void getValue();

    public String toString(){
        return this.producer + " " + this.model;
    }

    @Override
    public void sell() throws Exception {
            if(this instanceof Device){
                throw new Exception("no way bustard you can not sell things!");
            }
            System.out.printf(this.toString() + "bonjorno!");

    }
}
