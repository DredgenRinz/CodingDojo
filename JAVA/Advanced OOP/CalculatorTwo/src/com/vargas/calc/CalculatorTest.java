package com.vargas.calc;

import java.util.Scanner;

public class CalculatorTest{


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        boolean salir = true;

        System.out.println("Bienveindo....");
        System.out.println("Ingrese datos, puede señalar el fin de la operación con =:");

        while(salir == true){
            String temp = scan.nextLine();
            calc.performOperation(temp);
            if(temp.contains("=")){
                salir = false;
            } else {
                System.out.println("Ingrese otro dato");
            }
        }

        System.out.println("El resultado es: " + calc.getResult());
        scan.close();
    }
}