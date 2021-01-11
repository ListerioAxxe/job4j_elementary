package ru.job4j.condition;

public class StringEq {
    public static void menu(String name) {
        if (name.equals("tanks")) {
            System.out.println("Start game tanks");
        }
        if (name.equals("mario")) {
            System.out.println("Start game Mario");
        }
        if (name.equals("tetris")) {
            System.out.println("Start game tetris");
        }

    }
        public static void main(String[] args) {
            menu("mario");
        }
    }
