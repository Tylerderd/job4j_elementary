package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number % 2 == 0 || number == 1) {
            prime = false;
        }
        for (int i = 3; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return prime;
    }
}