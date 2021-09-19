package com.blungehroot.javacore.chapter10;

public class Exc2 {
    public static void main(String[] args) {
        int d, a;

        try {
            d =0;
            a = 42 / d;
            System.out.println(" It's will not be displayed");
        } catch (ArithmeticException e){
            System.out.println("dividing by zero");
        }
        System.out.println("After catch exception");
    }
}
