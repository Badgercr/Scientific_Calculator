package com.example.scientificcalculator;

import android.view.View;
import android.widget.TextView;
import java.text.DecimalFormat;


public class Calculator {
    //two numbers used in operation
    Double firstNum;
    Double lastNum;
    //operation variable
    int operation; //no operation = -1
    //actual text space, showing numbers
    TextView workspace;
    //tool to help round numbers to 7 decimals
    DecimalFormat df;
    //constructor
    public Calculator(TextView workspace){
        this.workspace = workspace;
        df = new DecimalFormat("##########.#######");
        this.workspace.setText("0");
    }
    //----------------------------functions----------------------------//
    public void input0(){
        if (workspace.length() == 9){
            return;
        }
        else if (workspace.length() == 1 & workspace.getText().toString().equals("0")){
            workspace.setText("0");
        }
        else
        {
            workspace.append("0");
        }
    }
    public void input1(){
        if (workspace.length() == 9){
            return;
        }
        else if (workspace.length() == 1 & workspace.getText().toString().equals("0")){
            workspace.setText("1");
        }
        else{
            workspace.append("1");
        }

    }
    public void input2(){
        if (workspace.length() == 9){
            return;
        }
        else if (workspace.length() == 1 & workspace.getText().toString().equals("0")){
            workspace.setText("2");
        }
        else{
            workspace.append("2");
        }

    }
    public void input3(){
        if (workspace.length() == 9){
            return;
        }
        else if (workspace.length() == 1 & workspace.getText().toString().equals("0")){
            workspace.setText("3");
        }
        else {
            workspace.append("3");
        }
    }
    public void input4(){
        if (workspace.length() == 9){
            return;
        }
        else if (workspace.length() == 1 & workspace.getText().toString().equals("0")){
            workspace.setText("4");
        }
        else {
            workspace.append("4");
        }
    }
    public void input5(){
        if (workspace.length() == 9){
            return;
        }
        else if (workspace.length() == 1 & workspace.getText().toString().equals("0")){
            workspace.setText("5");
        }
        else {
            workspace.append("5");
        }
    }
    public void input6(){
        if (workspace.length() == 9){
            return;
        }
        else if (workspace.length() == 1 & workspace.getText().toString().equals("0")){
            workspace.setText("6");
        }
        else {
            workspace.append("6");
        }
    }
    public void input7(){
        if (workspace.length() == 9){
            return;
        }
        else if (workspace.length() == 1 & workspace.getText().toString().equals("0")){
            workspace.setText("7");
        }
        else {
            workspace.append("7");
        }
    }
    public void input8(){
        if (workspace.length() == 9){
            return;
        }
        else if (workspace.length() == 1 & workspace.getText().toString().equals("0")){
            workspace.setText("8");
        }
        else {
            workspace.append("8");
        }
    }
    public void input9(){
        if (workspace.length() == 9){
            return;
        }
        else if (workspace.length() == 1 & workspace.getText().toString().equals("0")){
            workspace.setText("9");
        }
        else {
            workspace.append("9");
        }
    }
    public void clear(){
        workspace.setText("0");

    }
    public void inputDecimal(){
        if (workspace.length() >= 7 | workspace.getText().toString().contains("."))
        {
            return;
        }
        else{
            workspace.append(".");
        }
    }
    public void inputSign(){
        if (workspace.getText().toString().contains("-")){
            workspace.setText(workspace.getText().toString().substring(1));
        }
        else {
            workspace.setText("-" + workspace.getText().toString());
        }
    }
    public void inputAddition(){
        operation = 1;
        if (firstNum == null){
            firstNum = Double.valueOf(workspace.getText().toString());
        }
        else{
            lastNum = Double.valueOf(workspace.getText().toString());
        }

    }
    public void inputEqual(){
        double result;
        workspace.setText("hey");
        /*switch (operation){
            case 1:
                result = firstNum + lastNum;
                firstNum = result;
                //df.format(result);
                workspace.setText("hey");
        }*/
    }



    //----------------------setters-------------------------------------------//
    public void setWorkspace(TextView workspace) {
        this.workspace = workspace;
    }

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    public void setLastNum(double lastNum) {
        this.lastNum = lastNum;
    }

    //------------------------getters-----------------------------------------//
    public TextView getWorkspace() {
        return workspace;
    }

    public double getFirstNum() {
        return firstNum;
    }

    public double getLastNum() {
        return lastNum;
    }
}
