package com.blungehroot.javacore.multithreads;

import java.util.concurrent.Semaphore;

import static java.lang.Thread.sleep;

public class Foo {
    Semaphore semaphore = new Semaphore(2, true);

    public synchronized void first(Runnable r) {
        try {
            semaphore.acquire(2);

            System.out.print("first");

            semaphore.release(2);
            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void second(Runnable r) {
        try {
            this.wait();
            semaphore.acquire();

            System.out.print("second");

            semaphore.release();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void third(Runnable r) {
        try {
            this.wait();
            semaphore.acquire(2);

            System.out.print("third");

            semaphore.release(2);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
