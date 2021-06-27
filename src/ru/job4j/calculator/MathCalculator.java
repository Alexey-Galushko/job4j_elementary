package ru.job4j.calculator;

import ru.job4j.math.MathFunction;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }
    public static double subtrAndDiv(double first, double second) {
        return MathFunction.subtr(first, second)
                + MathFunction.div(first, second);
    }
    public static double sumAndMultiplyAndSubtrAndDiv(double first, double second, double third, double fourth) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second)
                    + MathFunction.subtr(first, second)
                        + MathFunction.div(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subtrAndDiv(10, 20));
        System.out.println("Результат расчета равен: " + sumAndMultiplyAndSubtrAndDiv(2, 5, 6, 7));
    }
}