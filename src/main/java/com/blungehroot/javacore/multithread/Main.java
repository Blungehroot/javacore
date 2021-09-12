package com.blungehroot.javacore.multithread;

public class Main {

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();

        for (int i = 0; i < 4000; i++) {
            threadTest.getCf1().join();
            threadTest.getCf2().join();
            threadTest.getCf3().join();
        }
    }
}

