package com.blhwong.findthreelargestnumbers;


class Program {

    public static int[] findThreeLargestNumbers(int[] array) {
        int[] ans = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (int num : array) {
            if (num > ans[2]) {
                shift(ans, num, 2);
            } else if (num > ans[1]) {
                shift(ans, num, 1);
            } else if (num > ans[0]) {
                shift(ans, num, 0);
            }
        }
        return ans;
    }

    private static void shift(int[] array, int value, int idx) {
        for (int i = 0; i < idx; i++) {
            array[i] = array[i + 1];
        }
        array[idx] = value;
    }
}
