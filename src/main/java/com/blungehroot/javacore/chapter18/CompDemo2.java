package com.blungehroot.javacore.chapter18;

import java.util.TreeSet;

public class CompDemo2 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>((aStr, bStr) -> bStr.compareTo(aStr));
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("Е");
        ts.add("F");
        ts.add("D");

        for (String element : ts)
            System.out.print(element + " ");

        System.out.println();
    }
}