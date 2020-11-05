package com.blhwong.monotonicarray;

class Program {

    public static boolean isMonotonic(int[] array) {
        if (array.length < 2) {
            return true;
        }
        int i = 0;
        while (i < array.length - 1 && array[i] == array[i + 1]) {
            i++;
        }
        if (i == array.length - 1) {
            return true;
        }
        boolean isIncreasing = array[i] < array[i + 1];
        while (i < array.length - 1) {
            if (array[i] > array[i + 1] && isIncreasing) {
                return false;
            }
            if (array[i] < array[i + 1] && !isIncreasing) {
                return false;
            }
            i++;
        }
        return true;
    }
}
