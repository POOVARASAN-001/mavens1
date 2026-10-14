package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testEvenNumber() {
        App app = new App();
        assertTrue(app.isEven(4));
    }

    @Test
    public void testOddNumber() {
        App app = new App();
        assertFalse(app.isEven(7));
    }
}
