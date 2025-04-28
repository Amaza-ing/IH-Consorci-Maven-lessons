package com.ironhack.w2.d1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DirectorTest {

    public static List<Movie> movieList;
    public static Director director;

    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeAll is the first executed method");

        Movie movie1 = new Movie("A Clockwork Orange", 130);
        Movie movie2 = new Movie("The Shining", 120);
        movieList = new ArrayList<>();
        movieList.add(movie1);
        movieList.add(movie2);
    }

    @BeforeEach
    void setUp() {
        System.out.println("BeforeEach is executed before each test");

        director = new Director("Stanley", "Kubrick", movieList);
    }

    @AfterEach
    void tearDown() {
        System.out.println("AfterEach is executed after each test");
    }

    @Test
    void getDirectedMoviesSize() {
        int directedMoviesSize = director.getDirectedMoviesSize();
        System.out.println("Directed movies size: " + directedMoviesSize);

        assertEquals(2, directedMoviesSize);
    }

    @Test
    void getFullName() {
        String fullName = director.getFullName();
        System.out.println("Full name: " + fullName);

        assertEquals("Stanley Kubrick", fullName);
    }
}