package com.company;

import java.util.ArrayList;
import java.util.Set;

public class Plane extends Vehicle {
    int enginecount;
    String type;
    static ArrayList<Plane> planes = new ArrayList<Plane>();

    Plane(String brand, int seatCount, int maxSpeed, int fuelConsumption, int enginecount, String type) {
        super(brand, seatCount, maxSpeed, fuelConsumption);
        this.enginecount = enginecount;
        this.type = type;
        planes.add(this);
    }

    public double getFuelPerPassenger() {
        System.out.println("Fuel consumption for " + this.brand + " is being checked." + "\nPlease stand by.");
        return super.getFuelPerPassenger() * enginecount;
    }

    public boolean canLandOn(String surface) {
        return surface.equals("ground") && this.type.equals("A bird representer") || surface.equals("water") && this.type.equals("waterplane") || this.type.equals("amphibian");
    }

    static public double canPlanesLandCount() {
        int counter = 0;
        for (int i = 0; i < planes.size(); i++) {
            if (planes.get(i).canLandOn("water") || planes.get(i).canLandOn("ground")) {
                counter++;
            }
        }
        System.out.println("The ammount of planes that can land:");
        return counter;
    }

}
