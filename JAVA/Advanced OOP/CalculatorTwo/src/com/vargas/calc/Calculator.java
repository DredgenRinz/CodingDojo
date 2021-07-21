package com.vargas.calc;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<String> calc = new ArrayList<>();
    private String result;
    private boolean prevWasOp = true;
    private boolean prevWasNum = false;

    public void performOperation(String value){
        if(!value.contains("=")){
            
            if(prevWasNum){
                if(value.contains("+") || value.contains("-") || value.contains("*") || value.contains("/")){
                    calc.add(value);
                    prevWasNum = !prevWasNum;
                    prevWasOp = !prevWasOp;
                } else {
                    System.out.println("No puedes ingresar 2 números seguidos!!!");
                }
            } else {
                if(prevWasOp){
                    try{
                        Double.parseDouble(value);
                        calc.add(value);
                        prevWasNum = !prevWasNum;
                        prevWasOp = !prevWasOp;
                    } catch (Error e) {
                        System.out.println("El valor ingresado no es número!!!");    
                    }
                } else {
                    System.out.println("No puedes agregar 2 operadores seguidos!!!");
                }
            }
        }
        
    }

    public String getResult() {
        makeOperation();
        return this.result;
    }

    private void makeOperation() {
        while(calc.size() > 1){
            findOperation("*");
            findOperation("/");
            findOperation("+");
            findOperation("-");
        }
    }

    public void findOperation(String ope){
        if(calc.contains(ope)){
            for(int i = 0; i < calc.size(); i++){
                if(calc.get(i).contains(ope)){
                    doCalc(Double.parseDouble(calc.get(i-1)), Double.parseDouble(calc.get(i+1)), calc.get(i));
                    calc.remove(i+1);
                    calc.remove(i);
                    calc.remove(i-1);
                    calc.add(result);
                }
            }
        }
    }

    private void doCalc(double numberOne, double numberTwo, String operator){
        switch(operator){
            case "+":   result = Double.toString( numberOne + numberTwo);
                break;
            case "-":   result = Double.toString(numberOne - numberTwo);
                break;
            case "*":   result = Double.toString(numberOne * numberTwo);
                break;
            case "/":
                if(numberTwo == 0){
                    //Snackbar.make(findViewById(R.id.numberView), "No puedo dividir por 0",Snackbar.LENGTH_SHORT).show();
                    this.result = "0";
                } else {
                    result = Double.toString(numberOne / numberTwo);
                }
                break;
            default: System.out.println("Algo FALLO!!!");
        }

        
    }
}
