package com.blhwong.productsum;

import java.util.ArrayList;
import java.util.List;

class Program {

    public static int productSum(List<Object> array) {
        return productSum(array, 1);
    }

    private static int productSum(List<Object> array, int multiplier) {
        int ans = 0;

        for (Object element : array) {
            if (element instanceof ArrayList) {
                @SuppressWarnings("unchecked")
                ArrayList<Object> ls = (ArrayList<Object>) element;
                ans += productSum(ls, multiplier + 1);
            } else {
                ans += (int) element;
            }
        }

        return ans * multiplier;
    }
}
