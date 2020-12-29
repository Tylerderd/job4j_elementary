package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double semiPerimeter = (a + b + c) / 2;
        double firstExpr = semiPerimeter - a;
        double secondExpr = semiPerimeter - b;
        double thirdExpr = semiPerimeter - c;
        double multiply = semiPerimeter * firstExpr * secondExpr * thirdExpr;
        double areaRes = Math.sqrt(multiply);
        System.out.println("area (" + a + ", " + b + ", " + c + ") = " + areaRes);
        return areaRes;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        double rsl2 = TrgArea.area(5, 6, 7);
        double rsl3 = TrgArea.area(5, 8, 4);
        double rsl4 = TrgArea.area(5, 3, 4);
        double rsl5 = TrgArea.area(4, 4, 4);
    }
}
