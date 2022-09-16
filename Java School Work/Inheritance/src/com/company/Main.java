package com.company;

public class Main {

    public static void main(String[] args) {
        Plane p1 = new Plane("Nike", 20, 800, 100, 2, "A bird representer");
        Plane p2 = new Plane("Adidas",4,200,80,1,"amphibian");
        Plane p3 = new Plane("Reebok", 2,150,120,2,"waterplane");
        Boat b1 = new Boat("Lebron",10,40,100,"Motorized",3);
        Boat b2 = new Boat("Broke", 2,25,0,"row",3);
        System.out.println(p1.getFuelPerPassenger()+"\n");

        System.out.println("Can "+p1.brand+" land on water? : "+p1.canLandOn("water"));
        System.out.println("Can "+p1.brand+" land on ground?: "+p1.canLandOn("ground"));
        System.out.println("Can "+p2.brand+" land on ground?: "+ p2.canLandOn("ground" ));
        System.out.println("Can "+p3.brand+" land on water?: "+p3.canLandOn("water"));
        System.out.println(p1.isFaster(p2));
        System.out.println(b1.getPaddleCount());
        System.out.println(b2.getPaddleCount());
        System.out.println(b1.getFuelPerPassenger());
        System.out.println("\n");
        System.out.println(Boat.getAvgPaddleCountPerBoat());
        System.out.println(Plane.canPlanesLandCount());

        for(Plane x: Plane.planes){
            System.out.println(x);
        }
        System.out.println("\n");
        for (Boat x: Boat.boats){
            System.out.println(x);
        }


    }
}
