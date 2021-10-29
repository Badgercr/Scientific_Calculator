package com.example.scientificcalculator;

import android.widget.TextView;
import java.text.DecimalFormat;


public class Calculator {
    //two numbers used in operation
    double firstNum;
    double lastNum;
    //operation variable
    int operation; //no operation = -1
    //actual text space, showing numbers
    TextView workspace;
    //tool to help round numbers to 7 decimals
    DecimalFormat df;
    //constructor
    public Calculator(TextView workspace){
        this.workspace = workspace;
        firstNum = 0;
        lastNum = 0;
        this.workspace.setText("0");
    }
    //----------------------------functions----------------------------//




    //----------------------setters-------------------------------------------//
    public void setWorkspace(TextView workspace) {
        this.workspace = workspace;
    }
    //------------------------getters-----------------------------------------//
    public TextView getWorkspace() {
        return workspace;
    }
}
