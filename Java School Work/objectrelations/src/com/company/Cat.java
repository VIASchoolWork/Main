package com.company;

public class Cat {
    String name;
    int age;
    Person owner;

    Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String callOwner(){
        return "The cats owner is "+ owner.name;
    }

    void newCatMuch(Cat newCat){
        if(newCat == null){
            System.out.println("Cant be empty bro, we need owners for these strays, take one please");
        }
        if(this.owner.cat == null){
            assert newCat != null;
            newCat.owner.cat = this;
            System.out.println("Oh no buddy wont work. " + this.owner.name + " already owns " + newCat.name);
        }
        if (newCat != null && this.owner.cat.age< newCat.age){
            this.owner.cat = null;
            newCat.owner.cat = this;
            this.owner.cat = newCat.owner.cat;


            System.out.println(newCat.name+" is the new cat of  "+ owner.name + " because he is older than " + this.name+ " and needs more attention ;)");

        }
    }
}
