package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int size = 0;
        int i = 0;
        int j = 0;
        for (int k = 0; k < rsl.length; k++) {
            if (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    rsl[size] = left[i];
                    i++;
                    size++;
                } else {
                    rsl[size] = right[j];
                    j++;
                    size++;
                }
            } else if (i < left.length) {
                rsl[size] = left[i];
                i++;
                size++;
            } else {
                rsl[size] = right[j];
                j++;
                size++;
            }
        }
        return rsl;
    }
}


