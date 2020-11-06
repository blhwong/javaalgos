package com.blhwong.nodedepths;

import java.util.ArrayDeque;
import java.util.Deque;

class Program {

    public static int nodeDepths(BinaryTree root) {
        Deque<Tuple> q = new ArrayDeque<>();
        q.add(new Tuple(root, 0));
        int ans = 0;
        while (!q.isEmpty()) {
            Tuple curr = q.poll();
            ans += curr.depth;
            if (curr.tree.left != null) {
                q.offer(new Tuple(curr.tree.left, curr.depth + 1));
            }
            if (curr.tree.right != null) {
                q.offer(new Tuple(curr.tree.right, curr.depth + 1));
            }
        }
        return ans;
    }

    static class Tuple {
        public final BinaryTree tree;
        public final int depth;

        public Tuple(BinaryTree tree, int depth) {
            this.tree = tree;
            this.depth = depth;
        }
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
