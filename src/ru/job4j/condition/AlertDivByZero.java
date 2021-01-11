package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(-5);
        possibleDiv(-1);
    }

    public static void possibleDiv(int x) {
        if (x < 0) {
            System.out.println("This is negative numbers");
        }
        }

    }
