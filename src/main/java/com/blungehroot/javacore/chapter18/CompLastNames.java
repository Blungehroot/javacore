package com.blungehroot.javacore.chapter18;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CompLastNames implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;

        i = aStr.lastIndexOf(" ");
        j = bStr.lastIndexOf(" ");

        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}

class CompThenByFirstName implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;

        return aStr.compareToIgnoreCase(bStr);
    }
}

class TreeMapDemo2A {
    public static void main(String[] args) {
        CompLastNames compLN = new CompLastNames();
        Comparator<String> compLastThenFirst = compLN.thenComparing(new CompThenByFirstName());


        TreeMap<String, Double> tm = new TreeMap<>(compLastThenFirst);

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
