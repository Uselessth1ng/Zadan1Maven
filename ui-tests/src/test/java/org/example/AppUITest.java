package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AppUITest {

    @Test
    void multiplication() {
        assertEquals(2, 2 * 1);
    }

    @Test
    @Tag("smoke")
    void division() {
        assertEquals(2, 4 / 2);
    }


    @Test
    void equality() {
        assertEquals(2, 2);
    }

}