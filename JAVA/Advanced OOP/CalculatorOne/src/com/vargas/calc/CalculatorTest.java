package com.vargas.calc;

import java.util.Scanner;

public class CalculatorTest{


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        boolean error = true;

        System.out.println("Bienveindo....");
        System.out.println("Ingrese el número 1:");

        while(error == true){
            try {
                calc.setNumberOne(Double.parseDouble(scan.nextLine()));
                error = false;
            } catch (Exception e) {
                System.out.println("Error, número ingresado no válido");
                System.out.println("Ingrese el número 1:");
            }
        }

        System.out.println("Ingrese operador:");
        calc.setOperation(scan.nextLine());

        System.out.println("Ingrese el número 2");
        error = true;
        while(error == true){
            try {
                calc.setNumberTwo(Double.parseDouble(scan.nextLine()));
                error = false;
            } catch (Exception e) {
                System.out.println("Error, número ingresado no válido");
                System.out.println("Ingrese el número 2:");
            }
        }
        calc.performOperation();

        System.out.println("El resultado es: " + calc.getResult());
        scan.close();
    }
}