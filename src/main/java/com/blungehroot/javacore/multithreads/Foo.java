package com.blungehroot.javacore.multithreads;

import java.util.concurrent.Semaphore;

import static java.lang.Thread.sleep;

public class Foo {
    Semaphore semaphore = new Semaphore(3, true);

    public synchronized void first(Runnable r) {
        try {
            while (semaphore.availablePermits() != 3) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            semaphore.acquire(3);
            sleep(300);
            System.out.print("first");
            sleep(300);
            semaphore.release(2);
            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void second(Runnable r) {
        while (semaphore.availablePermits() != 2) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            semaphore.acquire(2);
            sleep(300);
            System.out.print("second");
            sleep(300);
            semaphore.release(1);
            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void third(Runnable r) {
        while (semaphore.availablePermits() != 1) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            semaphore.acquire();
            sleep(300);
            System.out.print("third");
            sleep(300);
            semaphore.release();
            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
