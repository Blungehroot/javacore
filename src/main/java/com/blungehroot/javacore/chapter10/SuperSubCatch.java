package com.blungehroot.javacore.chapter10;

public class SuperSubCatch {
    public static void main(String[] args) {
        try{
            int a = 0;
            int b = 42 / a;
        } catch (Exception e){
            System.out.println("Catch exception");
        } /*catch (ArithmeticException e) {
            System.out.println("The program dosn't get to this point");
        }*/
    }
}
