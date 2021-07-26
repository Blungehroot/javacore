package com.blungehroot.javacore.chapter18;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j, k;

        i = aStr.lastIndexOf(" ");
        j = bStr.lastIndexOf(" ");
        k = aStr.substring(i).compareTo(bStr.substring(j));

        if (k == 0) {
            return aStr.compareTo(bStr);
        } else {
            return k;
        }
    }
}

class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<>(new TComp());

        tm.put("Джoн Доу", 3434.34);
        tm.put("Toм Смит", 123.22);
        tm.put("Джейн Бейкер", 1378.00);
        tm.put("Toд Халл", 99.22);
        tm.put("Paльф Смит", -19.08);

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        double balance = tm.get("Джoн Доу");
        tm.put("Джoн Доу", balance + 1000);
        System.out.println("Hoвый остаток на счете Джона Доу : " + tm.get("Джoн Доу"));
    }
}
