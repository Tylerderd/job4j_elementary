package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return Math.max(first, second);
    }

    public static int max(int first, int second, int third) {
        int temp = max(first, second);
        return Math.max(temp, third);
    }

    public static int max(int first, int second, int third, int fourth) {
        int temp = max(first, second);
        int temp2 = max(temp, third);
        return Math.max(temp2, fourth);
    }

    public static void main(String[] args) {
        System.out.println(max(12, 6, 44, 6));
        System.out.println(max(12, 44, 6));
        System.out.println(max(5, 4));
    }
}

