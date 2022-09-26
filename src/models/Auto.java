package models;

public class Auto extends Vehicle{

    private String model;

    public Auto(String brand, String model){
        super(brand);
        this.model = model;
    }
}
