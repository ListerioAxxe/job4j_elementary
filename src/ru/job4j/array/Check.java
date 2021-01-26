package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean rsl = data[0];
        for (int i = 0; i < data.length; i++) {
            if (rsl == data[data.length -1 -i]) {
               rsl = true;
            }
            else {
                rsl = false;
            }
        }
        return rsl;
    }
}
