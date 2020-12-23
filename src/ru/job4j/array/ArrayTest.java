package ru.job4j.array;
//
//public class Merge2 {
//
//}


//    public static int[] merge(int[] left, int[] right) {
//        int[] rsl = new int[left.length + right.length];
//        // left{1,3}   right{3,4,4}  rsl[5]
//        int size = 0;
//        int i = 0;
//        int j = 0;
//        for (int k = 0; k < rsl.length; k++) {
//            if (i < left.length && left[i] <= right[j]) {
//                rsl[size] = left[i];
//                i++;
//                size++;
//            }
//            if (j <= right.length - 1 && left[i] >= right[j]) {
//                rsl[size] = right[j];
//                j++;
//                size++;
//                if (j >= right.length) {
//                    j = right.length - 1;
//                }
//            }
//        }
//        return rsl;
//    }