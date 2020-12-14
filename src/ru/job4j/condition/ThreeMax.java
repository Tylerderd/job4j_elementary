package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result;
        if (first >= second) {
            if (first >= third) {
            return first;
            } else {
                return third;
            }
        } else {
           if (second >= third) {
               return second;
           } else {
               return third;
           }
        }

    }

    public static void main(String[] args) {
        System.out.println(max(3, 4, 5));
        System.out.println(max(6, 4, 5));
        System.out.println(max(6, 1, 5));
        System.out.println(max(6, 6, 6));
        System.out.println(max(6, 7, 7));
        System.out.println(max(6, 3, 6));
    }
}
