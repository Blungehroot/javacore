package com.blungehroot.javacore.multithreads;

import java.util.concurrent.Semaphore;

import static java.lang.Thread.sleep;

public class Foo {
    private boolean access = false;
    Semaphore semaphore = new Semaphore(1);
    Semaphore semaphore2 = new Semaphore(1);


    public void first(Runnable r) {
        try {
                semaphore.acquire();
                sleep(300);
                System.out.print("first");

                sleep(300);
                access = true;
                semaphore.release();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void second(Runnable r) {
        try {

            semaphore2.acquire();
            sleep(300);
            System.out.print("second");

            sleep(300);
            semaphore2.release();


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void third(Runnable r) {
        try {

                semaphore2.acquire();
                sleep(300);
                System.out.print("third");

                sleep(300);
                semaphore2.release();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
