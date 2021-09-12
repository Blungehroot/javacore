package com.blungehroot.javacore.multithread;

import java.util.concurrent.CompletableFuture;

public class ThreadTest {
    Foo foo = new Foo();

    CompletableFuture<Void> cf1 = CompletableFuture.runAsync(
            () -> foo.first()
    );

    CompletableFuture<Void> cf2 = CompletableFuture.runAsync(
            () -> foo.second()
    );

    CompletableFuture<Void> cf3 = CompletableFuture.runAsync(
            () -> foo.third()
    );

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
