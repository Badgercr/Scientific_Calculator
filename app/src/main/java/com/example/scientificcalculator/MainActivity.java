package com.example.scientificcalculator;

import android.os.Bundle;
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
