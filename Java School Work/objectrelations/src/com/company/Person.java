package com.company;

public class Person {
    String name;
    int age;
    Cat cat;

    Person(String name, int age, Cat cat){
        this.name = name;
        this.age = age;
        this.cat = cat;
    }

    public String callCat(){
        try {
            return name + " owns " + cat.name + " and its age is " + cat.age + " and is owned by"+
                    cat.owner.name;
        } catch (NullPointerException e) {
            return "Yo man they aint even got a cat";
        }
    }

    void whereOwner(Person newOwner){
        if(newOwner == null){
            System.out.println("Cant be empty bro, we need owners for these strays, take one please");
        }
        if(this.cat.owner == null){
            assert newOwner != null;
            newOwner.cat.owner = this;
            System.out.println("Oh no buddy wont work. " + this.cat.name + " is already owned by " + newOwner.name);
        }
        if (newOwner != null && this.cat.owner.age< newOwner.age){
            this.cat.owner = null;
            newOwner.cat.owner = this;
            this.cat.owner = newOwner.cat.owner;


            System.out.println(newOwner.name+" is the new owner of "+ cat.name + " because she is older than " + this.name+ " and probably is better at keeping a cat happy ;)");

        }
    }

}
