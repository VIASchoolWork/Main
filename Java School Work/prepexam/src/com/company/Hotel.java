package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class Hotel {
    String title;
    String city;
    int rooms;
    double pricePerRoom;
    static ArrayList<Hotel> all = new ArrayList<Hotel>();
    ArrayList<String> guests = new ArrayList<String>();

    public Hotel(String title, String city, int rooms, double pricePerRoom) {
        this.title = title;
        this.city = city;
        this.rooms = rooms;
        this.pricePerRoom = pricePerRoom;
        all.add(this);
    }

    void addGuest(String guest) {
        if (guest == null || guest.length() < 3) {
            System.out.println("Cant be null mate");
            return;
        }
        if (guests.size() >= this.rooms) {
            System.out.println("Rooms are full mate");
            return;
        }
        this.guests.add(guest);
    }

    void removeGuest(String guest) {
        if (guest == null || !this.guests.contains(guest)) {
            System.out.println(guest + " is not on the list, sorry.");
            return;
        }
        this.guests.remove(guest);
        System.out.println("The guest: " + guest + " has left the " + this.title + " hotel");
    }

    static void percentage() {
        double highest = 0;
        Hotel a = null;
        for (Hotel h : all) {
            double x = h.guests.size();
            double y = h.rooms;
            double percentage = x * 100 / y;
            if (percentage > highest) {
                highest = percentage;
                a = h;
            }
        }
        System.out.println("The fullest hotel is: " + a.title + " with a percentage of " + highest + "% full.");
    }

    static void mostRevenue() {
        //guests priceperroom
        double mostIncome = 0;
        Hotel a = null;
        int days = 1;//change the number deppending of the time period the calculations need to be
        for (Hotel h : all) {
            double x = h.pricePerRoom;
            double y = h.guests.size();
            double income = x * y * days;
            if (income > mostIncome) {
                mostIncome = income;
                a = h;
            }
        }
        System.out.println("The hotel that is getting the most income is: " + a.title + " with the income of: " + mostIncome + " over " + days + " day(s).");


    }

    static void printInfo() {
        for (Hotel h : all) {
            System.out.println(h.title + " in the city of " + h.city + " costs " + h.pricePerRoom + "" +
                    " per night. Now " + (h.rooms - h.guests.size()) + " rooms out of " + h.rooms + " are available");
        }
    }
}
