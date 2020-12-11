package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double semiPerimeter = (a + b + c) / 2;
        double firstExpr = semiPerimeter - a;
        double secondExpr = semiPerimeter - b;
        double thirdExpr = semiPerimeter - c;
        double multiply = semiPerimeter * firstExpr * secondExpr * thirdExpr;

        System.out.println("area (" + a + ", " + b + ", " + c + ") = " + Math.sqrt(multiply));
        return semiPerimeter * firstExpr * secondExpr * thirdExpr;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        double rsl2 = TrgArea.area(5, 6, 7);
        double rsl3 = TrgArea.area(5, 8, 4);
        double rsl4 = TrgArea.area(5, 3, 4);

    }
}
