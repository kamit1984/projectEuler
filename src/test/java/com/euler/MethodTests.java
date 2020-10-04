package com.euler;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Create by Amit on 10/3/20
 */
public class MethodTests {

    EulerProblems eulerProblems = new EulerProblems();

    @Test
    public void testIsNumberPalindrome(){
        Assert.assertEquals(eulerProblems.isNumberPalindrome(101),true);
        Assert.assertEquals(eulerProblems.isNumberPalindrome(9999),true);
        Assert.assertEquals(eulerProblems.isNumberPalindrome(12345),false);
        Assert.assertEquals(eulerProblems.isNumberPalindrome(9876544),false);
        Assert.assertEquals(eulerProblems.isNumberPalindrome(1010101),true);
    }
}
