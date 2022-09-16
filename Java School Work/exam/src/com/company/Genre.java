package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class Genre {
    String name;
    int minAge;
    int maxAge;
    static ArrayList<Genre> all = new ArrayList<>();
    ArrayList<String> movies = new ArrayList<>();

    Genre(String name, int minAge, int maxAge) {
        this.name = name;
        this.minAge = minAge;
        this.maxAge = maxAge;
        all.add(this);
    }

    public void addMovie(String movie) {
        if (movie.length() < 2 || movie == null) {
            System.out.println("Ayo which movie is shorter than 2 characters other than IT? And we dont tolerate clowns here.");
            return;
        }
        this.movies.add(movie);
    }

    public static void getLongestMovieName() {
        String longest = "";
        int movieLength = 0;
        Genre a = null;
        for (Genre g : all) {
            for (int i = 0; i < g.movies.size(); i++) {
                if (g.movies.get(i).length() > longest.length()) {
                    longest = g.movies.get(i);
                    a = g;
                    movieLength = g.movies.get(i).length();
                }
            }
        }
        if (a == null) {
            System.out.println("Sum aint right brody");
        }
        assert a != null;
        System.out.println("The longest move name is " + longest + " from the category: " + a.name + " with a character length of " + movieLength);
    }

    public static void getFewestCategory() {
        int most = 0;
        Genre a = null;
        for (Genre g : all) {
            if (g.movies.size() > most) {
                most = g.movies.size();
                a = g;
            }
        }
        int least = most;
        Genre x = null;
        for (Genre g : all) {
            if (g.movies.size() < least) {
                least = g.movies.size();
                x = g;
            }
        }
        assert x != null;
        System.out.println("The category with the least amount of movies is: " + x.name + " with " + least + " movies" + " while " + a.name + " has " + most + " movies");
    }

    static void whatCanYouWatch(int age) {
        ArrayList<String> categories = new ArrayList<>();
        if(age<2||age>70){
            System.out.println("No movies for you bro. Aint no way you fr "+age+" old.");
            return;
        }
        for (Genre g : all) {
            if (age >= g.minAge & g.maxAge >= age) {
                categories.add(g.name);
            }
        }
        System.out.println("With the age of " + age + ". You can watch these categories:" + categories);
    }

    static void printUniqueMovies() {
        HashSet<String> uniqueMovies = new HashSet<>();
        for (Genre g : all) {
            uniqueMovies.addAll(g.movies);
        }
        System.out.println("All unique movies: " + uniqueMovies);

    }

    static void printInfo() {
        for (Genre g : all) {
            System.out.println(g.name + " has a min and max age limit of " + g.minAge + " & " + g.maxAge + " and contains these movies " + g.movies);
        }
    }

}
