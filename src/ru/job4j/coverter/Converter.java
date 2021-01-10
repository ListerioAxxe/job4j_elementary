package ru.job4j.coverter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubletoDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(280);
                int in = 280;
                int expected = 4;
                int out = Converter.rubleToEuro(in);
                boolean passed = expected == out;
        System.out.println("280 rubles " + euro + " euro " + passed);

        int dollar = Converter.rubletoDollar(120);
                int in1 = 120;
                int expected1 = 2;
                int out1 = Converter.rubletoDollar(in);
                boolean passed1 = expected == out;
                System.out.println("120 rubles " + dollar + " dollar " + passed1);
    }

}
