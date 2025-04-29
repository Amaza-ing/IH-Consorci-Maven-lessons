package com.ironhack.w2.d2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getHarryPotter_noParams_getEqualBooks() {
        Book expectedBook = new Book(9876, "Harry Potter", "J.K. Rowling", 1997);
        assertEquals(expectedBook, Book.getHarryPotter());
    }
}