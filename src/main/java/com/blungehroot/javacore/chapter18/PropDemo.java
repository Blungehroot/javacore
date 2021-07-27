package com.blungehroot.javacore.chapter18;

import java.util.Properties;
import java.util.Set;

public class PropDemo {
    public static void main(String[] args) {
        Properties capitals = new Properties();
        capitals.put("Иллинойс", "Спрингфилд");
        capitals.put("Миссури", "Джефферсон-Сити");
        capitals.put("Вашингтон", "Олимпия");
        capitals.put("Калифорния", "Сакраменто");
        capitals.put("Индиана ", "Индианаполис");

        Set<?> states = capitals.keySet();
        for (Object name : states)
            System.out.println("Cтoлицa штата " + name + " - " +
                    capitals.getProperty((String) name) + ".");
        System.out.println();

        String str = capitals.getProperty("Флopидa", "не найдена");
        System.out.println("Cтoлицa штата Флорида " + str + ".");
    }
}
