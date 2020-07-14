package com.Scratch;

public class tmp {

    private   int tmp1 ;
    private   String tmp2;

    @Override
    public String toString() {
        return "tmp{" +
                "tmp1=" + tmp1 +
                ", tmp2='" + tmp2 + '\'' +
                '}';
    }

    public static void main(String[] args) {
/*
        Integer a = Integer.valueOf(33);
        Integer b = Integer.valueOf("44");
        Integer c = new Integer("55");

        Integer d = 1;

        int e = d;
        System.out.println(e);
       */

        // Explicit casting
        int a = (int)33.33;
        Integer var = Integer.valueOf(a);
        System.out.println(var);

    // Single line if condition
        boolean out = (var instanceof Object) ? true : false;

//        int out  = ( 5 > 3) ? 5 : 3;
        System.out.println(out);
    }




}
