package ru.job4j.condition;

public class Club {
    public static void permission(boolean hasMoney, boolean beFriend) {
        if (hasMoney || beFriend) {
            System.out.println("Yes,you can");
        }
        else {
            System.out.println("No,you cant");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}
