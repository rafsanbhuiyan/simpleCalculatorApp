package com.example.cs311t_u2_subnodequestion2_rafsanbhuiyan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.pow;

public class MainActivity extends AppCompatActivity {

    Button mod;
    Button add;
    Button sub;
    Button div;
    Button power;
    EditText number1;
    EditText number2;
    TextView results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get the power button from the layout resource
        power = findViewById(R.id.powerButton);

        //Set onClickListener for power button
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get the number inputs from the layout resource
                number1 = findViewById(R.id.numberInput1);
                number2 = findViewById(R.id.numberInput2);
                results = findViewById(R.id.resultBox);

                //Get the inputs as integers and assign it to num1 and num2 respectively
                double num1 = Double.valueOf(number1.getText().toString().trim());
                double num2 = Double.valueOf(number2.getText().toString().trim());

                //Calculate power
                double calPower = Math.pow(num1,num2);

                //Print results
                results.setText(""+calPower);
            }
        });

        //Get the divide button from the layout resource
        div = findViewById(R.id.divButton);

        //Set onClickListener for divButton
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get the number inputs from the layout resource
                number1 = findViewById(R.id.numberInput1);
                number2 = findViewById(R.id.numberInput2);
                results = findViewById(R.id.resultBox);

                //Get the inputs as integers and assign it to num1 and num2 respectively
                double num1 = Double.valueOf(number1.getText().toString().trim());
                double num2 = Double.valueOf(number2.getText().toString().trim());

                //Divide the numbers
                double divide = num1 / num2;

                //Print the results
                results.setText(""+divide);
            }
        });

        //Get the subtract button from the layout resource
        sub = findViewById(R.id.subButton);

        //Set onClickListener for subButton
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get the number inputs from the layout resource
                number1 = findViewById(R.id.numberInput1);
                number2 = findViewById(R.id.numberInput2);
                results = findViewById(R.id.resultBox);

                //Get the inputs as integers and assign it to num1 and num2 respectively
                double num1 = Double.valueOf(number1.getText().toString().trim());
                double num2 = Double.valueOf(number2.getText().toString().trim());

                //Subtract the numbers
                double subtract = num1 - num2;

                //Print results
                results.setText(""+subtract);
            }
        });

        //Get the add button from the layout resource
        add = findViewById(R.id.addButton);

        //Set onClickListener for add button
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get the number inputs from the layout resource
                number1 = findViewById(R.id.numberInput1);
                number2 = findViewById(R.id.numberInput2);
                results = findViewById(R.id.resultBox);

                //Get the inputs as integers and assign it to num1 and num2 respectively
                double num1 = Double.valueOf(number1.getText().toString().trim());
                double num2 = Double.valueOf(number2.getText().toString().trim());

                //Add the numbers
                double addResults = num1 + num2;

                //Print result
                results.setText(""+addResults);

            }
        });

        //Get the mod button from layout resource
        mod = findViewById(R.id.modButton);

        //Set onclick listener
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get the number inputs from the layout resource
                number1 = findViewById(R.id.numberInput1);
                number2 = findViewById(R.id.numberInput2);
                results = findViewById(R.id.resultBox);

                //Get the inputs as integers and assign it to num1 and num2 respectively
                double num1 = Double.valueOf(number1.getText().toString().trim());
                double num2 = Double.valueOf(number2.getText().toString().trim());

                //Calculating the mod results
                double modResult = num1 % num2;

                //Print result
                results.setText(""+modResult);
            }
        });
    }
}
