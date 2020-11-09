package com.blhwong.longestpeak;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {

    @Test
    public void TestCase1() {
        var input = new int[] {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        var expected = 6;
        var actual = Program.longestPeak(input);
        assertEquals(expected, actual);
    }
}