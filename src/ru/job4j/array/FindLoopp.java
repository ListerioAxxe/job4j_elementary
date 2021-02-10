package ru.job4j.array;

public class FindLoopp {
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i = start; i <= finish; i++) {
            if (el == data[i]) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}