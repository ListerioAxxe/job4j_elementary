package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubletoDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(280);
        System.out.println("280 rubles " + euro + " euro ");

        int dollar = Converter.rubletoDollar(120);
        System.out.println("120 rubles " + dollar + " dollar ");
    }

}
