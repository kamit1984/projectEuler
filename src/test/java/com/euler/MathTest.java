package com.euler;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MathTest {

    Math math;

    @BeforeTest
    public void setUp() throws Exception {
        math = new Math();
        math.setX(5);
        math.setY(2);
    }

    @AfterTest
    public void tearDown() throws Exception {
    }

    @Test
    public void addition() {
        int out = math.addition();
        assert out == 7;
    }

    @Test
    public void subtraction() {

        int out = math.subtraction();
        assert out == 3;
    }
}