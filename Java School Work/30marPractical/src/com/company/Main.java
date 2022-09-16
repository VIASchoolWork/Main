package com.company;

import org.jetbrains.annotations.NotNull;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        callMarriage("Dre", "producer");
        ArrayList<String> things = new ArrayList<String>();
        things.add("party");
        things.add("study");
        things.add("food");
        checkForitem("food", things);
        System.out.println(isGuyCool("Chuck Norris",20));
        System.out.println(isGuyCool("Ted",5));


    }

    static void callMarriage(String name, String relationship) {
        System.out.println("Hello, " + name + ". Will you be my " + relationship + "?");
    }


    static void checkForitem(String item, ArrayList<String> values) {
        if (values == null || values.size() == 0 || !values.contains(item)) {
            System.out.println("GG no " + item + " here");
            return;
        }
        if (values.contains(item)) {
            System.out.println("We have " + item + ".");
        }
    }

    static boolean isGuyCool(@NotNull String name, int age) {
        return name.equals("Chuck Norris") && age > 18 || name.contains("Magic") || name.contains("Doggo");
    }
}



