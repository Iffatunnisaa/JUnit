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
        Button buttonMultiply = findViewById(R.id.buttonMultiply);
        Button buttonDivide = findViewById(R.id.buttonDivide);

        calculator = new Calculator();

        buttonAdd.setOnClickListener(v -> calculateResult("add"));
        buttonSubtract.setOnClickListener(v -> calculateResult("subtract"));
        buttonMultiply.setOnClickListener(v -> calculateResult("multiply"));
        buttonDivide.setOnClickListener(v -> calculateResult("divide"));
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
        int result = 0;
        String resultText;

        try {
            switch (operation) {
                case "add":
                    result = calculator.add(num1, num2);
                    break;
                case "subtract":
                    result = calculator.subtract(num1, num2);
                    break;
                case "multiply":
                    result = calculator.multiply(num1, num2);
                    break;
                case "divide":
                    result = calculator.divide(num1, num2);
                    break;
            }
            resultText = "Hasil: " + result;
        } catch (IllegalArgumentException e) {
            resultText = "Error: " + e.getMessage();
        }

        // Gunakan StringHelper untuk mengubah hasil menjadi huruf besar
        textViewResult.setText(StringHelper.convertToUpperCase(resultText));
    }
}