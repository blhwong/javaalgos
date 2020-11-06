package com.blhwong.moveelementtoend;

import java.util.Collections;
import java.util.List;

class Program {

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int left = 0;
        int right = array.size() - 1;
        while (left < right) {
            while (left < right && array.get(right) == toMove) {
                right--;
            }
            if (array.get(left) == toMove) {
                Collections.swap(array, left, right);
            }
            left++;
        }
        return array;
    }
}
