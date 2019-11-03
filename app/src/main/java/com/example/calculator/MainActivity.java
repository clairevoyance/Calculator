package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void doSUM(View v)
    {
        EditText e1 = (EditText) findViewById(R.id.number1);
        EditText e2 = (EditText) findViewById(R.id.number2);
        TextView t1 = (TextView) findViewById(R.id.result);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int sum = num1 + num2;
        t1.setText(Integer.toString(sum));
    }

    public void doSUB(View v)
    {
        EditText e1 = (EditText) findViewById(R.id.number1);
        EditText e2 = (EditText) findViewById(R.id.number2);
        TextView t1 = (TextView) findViewById(R.id.result);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int sum = num1 - num2;
        t1.setText(Integer.toString(sum));
    }

    public void doDIV(View v)
    {
        EditText e1 = (EditText) findViewById(R.id.number1);
        EditText e2 = (EditText) findViewById(R.id.number2);
        TextView t1 = (TextView) findViewById(R.id.result);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int sum = num1 / num2;
        t1.setText(Integer.toString(sum));
    }

    public void doMUL(View v)
    {
        EditText e1 = (EditText) findViewById(R.id.number1);
        EditText e2 = (EditText) findViewById(R.id.number2);
        TextView t1 = (TextView) findViewById(R.id.result);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int sum = num1 * num2;
        t1.setText(Integer.toString(sum));
    }
}
