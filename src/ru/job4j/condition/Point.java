package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rls1 = x2-x1;
        double rls2 = y2-y1;
        return Math.sqrt(Math.pow(rls1,2))+ Math.pow(rls2,2);

    }

    public static void main(String [] args) {
        double result = Point.distance(0,0,2, 0);
        System.out.println("result (0,0) to (2,0)  " + result);

        double result1 = Point.distance(0,0,4,0);
        System.out.println("result (0,0) to (4,0)  " + result1);

    }
}
