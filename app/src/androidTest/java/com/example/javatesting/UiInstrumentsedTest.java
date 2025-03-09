package com.example.javatesting;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import static androidx.test.espresso.Espresso.onView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Kelas ini berisi instrumented test untuk memeriksa apakah elemen UI
 * pada MainActivity muncul dengan benar.
 */
@RunWith(AndroidJUnit4.class)
public class UiInstrumentsedTest {
    /**
     * Meluncurkan MainActivity sebelum menjalankan pengujian.
     */
    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    /**
     * Menguji apakah elemen UI utama seperti EditText, Button, dan TextView
     * ditampilkan dengan benar pada layar.
     *
     * - Memeriksa apakah input pertama (editTextNum1) terlihat.
     * - Memeriksa apakah input kedua (editTextNum2) terlihat.
     * - Memeriksa apakah tombol tambah (buttonAdd) terlihat.
     * - Memeriksa apakah tampilan hasil (textViewResult) terlihat.
     */
    @Test
    public void testUIElementsExist() {
        // Cek apakah EditText pertama ada
        onView(ViewMatchers.withId(R.id.editTextNum1))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Cek apakah EditText kedua ada
        onView(ViewMatchers.withId(R.id.editTextNum2))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Cek apakah tombol tambah ada
        onView(ViewMatchers.withId(R.id.buttonAdd))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Cek apakah TextView hasil ada
        onView(ViewMatchers.withId(R.id.textViewResult))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}
