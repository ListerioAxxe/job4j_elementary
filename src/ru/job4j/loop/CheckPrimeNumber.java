package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for (int index = 2; index <= number; index++) {
            if ((index % number) == 0 && (index % 2) != 0) {
                prime = true;
                break;
            }
        }
        return prime;
    }
}