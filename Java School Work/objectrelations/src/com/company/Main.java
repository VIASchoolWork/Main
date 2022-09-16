package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cat c1 = new Cat("Snowball", 3);
        Cat c2 = new Cat("Rizhais", 7);
        Cat c3 = new Cat("Juris", 6);
        Cat c4 = new Cat("Furball", 10 );
        Cat c5 = new Cat("Garry",6);

        //Cat c4 = new Cat("Banans", 8);
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(c1);
        cats.add(c2);
        cats.add(c3);
        cats.add(c4);
        cats.add(c5);

        Person p1 = new Person("Pam", 23, c1);
        Person p2 = new Person("Erine", 24, c2);
        Person p3 = new Person("Andy", 32, c3);
        Person p4 = new Person("Dwight", 31, c4);
        Person p5 = new Person("Michael", 40,c5);
        ArrayList<Person> persons = new ArrayList<>();

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);


        p1.cat = c1;
       // p2.cat = c2;
        p3.cat = c3;
        p4.cat = c4;
        p5.cat = c5;

        c1.owner = p1;
        c2.owner = p2;
        c3.owner = p3;
        c4.owner = p4;
        c5.owner = p5;

        //   System.out.println(p2.cat.owner.cat.name);
        p1.whereOwner(p2);
        //   System.out.println(p2.cat.owner.cat.name);
        //   System.out.println(c4.owner.cat.owner.name);
        c3.newCatMuch(c4);
        //  System.out.println(c4.owner.cat.owner.name);

        try {
        //    System.out.println(p1.callCat());
          //  System.out.println(p2.callCat());
            //System.out.println(p3.callCat());
        }catch (NullPointerException e){
            System.out.println("There is no Cat or he doesnt have an owner man");
        }
        try {
     //       System.out.println(c2.callOwner());
        }catch (NullPointerException e){
            System.out.println("There is no Owner bro :(");
        }
        System.out.println("\n");

        for(int i = 0; i<cats.size();i++){
            System.out.println(cats.get(i).name + " is owned by " + cats.get(i).owner.name + " and the owner is "+ cats.get(i).owner.age+" old, but the cat is "+cats.get(i).age+" old.");
        }


    }
}
