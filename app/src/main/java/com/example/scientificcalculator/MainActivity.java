package com.example.scientificcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int i;
    TextView workspace;
    TextView equation_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //set MainActivity to your layout
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //create calculator object and connect workspace to layout workspace and initialize to 0
        final Calculator calc = new Calculator(findViewById(R.id.input_view), findViewById(R.id.equation_view)); //  passing in another workspace for the textview that shows the equation

        /*
        Initialize the workspace your calc instance and setting up all the click listeners
        */
        findViewById(R.id.clear).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                calc.clear();
            }
        });
        findViewById(R.id.zero).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                calc.input0();
            }
        });
        findViewById(R.id.one).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                calc.input1();
            }
        });
        findViewById(R.id.two).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                calc.input2();
            }
        });
        findViewById(R.id.three).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                calc.input3();
            }
        });
        findViewById(R.id.four).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                calc.input4();
            }
        });
        findViewById(R.id.five).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                calc.input5();
            }
        });
        findViewById(R.id.six).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                calc.input6();
            }
        });
        findViewById(R.id.seven).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                calc.input7();
            }
        });
        findViewById(R.id.eighth).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                calc.input8();
            }
        });

        findViewById(R.id.nine).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                calc.input9();
            }
        });
        findViewById(R.id.decimal_point).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                calc.inputDecimal();
            }
        });
        findViewById(R.id.equal).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                calc.inputEqual();
            }
        });
        findViewById(R.id.negative).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                calc.inputSign();
            }
        });
        findViewById(R.id.add).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                calc.inputAddition();
            }
        });
        findViewById(R.id.subtraction).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                calc.inputSubtraction();
            }
        });
        findViewById(R.id.multiplication).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                calc.inputMultiplication();
            }
        });
        findViewById(R.id.division).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                calc.inputDivision();
            }
        });
        findViewById(R.id.percentage).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                calc.inputPercentage();
            }
        });
        findViewById(R.id.square_root).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                calc.inputSquareRoot();
            }
        });
        findViewById(R.id.square).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                calc.inputSquare();
            }
        });
        findViewById(R.id.power_to).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                calc.powerTo();
            }
        });
        findViewById(R.id.natural_log).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                calc.naturalLog();
            }
        });



    }


}
