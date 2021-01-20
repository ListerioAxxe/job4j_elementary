package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int index = 2; index <= number - 1; index++) {
            if ((number % index) == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
    public static int calc(int finish) {
        int count = 0;
        for (int number = 1; number <= finish; number++ ) {
            if (CheckPrimeNumber.check(number)) {
                count++;
            }
        }
        return count;
    }
}