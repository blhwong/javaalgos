package com.blhwong.threenumbersum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Program {

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        List<Integer[]> ans = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int diff = targetSum - array[i];
            Integer[] arr = new Integer[]{array[i]};
            List<Integer[]> pairs = twoSum(Arrays.copyOfRange(array, i + 1, array.length), diff);
            for (Integer[] pair : pairs) {
                Integer[] combined = Stream.of(arr, pair)
                        .flatMap(Stream::of)
                        .toArray(Integer[]::new);
                ans.add(combined);
            }
        }
        return ans;
    }

    private static List<Integer[]> twoSum(int[] array, int targetSum) {
        int left = 0;
        int right = array.length - 1;
        List<Integer[]> pairs = new ArrayList<>();
        while (left < right) {
            int sum = array[left] + array[right];
            if (sum == targetSum) {
                pairs.add(new Integer[]{array[left], array[right]});
                left++;
                right--;
            } else if (sum < targetSum) {
                left++;
            } else {
                right--;
            }
        }
        return pairs;
    }
}
