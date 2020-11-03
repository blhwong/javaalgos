package com.blhwong.branchsums;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        List<Integer> ans = new ArrayList<>();
        branchSums(root, 0, ans);
        return ans;
    }

    private static void branchSums(BinaryTree curr, int currSum, List<Integer> sums) {
        if (curr == null) {
            return;
        }
        int newSum = curr.value + currSum;
        if (curr.left == null && curr.right == null) {
            sums.add(newSum);
            return;
        }
        branchSums(curr.left, newSum, sums);
        branchSums(curr.right, newSum, sums);
    }
}
