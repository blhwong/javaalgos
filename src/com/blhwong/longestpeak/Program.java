package com.blhwong.longestpeak;

class Program {

    public static int longestPeak(int[] array) {
        int ans = 0;
        for (int i = 1; i < array.length - 1; i++) {
            int prev = array[i - 1];
            int curr = array[i];
            int next = array[i + 1];
            if (prev < curr && next < curr) {
                int j = i;
                int k = i;
                while (j > 0 && array[j] > array[j - 1]) {
                    j--;
                }
                while (k < array.length - 1 && array[k] > array[k + 1]) {
                    k++;
                }
                ans = Math.max(ans, k - j + 1);
            }
        }
        return ans;
    }
}