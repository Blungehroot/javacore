package com.blungehroot.javacore.chapter10;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a= " + a);
            int b = 42 / a;
            int c[] = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("divide by zero: " + e);
        } catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Index error " + e);
        }
        System.out.println("after catchs blocks");
    }
}
