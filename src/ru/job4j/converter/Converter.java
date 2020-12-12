package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euros. Test result : " + passed);

        int in2 = 120;
        int expected2 = 2;
        int out2 = Converter.rubleToDollar(in);
        boolean passed2 = expected2 == out2;
        System.out.println("120 rubles are 2 dollars. Test result : " + passed);

        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(14000);
        System.out.println("140 rubles are " + euro + " euros.");
        System.out.println("14000 rubles are " + dollar + " dollars.");
    }
}
