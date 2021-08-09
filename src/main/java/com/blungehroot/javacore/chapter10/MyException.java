package com.blungehroot.javacore.chapter10;

public class MyException extends Exception {
    private int detail;

    MyException(int a) {
        detail = a;
    }

    public String toString() {
        return "MyException[" + detail + "]";
    }
}

class ExceptionDemo {
    static void compute(int a) throws MyException {
        System.out.println("Called method compute(" + a + ")");
        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("Normal finishing");
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (Exception e) {
            System.out.println("Catched interception:  " + e);
        }
    }
}
