package com.company;


import static com.company.Hotel.printInfo;

public class Main {

    public static void main(String[] args) {
        // task1();
        //task2();
    }

    static void task1() {
        Fridge f1 = new Fridge("Yeet", 1999, 2.5, "Yellow");
        Fridge f2 = new Fridge("Mitsubishi", 2000, 1.5, "Purple");
        Fridge f3 = new Fridge("Toyota", 2020, 4.3, "Black");
        f1.addProduct("Eggs");
        f2.addProduct("Milk");
        f3.addProduct(null);
        f1.addProduct("Milk");
        f2.addProduct("Beer");

        Fridge.printFullestFridge();
        Fridge.getSmallestFridge();
        Fridge.printUniqueProductCount();
        System.out.println(f1.products);
    }

    static void task2() {
        Hotel h1 = new Hotel("The Majestic isle", "New York", 420, 54);
        Hotel h2 = new Hotel("The Glass Mountain", "Dublin", 320, 35.9);
        Hotel h3 = new Hotel("The Cave", "London", 30, 99.99);
        Hotel h4 = new Hotel("The One and Only", "Riga", 125, 120.5);

        h1.addGuest("Martin");
        h1.addGuest("Peter");
        h1.addGuest("Mizkif");
        h1.addGuest("Ludwig");

        h2.addGuest("Dora");
        h2.addGuest("Michael");
        h2.addGuest("John");
        h2.addGuest("Arthur");

        h3.addGuest("Maya");
        h3.addGuest("Brian");
        h3.addGuest("Peter");

        h4.addGuest("Lois");
        h4.addGuest("Andrew");
        h4.addGuest("Dom");

        h1.removeGuest("Peter");
        h1.removeGuest("MyAss");


        Hotel.percentage();
        Hotel.mostRevenue();
        printInfo();
    }
}

