package com.blhwong.palindromecheck;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ProgramTest {

    @Test
    public void TestCase1() {
        assertTrue(Program.isPalindrome("abcdcba"));
    }
}
