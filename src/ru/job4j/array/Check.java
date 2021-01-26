package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean rsl = data[0] = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != rsl) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
