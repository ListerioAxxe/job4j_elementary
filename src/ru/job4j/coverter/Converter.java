package ru.job4j.coverter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rs1 = value / 70;
                return rs1;
    }
    public static int rubletoDollar(int value) {
        int rs1 = value / 60;
                return rs1;
    }
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(280);
                System.out.println("280 rubles "+ euro + " euro");
        int dollar = Converter.rubletoDollar(120);
                System.out.println("120 rubles " + dollar + " dollar");
    }
}
