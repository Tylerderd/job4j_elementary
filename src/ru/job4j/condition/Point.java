package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double subtractionX = x2 - x1;
        double subtractionY = y2 - y1;
        double powSubtractionX = Math.pow(subtractionX, 2);
        double powSubtractionY = Math.pow(subtractionY, 2);
        double sum = powSubtractionX + powSubtractionY;
        return Math.sqrt(sum);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(3, 4, 0, 0);
        double result3 = Point.distance(-5, -6, 6, 4);

        System.out.println("result (0, 0) to (2, 0) is " + result);
        System.out.println("result (3, 4) to (0, 0) is " + result2);
        System.out.println("result (-5, -6) to (6, 4) is " + result3);
    }
}
