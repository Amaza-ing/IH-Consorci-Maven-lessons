package com.ironhack.w2.d1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("A Clockwork Orange", 130);
        Movie movie2 = new Movie("The Shining", 120);
        List<Movie> movieList = new ArrayList<>();
        movieList.add(movie1);
        movieList.add(movie2);
        Director director = new Director("Stanley", "Kubrick", movieList);

        System.out.println(director);
        System.out.println(director.getDirectedMoviesSize());
        System.out.println(director.getFullName());
    }
}
