package ru.job4j.calculator;

public class ArgMethod {
    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        String name = "Konstantin Domarin";
        int age = 30;
        ArgMethod.hello(name);
    }
}
