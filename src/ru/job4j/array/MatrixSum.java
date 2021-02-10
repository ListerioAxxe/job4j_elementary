package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int row = 0; row < array.length; row++) {  //цикл по строке
            for (int cell = 0; cell < array[row].length; cell++) {  //цикл по столбцу проходит (учитывая строку)
                rsl += array[row][cell];   //суммирует каждый элемент массива
            }
        }
        return rsl;
    }
}
