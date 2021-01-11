package ru.job4j.condition;

public class Cinema {
    public static void acces(int age) {
        System.out.println("The age of customer " + age);
        if (age >= 18) {
            System.out.println("Yes you can in ");
        } else {
            System.out.println("No,you cant in ");
        }
    }

        public static void main(String[] args) {
         Cinema.acces(21);
         Cinema.acces(16);

        }
}

