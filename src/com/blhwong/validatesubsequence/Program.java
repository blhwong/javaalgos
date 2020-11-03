package com.blhwong.validatesubsequence;

import java.util.List;

public class Program {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int i = 0;
        for (int j : array) {
            if (i < sequence.size() && j == sequence.get(i)) {
                i++;
            }
        }
        return i == sequence.size();
    }
}
