package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class Fridge {
    String brand;
    int year;
    double height;
    String color;
    static ArrayList<Fridge> all = new ArrayList<Fridge>();
    ArrayList<String> products = new ArrayList<String>();

    public Fridge(String brand, int year, double height, String color) {
        this.brand = brand;
        this.year = year;
        this.height = height;
        this.color = color;
        all.add(this);
    }

    void addProduct(String product) {
        if (product == null) {
            System.out.println(null + " is not a valid one");
            return;
        }
        this.products.add(product);
    }

    static void printUniqueProductCount() {
        HashSet<String> uniqueProducts = new HashSet<String>();
        for (Fridge f : all) {
            uniqueProducts.addAll(f.products);
        }
        System.out.println("Unique count : " + uniqueProducts.size());
    }

    static void printFullestFridge() {
        if (all.isEmpty()) {
            System.out.println("Zero fridges?");
            return;
        }
        Fridge fullest = all.get(0);
        for (Fridge f : all) {
            if (f.products.size() > fullest.products.size()) {
                f = fullest;
            }
        }
        System.out.println("The fullest fridge is " + fullest.brand + " with " + fullest.products.size() + " products inside");
    }

    static void getSmallestFridge() {
        if (all.isEmpty()) {
            System.out.println("Zero fridges?");
            return;
        }
        Fridge smallest = all.get(0);
        for (Fridge x : all) {
            if (x.height < smallest.height) {
                smallest = x;
            }
        }
        System.out.println("The smallest fridge is " + smallest.brand + " with the size of " + smallest.height);
    }

}
