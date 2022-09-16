package com.company;

import static com.company.Genre.printInfo; // cuz why not lol makes it look cleaner when called :D


public class Main {

    public static void main(String[] args) {
        Genre g1 = new Genre("Horror", 18, 50);
        Genre g2 = new Genre("Comedy", 12, 70);
        Genre g3 = new Genre("Action", 14, 60);
        Genre g4 = new Genre("Cartoon", 2, 20);

        g1.addMovie("Morbius");
        g1.addMovie("Saw");
        g1.addMovie("Saw 2");
        g1.addMovie("Friday the 13th");

        g2.addMovie("Grown ups");
        g2.addMovie("Rush Hour");
        g2.addMovie("The Office");
        g2.addMovie("Taxi");
        g2.addMovie("Friends");

        g3.addMovie("Thor");
        g3.addMovie("Rush Hour");

        g4.addMovie("Adventure Time");
        g4.addMovie("Regular Show");
        g4.addMovie("The Simpsons");

        Genre.getLongestMovieName();
        Genre.getFewestCategory();
        Genre.whatCanYouWatch(10);
        Genre.whatCanYouWatch(23);
        Genre.whatCanYouWatch(70);
        Genre.whatCanYouWatch(100);
        Genre.printUniqueMovies();

        printInfo();


    }
}
