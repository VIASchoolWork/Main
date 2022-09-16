package com.company;

import java.util.ArrayList;

public class Boat extends Vehicle {
    String type;
    double depth;
    static ArrayList<Boat> boats = new ArrayList<Boat>();

    Boat(String brand, int seatCount, int maxSpeed, int fuelConsumption, String type, double depth) {
        super(brand, seatCount, maxSpeed, fuelConsumption);
        this.type = type;
        this.depth = depth;
        boats.add(this);
        //System.out.println("work!?!??");
    }

    public boolean isFaster(Vehicle b) {
        if (this == b || b instanceof Plane) {
            return false;
        }
        if (b instanceof Boat a) {
            return this.depth > a.depth;
        }
        System.out.println("Yep, it shmoves.");
        return true;
    }

    public int getPaddleCount() {
        System.out.println("");
        if (this.fuelConsumption > 0) {
            System.out.println("If it needs fuel then it does not need paddles bro. So it has this manny paddles: ");
            return 0;
        }
        System.out.println("The paddle count for " + this.brand + " is:");
        return (int) this.depth; // cast into int. IDE told me to fix my problems. Since depth was a double
    }

    static public double getAvgPaddleCountPerBoat() {
        if (boats.size() == 0) {
            System.out.println("No boats.");
            return 0;
        }
        double count = 0;
        for (int i = 0; i < boats.size(); i++) {
            count++;
        }
        System.out.println("The average paddle count is: ");
        return count / boats.size();
    }

    public String toString() {
        return "This is a "+this.brand+" boat. Being a "+this.type+" has a depth of "+this.depth;
    }
}
