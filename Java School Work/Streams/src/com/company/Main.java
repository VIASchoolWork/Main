package com.company;

import java.util.*;
import java.util.stream.DoubleStream;

public class Main {

    public static void main(String[] args) {
        Config.generate();
        System.out.println("Average salary is : " + avgSalary());
        System.out.println("Oldest working pensioner from Valmiera: " + oldestinValmiera());
        System.out.println("AVG $ of Dr : " + avgSalDr());
        System.out.println("Pet ammount: " + petAmount());
        System.out.println("Fluffy pets: " + fluffyAmount());
        System.out.println("The average age in the city of the youngest person " + avgAgeOfYoungestCity());
        System.out.println("Amount of unique surnames: " + uniqueSurnames());
        System.out.println("Amount of unique names: " + uniqueNames());

    }

    static OptionalDouble avgSalary() {
        DoubleStream salary = Person.all.stream().filter(Person::isAdult).mapToDouble(x -> x.salary);
        return salary.average();
    }

    static double avgSalDr() {
        DoubleStream x = Person.all.stream().filter(a -> a.firstName.contains("Dr.")).mapToDouble(a -> a.salary);
        return x.average().getAsDouble();
    }

    static String oldestinValmiera() {
        Person p = Person.all.stream().filter(x -> x.city.equals("Valmiera")).filter(x -> x.isWorking).filter(Person::isPensioner).max(Comparator.comparingInt(per -> per.age)).get();
        return p.getFullname();
    }

    static int petAmount() {
        return Person.all.stream().map(x -> x.pets.size()).mapToInt(Integer::intValue).sum();
    }

    static int fluffyAmount() {
        List<String> fluffy = Person.all.stream().flatMap(x -> x.pets.stream()).filter(x -> x.contains("Fluffy")).toList();
        return fluffy.size();
    }

    static String youngestcity() {
        Person a = Person.all.stream().min(Comparator.comparing(x -> x.age)).get();
        return a.city;
    }

    static OptionalDouble avgAgeOfYoungestCity() {
        DoubleStream a = Person.all.stream().filter(x -> x.city.contains(youngestcity())).mapToDouble(x -> x.age);
        return a.average();
    }

    static int uniqueSurnames() {
        HashSet<String> surnames = new HashSet<>();
        Person.all.forEach(x -> surnames.add(x.lastName));
        return surnames.size();
    }

    private static int uniqueNames() {
        return (int) Person.all.stream()
                .map(x->x.firstName)
                .map(name -> name.replaceFirst("Dr.", ""))
                .distinct()
                .count();
    }

}
