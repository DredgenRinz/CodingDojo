/**
 * 
 */
package com.croamo.calculadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author croamora
 *
 */
public class Calculadora2 {
	
	static List<Object> operacion = new ArrayList<Object>();
	
	
	public static void main(String[] args) {
		performOperation();
	}
	
	private static void performOperation(){
		Scanner scan = new Scanner(System.in);
		System.out.println("**************************************");
		System.out.println("Bienvenido a la calculadora del profecional");
		System.out.println("**************************************");
		String dato = "";	
		while (!dato.equalsIgnoreCase("=")) {
			System.out.println("Ingrese un Número");
			double num = scan.nextDouble();
			operacion.add(num);
			System.out.println("Ingrese la Operación");
			dato = scan.next();
			operacion.add(dato);
		}
		
		System.out.println(getResult());
	}
	
	
	private static String getResult(){
		List<Object> operacionMultiplicar = calculaMultiplicacion(operacion);
		List<Object> operacionDividir = calculaDivision(operacionMultiplicar);
		List<Object> operacionSuma = calculaSuma(operacionDividir);
		List<Object> operacionResta = calculaResta(operacionSuma);
		
		return "El Resultado es " + operacionResta.get(0);
	}

	
	
	private static List<Object> calculaResta(List<Object> operacion) {
		List<Object> nueva = new ArrayList<Object>();
		int contPrincipal = 0;
		int contNueva = 0;
		boolean encontroMultiplicacion = false;
		
		for (Object object : operacion) {
			if(!encontroMultiplicacion) {
				if(!(object instanceof String)) {
					nueva.add(object);
				}else {
					String operador = (String)object;
					if(operador.equalsIgnoreCase("-")) {
						double numeroAnterior = (double)operacion.get(contPrincipal-1);
						double numeroSiguiente = (double)operacion.get(contPrincipal+1);
						nueva.remove(contNueva-1);
						nueva.add((numeroAnterior - numeroSiguiente));
						encontroMultiplicacion = true;
					}else {
						nueva.add(object);
					}
					
				}
				contNueva ++;
			}else {
				encontroMultiplicacion = false;
			}
			
			contPrincipal ++;
		}
		
		return nueva;
	}
	
	private static List<Object> calculaSuma(List<Object> operacion) {
		List<Object> nueva = new ArrayList<Object>();
		int contPrincipal = 0;
		int contNueva = 0;
		boolean encontroMultiplicacion = false;
		
		for (Object object : operacion) {
			if(!encontroMultiplicacion) {
				if(!(object instanceof String)) {
					nueva.add(object);
				}else {
					String operador = (String)object;
					if(operador.equalsIgnoreCase("+")) {
						double numeroAnterior = (double)operacion.get(contPrincipal-1);
						double numeroSiguiente = (double)operacion.get(contPrincipal+1);
						nueva.remove(contNueva-1);
						nueva.add((numeroAnterior + numeroSiguiente));
						encontroMultiplicacion = true;
						
					}else {
						nueva.add(object);
					}
					
				}
				contNueva ++;
			}else {
				encontroMultiplicacion = false;
			}
			
			contPrincipal ++;
		}
		
		
		return nueva;
	}
	
	
	private static List<Object> calculaDivision(List<Object> operacion) {
		List<Object> nueva = new ArrayList<Object>();
		int contPrincipal = 0;
		int contNueva = 0;
		boolean encontroMultiplicacion = false;
		
		for (Object object : operacion) {
			if(!encontroMultiplicacion) {
				if(!(object instanceof String)) {
					nueva.add(object);
				}else {
					String operador = (String)object;
					if(operador.equalsIgnoreCase("/")) {
						double numeroAnterior = (double)operacion.get(contPrincipal-1);
						double numeroSiguiente = (double)operacion.get(contPrincipal+1);
						nueva.remove(contNueva-1);
						nueva.add((numeroAnterior / numeroSiguiente));
						encontroMultiplicacion = true;
					}else {
						nueva.add(object);
					}
					
				}
				contNueva ++;
			}else {
				encontroMultiplicacion = false;
			}
			
			contPrincipal ++;
		}
		
		
		return nueva;
	}
	
	
	private static List<Object> calculaMultiplicacion(List<Object> operacion) {
		List<Object> nueva = new ArrayList<Object>();
		int contPrincipal = 0;
		int contNueva = 0;
		boolean encontroMultiplicacion = false;
		
		for (Object object : operacion) {
			if(!encontroMultiplicacion) {
				
				if(!(object instanceof String)) {
					nueva.add(object);
				}else {
					String operador = (String)object;
					if(operador.equalsIgnoreCase("*")) {
						double numeroAnterior = (double)operacion.get(contPrincipal-1);
						double numeroSiguiente = (double)operacion.get(contPrincipal+1);
						nueva.remove(contNueva-1);
						nueva.add((numeroAnterior * numeroSiguiente));
						encontroMultiplicacion = true;
					}else {
						nueva.add(object);
					}
					
				}
				contNueva ++;
			}else {
				encontroMultiplicacion = false;
			}
			
			contPrincipal ++;
		}
		
		
		return nueva;
	}
	

}
