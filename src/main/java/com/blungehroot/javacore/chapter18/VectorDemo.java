package com.blungehroot.javacore.chapter18;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(3, 2);
        System.out.println("Haчaльный размер вектора : " + v.size());
        System.out.println("Haчaльнaя емкость вектора : " + v.capacity());
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);

        System.out.println("Емкость ве ктора после ввода четырех элементов : " + v.capacity());
        v.addElement(5);
        System.out.println("Teкyщaя емкость вектора : " + v.capacity());
        v.addElement(6);
        v.addElement(7);
        System.out.println("Teкyщaя емкость вектора v: " + v.capacity());
        v.addElement(9);
        v.addElement(10);
        System.out.println("Teкyщaя емкость вектора : " + v.capacity());
        v.addElement(11);
        v.addElement(12);
        System.out.println("Первый элемент вектора : " + v.firstElement());
        System.out.println("Последний элемент вектора : " + v.lastElement());
        if (v.contains(3))
            System.out.println("Beктop содержит З.");

        Enumeration<Integer> vEnum = v.elements();
        System.out.println("Элeмeнты вектора:");
        while (vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement() + " ");
        System.out.println();
    }
}