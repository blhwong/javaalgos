package com.blhwong.smallestdifference;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ProgramTest {

    @Test
    public void TestCase1() {
        int[] expected = {28, 26};
        assertTrue(
                Arrays.equals(
                        Program.smallestDifference(
                                new int[] {-1, 5, 10, 20, 28, 3}, new int[] {26, 134, 135, 15, 17}),
                        expected));
    }
}
