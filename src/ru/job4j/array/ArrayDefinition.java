package ru.job4j.array;

import java.util.Arrays;
import java.util.spi.CalendarNameProvider;

public class ArrayDefinition {
    public static void main(String[] args) {
       String[] names = new String[4];
       names[0] = "Evgen";
       names[1] = "Vika";
       names[2] = "Kazir";
       names[3] = "Vasya";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
