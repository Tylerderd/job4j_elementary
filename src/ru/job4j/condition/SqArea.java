package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        System.out.println("p= " + p + ", k= " + k + ". With this parameters square is equal to " + l * h);
        return l * h;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        double result2 = SqArea.square(18, 2);
        double result3 = SqArea.square(19, 6);
    }
}
