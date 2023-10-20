package com.ykaraarslan.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText numberText;
    EditText numberText2;
    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberText = findViewById(R.id.numberText);
        numberText2 = findViewById(R.id.numberText2);
        resultText = findViewById(R.id.resultText);


    }

    public void sum(View view){
        if(numberText.getText().toString().matches("")|| numberText2.getText().toString().matches("")){
            resultText.setText("enter number!!");
        }else{
            int number1 = Integer.parseInt(numberText.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());
            int result = number1+number2;
            resultText.setText("Result:"+ result);
        }


    }
    public void sub(View view){
        if(numberText.getText().toString().matches("")|| numberText2.getText().toString().matches("")){
            resultText.setText("enter number!!");
        }else{
            int number1 = Integer.parseInt(numberText.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());
            int result = number1-number2;
            resultText.setText("Result:"+ result);
        }
    }
    public void mul(View view){
        if(numberText.getText().toString().matches("")|| numberText2.getText().toString().matches("")){
            resultText.setText("enter number!!");
        }else{
            int number1 = Integer.parseInt(numberText.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());
            int result = number1*number2;
            resultText.setText("Result:"+ result);
        }
    }
    public void div(View view){
        if(numberText.getText().toString().matches("")|| numberText2.getText().toString().matches("")){
            resultText.setText("enter number!!");
        } else if (numberText2.getText().toString().matches("0")) {
            resultText.setText("undefined");
        } else{
            int number1 = Integer.parseInt(numberText.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());
            int result = number1/number2;
            resultText.setText("Result:"+ result);
        }
    }

}