package com.blungehroot.javacore.chapter18;

import java.util.Comparator;
import java.util.TreeSet;

public class Mycomp implements Comparator<String> {
    public int compare(String a, String b) {
        return a.compareTo(b);
    }
}

class CompDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(new Mycomp());
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for (String element : ts) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
