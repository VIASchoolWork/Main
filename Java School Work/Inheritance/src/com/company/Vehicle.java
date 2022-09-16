package com.company;

public class Vehicle {
    String brand;
    int seatCount;
    double maxSpeed;
    double fuelConsumption;


    Vehicle(String brand, int seatCount, double maxSpeed, double fuelConsumption) {
        this.brand = brand;
        this.seatCount = seatCount;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;

    }

    public double getFuelPerPassenger() {
        System.out.println(this.brand + " FuelPerPassenger considering all the seats are taken:");
        return fuelConsumption / seatCount;
    }

    public boolean isFaster(Vehicle b) {
        if (this.maxSpeed > b.maxSpeed) {
            System.out.println("Is "+this.brand + " faster than the " + b.brand + " vehicle?");
            return true;
        } else {
            System.out.println("Its not faster mate");
            return false;
        }
    }
public  String toString(){
        return "The brand is "+this.brand+" with "+ this.seatCount+" and its max speed is "+this.maxSpeed+" with fuel consumption of "+ this.fuelConsumption;
}

}
