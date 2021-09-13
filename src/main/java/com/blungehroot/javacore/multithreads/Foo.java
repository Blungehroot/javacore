package com.blungehroot.javacore.multithreads;

public class Foo {

    public void first() {
        System.out.println(Thread.currentThread().getName());
        System.out.print("first");
    }

    public void second() {
        System.out.println(Thread.currentThread().getName());
        System.out.print("second");
    }

    public void third() {
        System.out.println(Thread.currentThread().getName());
        System.out.print("third");
    }

}
