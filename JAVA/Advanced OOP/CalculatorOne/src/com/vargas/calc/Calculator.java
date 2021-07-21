package com.vargas.calc;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<String> calc = new ArrayList<>();
    private double numberOne;
    private double numberTwo;
    private String result;
    private String operator;


    public void setNumberOne(double number) {
        this.numberOne = number;
    }

    public void setNumberTwo(double number) {
        this.numberTwo = number;
    }

    public void setOperation(String op) {
        this.operator = op;
    }

    public void performOperation(){
        switch(operator){
            case "+":   result = Double.toString( this.numberOne + this.numberTwo);
                break;
            case "-":   result = Double.toString(this.numberOne - this.numberTwo);
                break;
            case "*":   result = Double.toString(this.numberOne * this.numberTwo);
                break;
            case "/":
                if(this.numberTwo == 0){
                    //Snackbar.make(findViewById(R.id.numberView), "No puedo dividir por 0",Snackbar.LENGTH_SHORT).show();
                    this.result = "No se puede dividir por 0!!!";
                } else {
                    result = Double.toString(this.numberOne / this.numberTwo);
                }
                break;
        }
    }

    public String getResult() {
        return this.result;
    }
}
