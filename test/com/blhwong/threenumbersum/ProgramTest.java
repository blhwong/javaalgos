package com.blhwong.threenumbersum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ProgramTest {

    private boolean compare(List<Integer[]> triplets1, List<Integer[]> triplets2) {
        if (triplets1.size() != triplets2.size()) return false;
        for (int i = 0; i < triplets1.size(); i++) {
            if (!Arrays.equals(triplets1.get(i), triplets2.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void TestCase1() {
        List<Integer[]> expected = new ArrayList<>();
        expected.add(new Integer[] {-8, 2, 6});
        expected.add(new Integer[] {-8, 3, 5});
        expected.add(new Integer[] {-6, 1, 5});
        List<Integer[]> output = Program.threeNumberSum(new int[] {12, 3, 1, 2, -6, 5, -8, 6}, 0);
        assertTrue(this.compare(output, expected));
    }

    @Test
    public void TestCase2() {
        List<Integer[]> expected = new ArrayList<>();
        expected.add(new Integer[] {1, 2, 3});
        List<Integer[]> output = Program.threeNumberSum(new int[] {1, 2, 3}, 6);
        assertTrue(this.compare(output, expected));
    }
}
