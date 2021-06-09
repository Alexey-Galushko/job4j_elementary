package ru.job4j.condition;

public class Point {
    public static double distance(double x1, double y1, double x2, double y2) {
        double rsl1 = x2 - x1;
        double rsl2 = y2 - y1;
        double rsl3 = Math.pow(rsl1,2);
        double rsl4 = Math.pow(rsl2,2);
        double rsl5 = rsl3 + rsl4;
        return Math.sqrt(rsl5);
    }

    public static void main(String[] args) {
        double result1 = Point.distance(3, 4, 2, 3);
        double result2 = Point.distance(30, 40, 20, 30);
        double result3 = Point.distance(33.5, 44.5, 22.5, 33.5);
        System.out.println("result1 (3, 4) to (2, 3) " + result1);
        System.out.println("result2 (30, 40) to (20, 30) " + result2);
        System.out.println("result2 (33, 44) to (22, 33) " + result3);
    }
}