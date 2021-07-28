package com.blungehroot.javacore.practice.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedCollection {

    public static void main(String[] args) {
        List<Integer> arrOne = new ArrayList<>();
        List<Integer> arrSecond = new ArrayList<>();

        arrOne.add(6);
        arrOne.add(4);
        arrOne.add(6);
        arrOne.add(8);
        arrOne.add(1);
        arrOne.add(100);
        arrOne.add(-100);

        arrSecond.add(3);
        arrSecond.add(8);
        arrSecond.add(76544);
        arrSecond.add(-42);
        arrSecond.add(100);
        arrSecond.add(1);

        duplicateValueListWithOrder(arrOne, arrSecond).forEach(value -> System.out.println("Sorted value: " + value));
    }

    public static List<Integer> duplicateValueListWithOrder(List<Integer> arr, List<Integer> arr2) {
        arr.retainAll(arr2);
        Collections.sort(arr);
        return arr;
    }
}
