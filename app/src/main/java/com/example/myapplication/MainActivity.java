package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = findViewById(R.id.editTextNumber);
        number2 = findViewById(R.id.editTextNumber2);
        resultText = findViewById(R.id.Result);
    }
    TextView resultText;
    EditText number2;
    EditText number1;
    public void plusButtonAction(View view) {
        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        int result = n1 + n2;
        String resultString=String.valueOf(result);
        resultText.setText(resultString);

    }

    public void timesButtonAction(View view) {
        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        int result = n1 * n2;
        String resultString=String.valueOf(result);
        resultText.setText(resultString);
    }

    public void divideButtonAction(View view) {
        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        int result = n1 / n2;
        String resultString=String.valueOf(result);
        resultText.setText(resultString);
    }

    public void minusButtonAction(View view) {
        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        int result = n1 - n2;
        String resultString = String.valueOf(result);
        resultText.setText(resultString);
    }}