package com.blungehroot.javacore.multithreads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            ThreadTest threadTest = new ThreadTest();

            threadTest.getCf1().join();
            if (threadTest.getCf1().isDone()) {
                threadTest.getCf2().join();
                if (threadTest.getCf2().isDone()) {
                    threadTest.getCf3().join();
                    if (threadTest.getCf3().isDone()){
                        System.out.println();
                    }
                }
            }
        }

        System.out.println("Main thread is finished");
    }
}

class ThreadTest {
    Foo foo = new Foo();

    CompletableFuture<Void> cf1 = CompletableFuture.runAsync(() -> foo.first());

    CompletableFuture<Void> cf2 = CompletableFuture.runAsync(() -> foo.second());

    CompletableFuture<Void> cf3 = CompletableFuture.runAsync(() -> foo.third());

    public CompletableFuture<Void> getCf1() {
        return cf1;
    }

    public CompletableFuture<Void> getCf2() {
        return cf2;
    }

    public CompletableFuture<Void> getCf3() {
        return cf3;
    }
}