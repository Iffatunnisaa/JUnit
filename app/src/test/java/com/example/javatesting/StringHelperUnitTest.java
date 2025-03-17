package com.example.javatesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Kelas ini berisi unit test untuk menguji metode konversi string ke huruf besar.
 */
public class StringHelperUnitTest {
    public void testConvertToUpperCase() {
        assertEquals("HELLO", StringHelper.convertToUpperCase("hello"));
        assertEquals("ANDROID", StringHelper.convertToUpperCase("android"));
    }
}
