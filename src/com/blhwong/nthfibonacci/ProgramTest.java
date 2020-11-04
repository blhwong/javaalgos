package com.blhwong.nthfibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProgramTest {

    @Test
    public void TestCase1() {
        assertEquals(Program.getNthFib(6), 5);
    }
}
