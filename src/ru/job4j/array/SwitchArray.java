package ru.job4j.array;

public class SwitchArray {

    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;

        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int value : rsl) {
            System.out.println(value);
        }
        System.out.println();
        int[] swapTestArray = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] swapRes = swap(swapTestArray, 2, 4);
        for (int i : swapRes) {
            System.out.println(i);
        }
    }
}