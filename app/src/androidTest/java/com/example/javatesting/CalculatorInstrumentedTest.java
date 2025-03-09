package com.example.javatesting;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Kelas ini berisi instrumented test untuk menguji fungsi kalkulator
 * dan memastikan aplikasi berjalan di lingkungan Android dengan benar.
 */
@RunWith(AndroidJUnit4.class)
public class CalculatorInstrumentedTest {
    /**
     * Objek Calculator yang akan digunakan untuk pengujian.
     */
    private Calculator calculator = new Calculator();

    /**
     * Menguji apakah fungsi penjumlahan dari kelas Calculator bekerja dengan benar
     * dalam lingkungan Android.
     *
     * **Skenario:**
     * - Menambahkan 4 + 3
     * - Hasil yang diharapkan adalah 7
     *
     * **Metode yang diuji:** {@link Calculator#add(int, int)}
     */
    @Test
    public void testAdditionInstrumented() {
        assertEquals(7, calculator.add(4, 3));
    }

    /**
     * Menguji apakah aplikasi menggunakan package name yang benar.
     *
     * **Skenario:**
     * - Mendapatkan context aplikasi saat ini
     * - Memeriksa apakah package name sesuai dengan "com.example.javatesting"
     */
    @Test
    public void useAppContext() {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.javatesting", appContext.getPackageName());
    }
}
