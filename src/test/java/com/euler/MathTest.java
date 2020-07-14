package com.euler;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathTest {

    Math math;

    @Before
    public void setUp() throws Exception {
        math = new Math();
        math.setX(5);
        math.setY(2);
    }

    @After
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