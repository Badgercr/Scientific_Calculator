package com.example.scientificcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int i;
    TextView workspace;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //set MainActivity to your layout
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //create calculator object and connect workspace to layout workspace and initialize to 0
        final Calculator calc = new Calculator(findViewById(R.id.input_view));

        /*
        Initialize the workspace your calc instance
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

            }
        });
        findViewById(R.id.multiplication).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
            }
        });
        findViewById(R.id.division).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
            }
        });




        /*
        add proper click listener to each button
         for example clear button
                findViewById(R.id.clear_button).setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v) {
                        calc.clear();
                    }
                });
        */


    }


}
