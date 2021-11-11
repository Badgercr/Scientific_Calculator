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
    TextView equation_view;
    //tool to help round numbers to 7 decimals
    DecimalFormat df;
    //constructor
    public Calculator(TextView workspace, TextView equation_view){
        this.workspace = workspace;
        this.equation_view = equation_view;
        df = new DecimalFormat("##########.#######");
        this.workspace.setText("0");
    }
    //----------------------------functions----------------------------//
    /*
    All number inputs that will be written are handled below
    These functions handle the limit of the length as well as when the zero is intialized when the app is started
    * */

    public void input0(){
        if (workspace.length() == 10){ // limiting the numbers input to 10
            return;
        }
        else if (workspace.length() <= 2 & (workspace.getText().toString().equals("0") || workspace.getText().toString().equals("-0"))){ // handles when the variable is intiialized to 0
            workspace.setText("0");
        }
        else
        {
            workspace.append("0"); // append a zero if the lenght is greater 1
        }
    }
    public void input1(){
        if (workspace.length() == 10){
            return;
        }
        else if (workspace.length() <= 2 & (workspace.getText().toString().equals("0") || workspace.getText().toString().equals("-0"))){
            if (workspace.getText().toString().equals("-0")){
                workspace.setText("-1");
                return;
            }
            workspace.setText("1");
        }
        else{
            workspace.append("1");
        }

    }
    public void input2(){
        if (workspace.length() == 10){
            return;
        }
        else if (workspace.length() <= 2 & (workspace.getText().toString().equals("0") || workspace.getText().toString().equals("-0"))){
            if (workspace.getText().toString().equals("-0")){
                workspace.setText("-2");
                return;
            }
            workspace.setText("2");
        }
        else{
            workspace.append("2");
        }

    }
    public void input3(){
        if (workspace.length() == 10){
            return;
        }
        else if (workspace.length() <= 2 & (workspace.getText().toString().equals("0") || workspace.getText().toString().equals("-0"))){
            if (workspace.getText().toString().equals("-0")){
                workspace.setText("-3");
                return;
            }
            workspace.setText("3");
        }
        else {
            workspace.append("3");
        }
    }
    public void input4(){
        if (workspace.length() == 10){
            return;
        }
        else if (workspace.length() <= 2 & (workspace.getText().toString().equals("0") || workspace.getText().toString().equals("-0"))){
            if (workspace.getText().toString().equals("-0")){
                workspace.setText("-4");
                return;
            }
            workspace.setText("4");
        }
        else {
            workspace.append("4");
        }
    }
    public void input5(){
        if (workspace.length() == 10){
            return;
        }
        else if (workspace.length() <= 2 & (workspace.getText().toString().equals("0") || workspace.getText().toString().equals("-0"))){
            if (workspace.getText().toString().equals("-0")){
                workspace.setText("-5");
                return;
            }
            workspace.setText("5");
        }
        else {
            workspace.append("5");
        }
    }
    public void input6(){
        if (workspace.length() == 10){
            return;
        }
        else if (workspace.length() <= 2 & (workspace.getText().toString().equals("0") || workspace.getText().toString().equals("-0"))){
            if (workspace.getText().toString().equals("-0")){
                workspace.setText("-6");
                return;
            }
            workspace.setText("6");
        }
        else {
            workspace.append("6");
        }
    }
    public void input7(){
        if (workspace.length() == 10){
            return;
        }
        else if (workspace.length() <= 2 & (workspace.getText().toString().equals("0") || workspace.getText().toString().equals("-0"))){
            if (workspace.getText().toString().equals("-0")){
                workspace.setText("-7");
                return;
            }
            workspace.setText("7");
        }
        else {
            workspace.append("7");
        }
    }
    public void input8(){
        if (workspace.length() == 10){
            return;
        }
        else if (workspace.length() <= 2 & (workspace.getText().toString().equals("0") || workspace.getText().toString().equals("-0"))){
            if (workspace.getText().toString().equals("-0")){
                workspace.setText("-8");
                return;
            }
            workspace.setText("8");
        }
        else {
            workspace.append("8");
        }
    }
    public void input9(){
        if (workspace.length() == 10){
            return;
        }
        else if (workspace.length() <= 2 & (workspace.getText().toString().equals("0") || workspace.getText().toString().equals("-0"))){
            if (workspace.getText().toString().equals("-0")){
                workspace.setText("-9");
                return;
            }
            workspace.setText("9");
        }
        else {
            workspace.append("9");
        }
    }

    /**
     * Clears all inputs and textview
     */
    public void clear(){
        workspace.setText("0"); // clear textview
        equation_view.setText(""); // clear equation viewer
        // clear both number inputs
        firstNum = 0.0;
        lastNum = 0.0;

    }

    /**
     * Handles the dot operatpor for decimals
     */
    public void inputDecimal(){
        if (workspace.length() >= 7 | workspace.getText().toString().contains(".")) // limits decimal places to 7 spots
        {
            return;
        }
        else{
            workspace.append(".");
        }
    }

    /**
     * Handles input sign
     */
    public void inputSign(){
        if (workspace.getText().toString().contains("-")){ // if it contains a - already then dont add it
            workspace.setText(workspace.getText().toString().substring(1));
        }
        else {
            workspace.setText("-" + workspace.getText().toString()); // add sign if it doesnt contain it
        }
    }

    /*
    The following function handle the operator inputs.
    Depending ont the operation we assign an integer value to it
    * */
    public void inputAddition(){
        try{
            operation = 1;
            firstNum = Double.valueOf(workspace.getText().toString());
            workspace.setText("");
            equation_view.setText(firstNum + " + ");
        }catch (Exception e){
            workspace.setText("Error");
        }

    }
    public void inputSubtraction(){
        try{
            operation = 2;
            firstNum = Double.valueOf(workspace.getText().toString());
            workspace.setText("");
            equation_view.setText(firstNum + " - ");
        }catch (Exception e){
            workspace.setText("Error");
        }

    }
    public void inputMultiplication(){
        try{
            operation = 3;
            firstNum = Double.valueOf(workspace.getText().toString());
            workspace.setText("");
            equation_view.setText(firstNum + " x ");
        }catch (Exception e){
            workspace.setText("Error");
        }

    }
    public void inputDivision(){
        try{
            operation = 4;
            firstNum = Double.valueOf(workspace.getText().toString());
            workspace.setText("");
            equation_view.setText(firstNum + " \u00F7 ");
        }catch (Exception e){
            workspace.setText("Error");
        }

    }
    public void inputSquareRoot(){
        try{

            if (workspace.getText().toString().equals("0")){
                operation = 5;
                workspace.setText("");
                equation_view.setText("\u221A ");
            }
            else{
                operation = 6;
                lastNum = Double.valueOf(workspace.getText().toString());
                equation_view.setText(lastNum + "\u221A ");
            }
        }catch (Exception e){
            workspace.setText("Error");
        }
    }
    public void inputSquare(){
        try{
            operation = 7;
            lastNum = Double.valueOf(workspace.getText().toString());
            workspace.setText("");
            equation_view.setText(String.valueOf(lastNum) + "\u00b2");
        }catch (Exception e){
            workspace.setText("Error");
        }
    }
    public void powerTo(){
        try{
            operation = 8;
            firstNum = Double.valueOf(workspace.getText().toString());
            workspace.setText("");
            equation_view.setText(String.valueOf(firstNum) + " (pow) ");
        }catch (Exception e){
            workspace.setText("Error");
        }
    }
    public void naturalLog(){
        try{
            operation = 9;
            workspace.setText("");
            equation_view.setText("Ln(");
        }catch (Exception e){
            workspace.setText("Error");
        }
    }

    /**
     * Based on the operation input I will do the required operation when the equal sign is pressed
     */
    public void inputEqual(){
        double result;

        if (operation == 1) {
            lastNum = Double.valueOf(workspace.getText().toString());
            if (!equation_view.getText().toString().contains("=")){
                equation_view.append(String.valueOf(lastNum) + " =");
            }
            else{
                equation_view.setText(String.valueOf(firstNum) + " + " + String.valueOf(lastNum) + " = ");
            }

            try{
                result = firstNum + lastNum;
                if (result == Double.POSITIVE_INFINITY ||
                        result == Double.NEGATIVE_INFINITY || Double.isNaN(result))
                    throw new ArithmeticException();
                df.format(result);
                workspace.setText(String.valueOf(result));
            } catch (ArithmeticException e){
                workspace.setText("Error");
            }

        }
        else if (operation == 2){
            lastNum = Double.valueOf(workspace.getText().toString());
            if (!equation_view.getText().toString().contains("=")){
                equation_view.append(String.valueOf(lastNum) + " =");
            }
            else{
                equation_view.setText(String.valueOf(firstNum) + " - " + String.valueOf(lastNum) + " = ");
            }

            try{
                result = firstNum - lastNum;
                if (result == Double.POSITIVE_INFINITY ||
                        result == Double.NEGATIVE_INFINITY || Double.isNaN(result))
                    throw new ArithmeticException();
                df.format(result);
                workspace.setText(String.valueOf(result));
            } catch (ArithmeticException e){
                workspace.setText("Error");
            }
        }
        else if (operation == 3){
            lastNum = Double.valueOf(workspace.getText().toString());
            if (!equation_view.getText().toString().contains("=")){
                equation_view.append(String.valueOf(lastNum) + " =");
            }
            else{
                equation_view.setText(String.valueOf(firstNum) + " x " + String.valueOf(lastNum) + " = ");
            }
            try{
                result = firstNum * lastNum;
                if (result == Double.POSITIVE_INFINITY ||
                        result == Double.NEGATIVE_INFINITY || Double.isNaN(result))
                    throw new ArithmeticException();
                df.format(result);
                workspace.setText(String.valueOf(result));
            } catch (ArithmeticException e){
                workspace.setText("Error");
            }
        }
        else if (operation == 4){
            lastNum = Double.valueOf(workspace.getText().toString());
            if (!equation_view.getText().toString().contains("=")){
                equation_view.append(String.valueOf(lastNum) + " =");
            }
            else{
                equation_view.setText(String.valueOf(firstNum) + " \u00F7 " + String.valueOf(lastNum) + " = ");
            }
            try{
                result = firstNum / lastNum;
                if (result == Double.POSITIVE_INFINITY ||
                        result == Double.NEGATIVE_INFINITY || Double.isNaN(result))
                    throw new ArithmeticException();
                df.format(result);
                workspace.setText(String.valueOf(result));
            } catch (ArithmeticException e){
                workspace.setText("Error");
            }
        }
        else if (operation == 5){
            lastNum = Double.valueOf(workspace.getText().toString());
            if (!equation_view.getText().toString().contains("=")){
                equation_view.append(String.valueOf(lastNum) + " =");
            }
            try{
                result = Math.sqrt(lastNum);
                if (result == Double.POSITIVE_INFINITY ||
                        result == Double.NEGATIVE_INFINITY || Double.isNaN(result))
                    throw new ArithmeticException();
                df.format(result);
                workspace.setText(String.valueOf(result));
            } catch (ArithmeticException e){
                workspace.setText("Error");
            }
        }
        else if (operation == 6){
            if (!equation_view.getText().toString().contains("=")){
                equation_view.append(" =");
            }

            try{
                result = Math.sqrt(lastNum);
                if (result == Double.POSITIVE_INFINITY ||
                        result == Double.NEGATIVE_INFINITY || Double.isNaN(result))
                    throw new ArithmeticException();
                df.format(result);
                workspace.setText(String.valueOf(result));
            } catch (ArithmeticException e){
                workspace.setText("Error");
            }
        }
        else if (operation == 7){
            if (!equation_view.getText().toString().contains("=")){
                equation_view.append(" =");
            }

            try{
                result = Math.pow(lastNum,2);
                if (result == Double.POSITIVE_INFINITY ||
                        result == Double.NEGATIVE_INFINITY || Double.isNaN(result))
                    throw new ArithmeticException();
                df.format(result);
                workspace.setText(String.valueOf(result));
            } catch (ArithmeticException e){
                workspace.setText("Error");
            }
        }
        else if (operation == 8){
            lastNum = Double.valueOf(workspace.getText().toString());
            if (!equation_view.getText().toString().contains("=")){
                equation_view.append(String.valueOf(lastNum) + " = ");
            }

            try{
                result = Math.pow(firstNum,lastNum);
                if (result == Double.POSITIVE_INFINITY ||
                        result == Double.NEGATIVE_INFINITY || Double.isNaN(result))
                    throw new ArithmeticException();
                df.format(result);
                workspace.setText(String.valueOf(result));
            } catch (ArithmeticException e){
                workspace.setText("Error");
            }
        }
        else if (operation == 9){
            lastNum = Double.valueOf(workspace.getText().toString());
            if (!equation_view.getText().toString().contains("=")){
                equation_view.append(String.valueOf(lastNum) + ") = ");
            }

            try{
                result = Math.log(lastNum);
                if (result == Double.POSITIVE_INFINITY ||
                        result == Double.NEGATIVE_INFINITY || Double.isNaN(result))
                    throw new ArithmeticException();
                df.format(result);
                workspace.setText(String.valueOf(result));
            } catch (ArithmeticException e){
                workspace.setText("Error");
            }
        }



    }

    /**
     * outputs percentage value of a number in the result
     */
    public void inputPercentage(){
        double num = Double.parseDouble(workspace.getText().toString());
        num = (num*100);
        workspace.setText(String.valueOf(num));
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
