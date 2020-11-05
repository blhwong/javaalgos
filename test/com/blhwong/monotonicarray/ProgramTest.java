package com.blhwong.monotonicarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProgramTest {

    @Test
    public void TestCase1() {
        var array = new int[] {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
        var expected = true;
        var actual = Program.isMonotonic(array);
        assertEquals(expected, actual);
    }
}