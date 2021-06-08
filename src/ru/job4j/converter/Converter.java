package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(1000);
        int dollar = Converter.rubleToDollar(1000);
        System.out.println("500 rubles are " + euro + " euro.");
        System.out.println("500 rubles are " + dollar + " dollar.");
    }
}