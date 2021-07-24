package com.blungehroot.javacore.chapter18;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        System.out.println(" Начальный размер списочного массива a l : " + al.size());

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "А2");

        System.out.println(" Размер списочного массива al после ввода элементов : " + al.size());
        System.out.println("Coдepжимoe списочного массива al : " + al);

        al.remove ("F") ;
        al.remove (2) ;

        System.out.println("Размер сnисочного массива al после удаления элементов : " + al.size());
        System.out.println("Coдepжимoe списочного массива al : " + al);
    }
}
