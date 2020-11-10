package com.blhwong.bsttraversal;

import java.util.List;

class Program {

    public static List<Integer> inOrderTraverse(BST tree, List<Integer> array) {
        if (tree.left != null) {
            array = inOrderTraverse(tree.left, array);
        }
        array.add(tree.value);
        if (tree.right != null) {
             array = inOrderTraverse(tree.right, array);
        }
        return array;
    }

    public static List<Integer> preOrderTraverse(BST tree, List<Integer> array) {
        array.add(tree.value);
        if (tree.left != null) {
            array = preOrderTraverse(tree.left, array);
        }
        if (tree.right != null) {
            array = preOrderTraverse(tree.right, array);
        }
        return array;
    }

    public static List<Integer> postOrderTraverse(BST tree, List<Integer> array) {
        if (tree.left != null) {
            array = postOrderTraverse(tree.left, array);
        }
        if (tree.right != null) {
            array = postOrderTraverse(tree.right, array);
        }
        array.add(tree.value);
        return array;
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
