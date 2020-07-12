package com.euler;

import org.junit.Test;

public class MathTest {



    @Test
    public void testAddition(){

        Math math = new Math();
        math.setX(5);
        math.setY(2);

        System.out.println(math.addition());
        System.out.println(math.subtraction());
    }
}
