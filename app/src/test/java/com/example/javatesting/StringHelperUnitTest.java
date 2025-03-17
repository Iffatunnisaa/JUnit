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
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static boolean isPalindrome(String input) {
        String reversed = reverseString(input);
        return input.equalsIgnoreCase(reversed);
    }

    public static int countVowels(String input) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char ch : input.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    public static String removeWhitespace(String input) {
        return input.replaceAll("\\s+", "");
    }
}
