package ru.job4j.calculator;

public class MathFun {
    public static void main(String[] args) {
        int result = MathFun.func1(100);
        System.out.println(result);
    }

    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }
}
