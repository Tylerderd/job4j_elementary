package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{12}, {2, 12}, {1, 8, 4}, {4, 9, 0, 44}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Размер вложенного массива под индексом " + i + " равен: " + numbers[i].length
            );
        }
    }
}
