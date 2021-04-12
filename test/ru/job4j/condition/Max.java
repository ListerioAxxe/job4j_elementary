package ru.job4j.condition;

public class Max {

    public int max(int left, int right) {
        return Math.max(left, right);
    }

    public int max(int left, int right, int middle) {
        return max(left, max(right, middle));
    }


}