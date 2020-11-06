package com.blhwong.monotonicarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ProgramTest {

    @Test
    public void TestCase1() {
        int[] array = new int[] {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
        boolean output = Program.isMonotonic(array);
        assertTrue(output);
    }
}