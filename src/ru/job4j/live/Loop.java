package ru.job4j.live;

public class Loop {
    public static void main(String[] args) {
        int[] arr = {6, 7, 5, 4, 33, 32, 1, 0};
        int i = 0;
        do {
            System.out.print(arr[i] + " ");
            i++;
        }
        while (i < arr.length);
    }
}
