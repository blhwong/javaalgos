package com.blhwong.validatebst;

class Program {

    public static boolean validateBst(BST tree) {
        return validateBst(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean validateBst(BST curr, int min, int max) {
        if (curr == null) {
            return true;
        }
        if (curr.left != null && curr.left.value >= curr.value) {
            return false;
        }
        if (curr.right != null && curr.right.value < curr.value) {
            return false;
        }
        if (curr.value >= max || curr.value < min) {
            return false;
        }
        return validateBst(curr.left, min, curr.value) && validateBst(curr.right, curr.value, max);
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
