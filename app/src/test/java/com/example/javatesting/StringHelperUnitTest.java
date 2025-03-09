package com.example.javatesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Kelas ini berisi unit test untuk menguji metode konversi string ke huruf besar.
 */
public class StringHelperUnitTest {
    /**
     * Mengubah teks menjadi huruf besar.
     *
     * @param input String yang akan dikonversi ke huruf besar.
     * @return String hasil konversi dalam huruf besar.
     */
    public String convertToUpperCase(String input) {
        return input.toUpperCase();
    }

    /**
     * Menguji apakah metode {@link #convertToUpperCase(String)} dapat mengubah teks menjadi huruf besar.
     *
     * **Skenario Pengujian:**
     * - Jika input adalah "hello", maka output harus "HELLO".
     * - Jika input adalah "android", maka output harus "ANDROID".
     */
    @Test
    public void testConvertToUpperCase() {
        assertEquals("HELLO", convertToUpperCase("hello"));
        assertEquals("ANDROID", convertToUpperCase("android"));
    }
}
