package ru.job4j.condition;

public class Cinema1 {
    public static void permission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) System.out.println("Yes,you can");
        else System.out.println("No,you cant");
    }
    public static void main(String[] args) {
        permission(false, true);
    }
}
