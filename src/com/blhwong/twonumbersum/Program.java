package com.blhwong.twonumbersum;

import java.util.HashSet;
import java.util.Set;

public class Program {

    public static int[] twoNumberSum(int[] array, int targetSum) {
        Set<Integer> tracker = new HashSet<>();
        for (int i : array) {
            int diff = targetSum - i;
            boolean found = tracker.contains(diff);
            if (found) {
                return new int[]{i, diff};
            }
            tracker.add(i);
        }
        return new int[]{};
    }
}
