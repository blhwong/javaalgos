package com.blhwong.smallestdifference;

import java.util.Arrays;

class Program {

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        int[] ans = new int[]{};
        int smallestDifference = Integer.MAX_VALUE;
        for (int num : arrayTwo) {
            int closest = binarySearch(arrayOne, num);
            if (Math.abs(closest - num) < smallestDifference) {
                smallestDifference = Math.abs(closest - num);
                ans = new int[]{closest, num};
            }
        }
        return ans;
    }

    private static int binarySearch(int[] array, int target) {
        int closest = Integer.MAX_VALUE;
        int ans = -1;
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (Math.abs(array[mid] - target) < closest) {
                ans = array[mid];
                closest = Math.abs(array[mid] - target);
            }
            closest = Math.min(closest, Math.abs(array[mid] - target));
            if (array[mid] == target) {
                return target;
            } else if (array[mid] < target) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }
}
