package com.blungehroot.javacore.chapter18;

public class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Address(String n, String s, String с, String st, String cd) {
        name = n;
        street = s;
        city = с;
        state = st;
        code = cd;
    }

    public String toString() {
        return name + " \n" + street +"\n" +
                city + " " + state + " " + code;
    }
}
