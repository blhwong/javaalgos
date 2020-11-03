package com.blhwong.closestvalueinbst;

public class Program {

    public static int findClosestValueInBst(BST tree, int target) {
        return findClosestValueInBst(tree, target, tree.value);
    }

    private static int findClosestValueInBst(BST tree, int target, int closest) {
        if (Math.abs(target - tree.value) < Math.abs(target - closest)) {
            closest = tree.value;
        }
        if (target < tree.value && tree.left != null) {
            return findClosestValueInBst(tree.left, target, closest);
        }
        if (target > tree.value && tree.right != null) {
            return findClosestValueInBst(tree.right, target, closest);
        }
        return closest;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
