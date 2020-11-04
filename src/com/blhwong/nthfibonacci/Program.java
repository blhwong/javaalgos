package com.blhwong.nthfibonacci;

class Program {

    public static int getNthFib(int n) {
        int prev = 0;
        int curr = 1;

        for (int i = 1; i < n; i++) {
            int tmp = prev;
            prev = curr;
            curr += tmp;
        }
        return prev;
    }
}
