package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MiniDiapason.findMin(data, i, data.length - 1);
            int minIndex = FindLoopp.indexOf(data, min, i, data.length - 1);
            int tmp = data[i];
            data[i] = data[minIndex];
            data[minIndex] = tmp;
        }
        return data;
    }
}
