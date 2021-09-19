package com.blungehroot.javacore.multithreads;

import java.util.concurrent.Semaphore;

import static java.lang.Thread.sleep;

public class Foo {
    Semaphore semaphore = new Semaphore(1);
    Semaphore semaphore2 = new Semaphore(1);

    public void first(Runnable r) {
        try {
            semaphore.acquire(1);
            System.out.print("first");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void second(Runnable r) {
        try {
            semaphore2.acquire(1);
            System.out.print("second");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void third(Runnable r) {
        try {
            semaphore2.acquire(1);
            System.out.print("third");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
