package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1 || number == 0 || number == 4) {
            prime = false;
        } else if (number == 2) {
            return true;
        }
        for (int i = 3; i < number; i++) {
            if (number % i == 0) {

                return false;
            }
        }
        return prime;
    }
}