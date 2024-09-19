package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    @Tag("smoke")
    void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    void subtraction() {
        assertEquals(2, 3 - 1);
    }

}