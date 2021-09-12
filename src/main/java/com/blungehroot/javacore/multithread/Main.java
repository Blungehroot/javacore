package com.blungehroot.javacore.multithread;

public class Main {

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();

        for (int i = 0; i < 100; i++) {
            threadTest.getCf1();
            if (threadTest.getCf1().isDone()) {
                threadTest.getCf2().join();
                if (threadTest.getCf2().isDone()) {
                    threadTest.getCf3().join();
                    if (threadTest.getCf3().isDone()) {
                        System.out.println();
                    }
                }
            }
        }
    }
}
