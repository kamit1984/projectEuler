package com.euler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Create by Amit on 10/2/20
 */
public class EulerProblems {

    public boolean isThisAPrimeNumber(Long numberToCheck){
        for (int i = 2; i <= numberToCheck/2 ; i++) {
            if(numberToCheck % i == 0 ){
                return false;
            }
        }
        return true;
    }

    public List<Long> getAllFactorsOfNumber(long number) {
        List<Long> factors =  new ArrayList<Long>();
        for (long i = 1; i <= (number/2); i++) {
            if(number % i == 0){
                factors.add(i);
                System.out.printf(i+ " ");
            }
        }
        return factors;
    }

    public boolean isNumberPalindrome(int number){
        String numberToCheck = String.valueOf(number);
        List<String> originalOrder = Arrays.asList(numberToCheck.split(""));
        List<String> reversedOrder = new ArrayList<>() ;
        reversedOrder.addAll(originalOrder);
        Collections.reverse(reversedOrder);
//        System.out.println("originalOrder" + originalOrder);
//        System.out.println("reversedOrder" + reversedOrder);
        if(originalOrder.equals(reversedOrder)){
            return true;
        }else{
            return false;
        }
    }

    public int getLargestPalindromeOfProductOfTwoNumbers(int small, int big){
        List<Integer> palindromes = new ArrayList<>();

        for (int i = small; i <= big ; i++) {
            for (int j = small; j <=big ; j++) {
                int product = i * j;
                if(isNumberPalindrome(product)){
                    palindromes.add(product);
                }
            }
        }

        Collections.sort(palindromes);
        int largestProduct = palindromes.get(palindromes.size() - 1);
        return largestProduct;
    }
}
