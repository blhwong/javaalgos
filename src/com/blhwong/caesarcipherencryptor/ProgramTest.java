package com.blhwong.caesarcipherencryptor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProgramTest {

    @Test
    public void TestCase1() {
        assertEquals(Program.caesarCypherEncryptor("xyz", 2), "zab");
    }
}
