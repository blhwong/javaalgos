package com.blhwong.bstconstruction;

class Program {

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            BST curr = this;
            while (true) {
                if (curr.value <= value) {
                    if (curr.right == null) {
                        curr.right = new BST(value);
                        break;
                    } else {
                        curr = curr.right;
                    }
                } else {
                    if (curr.left == null) {
                        curr.left = new BST(value);
                        break;
                    } else {
                        curr = curr.left;
                    }
                }
            }
            return this;
        }

        public boolean contains(int value) {
            BST curr = this;
            while (curr != null) {
                if (curr.value == value) {
                    return true;
                } else if (curr.value < value) {
                    curr = curr.right;
                } else {
                    curr = curr.left;
                }
            }
            return false;
        }

        public BST remove(int value) {
            remove(value, null);
            return this;
        }

        private void remove(int value, BST parent) {
            BST curr = this;
            while (curr != null) {
                if (curr.value < value) {
                    parent = curr;
                    curr = curr.right;
                } else if (curr.value > value) {
                    parent = curr;
                    curr = curr.left;
                } else {
                    if (curr.left != null && curr.right != null) {
                        curr.value = curr.right.minValue();
                        curr.right.remove(curr.value, curr);
                    } else if (parent == null) {
                        if (curr.left != null) {
                            curr.value = curr.left.value;
                            curr.right = curr.left.right;
                            curr.left = curr.left.left;
                        } else if (curr.right != null) {
                            curr.value = curr.right.value;
                            curr.left = curr.right.left;
                            curr.right = curr.right.right;
                        }
                    } else if (parent.left == curr) {
                        parent.left = curr.left != null ? curr.left : curr.right;
                    } else if (parent.right == curr) {
                        parent.right = curr.left != null ? curr.left : curr.right;
                    }
                    break;
                }
            }
        }

        private int minValue() {
            BST curr = this;
            while (curr.left != null) {
                curr = curr.left;
            }
            return curr.value;
        }
    }
}
