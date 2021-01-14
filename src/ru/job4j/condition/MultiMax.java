package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
       int rsl = Math.max(first, second);
        return Math.max(rsl, third);

    }
}
