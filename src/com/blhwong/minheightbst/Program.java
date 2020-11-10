package com.blhwong.minheightbst;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

class Program {

    public static BST minHeightBst(List<Integer> array) {
        BST root = null;
        Deque<Pair> q = new ArrayDeque<>();
        q.add(new Pair(0, array.size() - 1));
        while (!q.isEmpty()) {
            Pair curr = q.poll();
            if (curr.left <= curr.right) {
                int mid = (curr.left + curr.right) / 2;
                if (root == null) {
                    root = new BST(array.get(mid));
                } else {
                    root.insert(array.get(mid));
                }
                q.add(new Pair(curr.left, mid - 1));
                q.add(new Pair(mid + 1, curr.right));
            }
        }
        return root;
    }

    private static class Pair {
        public int left;
        public int right;

        public Pair(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        public void insert(int value) {
            if (value < this.value) {
                if (left == null) {
                    left = new BST(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new BST(value);
                } else {
                    right.insert(value);
                }
            }
        }
    }
}
