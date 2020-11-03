package com.blhwong.twonumbersum;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ProgramTest {

    @Test
    public void TestCase1() {
        int[] output = Program.twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
        assertEquals(output.length, 2);
        assertTrue(contains(output, -1));
        assertTrue(contains(output, 11));
    }

    @Test
    public void TestCase2() {
        int [] output = Program.twoNumberSum(new int[]{1, 2, 3, 4, 5}, 50);
        assertEquals(output.length, 0);
        assertFalse(contains(output, 1));
    }

    public boolean contains(int[] output, int val) {
        for (var el : output) {
            if (el == val) return true;
        }
        return false;
    }
}
