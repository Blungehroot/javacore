package com.blungehroot.javacore.multithreads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();
        Runnable r = () -> {

        };
        CompletableFuture<Void> cf1 = CompletableFuture.runAsync(() -> foo.second(r));

        CompletableFuture.runAsync(() -> foo.third(r));

        CompletableFuture.runAsync(() -> foo.first(r));

        try {
            cf1.get();
            Thread.sleep(1000);
        } catch (InterruptedException | ExecutionException e) {
        }
    }
}