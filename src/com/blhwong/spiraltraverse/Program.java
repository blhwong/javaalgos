package com.blhwong.spiraltraverse;

import java.util.ArrayList;
import java.util.List;

class Program {

    public static List<Integer> spiralTraverse(int[][] array) {
        int left = 0;
        int right = array[0].length - 1;
        int up = 0;
        int down = array.length - 1;
        List<Integer> ans = new ArrayList<>();
        int size = array.length * array[0].length;
        while (ans.size() < size) {
            for (int j = left; j <= right; j++) {
                if (ans.size() < size) {
                    ans.add(array[up][j]);
                }
            }
            for (int i = up + 1; i <= down; i++) {
                if (ans.size() < size) {
                    ans.add(array[i][right]);
                }
            }
            for (int j = right - 1; j >= left; j--) {
                if (ans.size() < size) {
                    ans.add(array[down][j]);
                }
            }
            for (int i = down - 1; i > up; i--) {
                if (ans.size() < size) {
                    ans.add(array[i][left]);
                }
            }
            left++;
            right--;
            up++;
            down--;
        }
        return ans;
    }
}
