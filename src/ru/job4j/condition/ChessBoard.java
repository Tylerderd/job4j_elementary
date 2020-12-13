package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
            if (x1 - x2 != 0) {
                return Math.abs(x1 - x2);
            }
            return 0;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(way(3, 1, 2, 7));
        System.out.println(way(2, 0, 5, 3));
        System.out.println(way(2, 6, 4, 1));

    }
}
