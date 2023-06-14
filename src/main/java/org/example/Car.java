package org.example;

public class Car {
//    1. **Define the Car class:** Start by creating a class called `Car`. This class should have properties common to all cars such as `make`, `model`, and `price`. It should also have a constructor to initialize these properties and getter methods to retrieve their values.
    private String make;
    private String model;
    private int price;


    public Car(String make, String model, int price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public String getMake(){
        return this.make;
    }

    public void setMake(String make){
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
