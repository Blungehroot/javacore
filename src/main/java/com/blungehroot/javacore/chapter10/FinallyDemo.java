package com.blungehroot.javacore.chapter10;

public class FinallyDemo {
    static void procA() {
        try {
            System.out.println("body in method procA()");
            throw new RuntimeException("Demo");
        } finally {
            System.out.println("Block of finally in method procA()");
        }
    }

    static void procB() {
        try {
            System.out.println("body in method procB()");
            return;
        } finally {
            System.out.println("Block of finally in method procB()");
        }
    }

    static void procC() {
        try {
            System.out.println("body in method procC()");
        } finally {
            System.out.println("Block of finally in method procC()");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Exception is intercepted");
        }
        procB();
        procC();
    }
}
