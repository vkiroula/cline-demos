package com.example;

public class Assertions {

    public static void assertEquals(int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError("Expected: " + expected + " but was: " + actual);
        }
    }

}
