package MyCar;

import javax.crypto.spec.PSource;

public class Car {
    private String brand;
    private  String model;
    private String honkSound;
    private boolean engineOn;


    public Car(String brand, String model, String honkSound) {   // contructor :D
        this.brand= brand;
        this.model = model;
        this.honkSound = honkSound;

    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;

    }
    public void setHonkSound(String honkSound) {
        this.honkSound= honkSound;
    }



    public String getBrand() {
        return brand;

    }
    public String getModel() {
        return model;

    }
    public String getHonkSound() {
        return honkSound;
    }

    public String sound() {
        if (getHonkSound()== null || getHonkSound().isEmpty())
            System.out.println("Unknown sound");
        else
            System.out.print("HONK: ");
            System.out.println(honkSound);

        return honkSound;

    }
    public void drive() {
        if (engineOn)
            System.out.println(getBrand() + " " + getModel() + " is driving");
        else
            System.out.println("It might help to start the engine...");
    }
    public void park() {
        System.out.println(getBrand() + " " + getModel() + " is parked");
    }
    public void turnEngineOn () {
        System.out.println("[Engine started]");
        engineOn=true;
    }
    public void turnEngineOff() {
        System.out.println("[Engine off]");
        engineOn=false;
    }

}
