package com.example.javatesting;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Kelas ini berisi unit test untuk menguji operasi dasar kalkulator,
 * seperti penjumlahan dan pengurangan.
 */
public class CalculatorUnitTest {
    private Calculator calculator;

    /**
     * Inisialisasi objek Calculator sebelum setiap pengujian dilakukan.
     * Metode ini dijalankan sebelum setiap test case dijalankan.
     */
    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    /**
     * Menguji apakah metode {@link Calculator#add(int, int)} bekerja dengan benar.
     *
     * **Skenario Pengujian:**
     * - 2 + 3 harus menghasilkan 5.
     * - -1 + 1 harus menghasilkan 0.
     */
    @Test
    public void testAddition() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-1, 1));
    }

    /**
     * Menguji apakah metode {@link Calculator#subtract(int, int)} bekerja dengan benar.
     *
     * **Skenario Pengujian:**
     * - 3 - 2 harus menghasilkan 1.
     * - -1 - 1 harus menghasilkan -2.
     */
    @Test
    public void testSubtraction() {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-2, calculator.subtract(-1, 1));
    }
}
