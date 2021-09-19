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
            semaphore.release();
            semaphore.drainPermits();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void second(Runnable r) {
        while (semaphore.availablePermits() != 0) {
            try {
                semaphore2.acquire();
                System.out.print("second");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        semaphore2.release();
    }

    public void third(Runnable r) {
        while (semaphore.availablePermits() != 0) {
            try {
                semaphore2.acquire();
                System.out.print("third");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        semaphore2.release();
    }

}
