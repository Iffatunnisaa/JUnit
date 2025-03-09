package com.example.javatesting;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNum1, editTextNum2;
    private TextView textViewResult;
    private Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        editTextNum1 = findViewById(R.id.editTextNum1);
        editTextNum2 = findViewById(R.id.editTextNum2);
        textViewResult = findViewById(R.id.textViewResult);
        Button buttonAdd = findViewById(R.id.buttonAdd);
        Button buttonSubtract = findViewById(R.id.buttonSubtract);

        calculator = new Calculator();

        buttonAdd.setOnClickListener(v -> calculateResult("add"));
        buttonSubtract.setOnClickListener(v -> calculateResult("subtract"));
    }

    private void calculateResult(String operation) {
        String num1Str = editTextNum1.getText().toString();
        String num2Str = editTextNum2.getText().toString();

        if (num1Str.isEmpty() || num2Str.isEmpty()) {
            textViewResult.setText("Masukkan angka!");
            return;
        }

        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);
        int result;

        if ("add".equals(operation)) {
            result = calculator.add(num1, num2);
        } else {
            result = calculator.subtract(num1, num2);
        }

        textViewResult.setText("Hasil: " + result);
    }
}