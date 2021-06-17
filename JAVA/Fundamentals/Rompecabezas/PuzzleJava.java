import java.util.*;
import java.nio.charset.*;

public class PuzzleJava{
	
	private Random rand = new Random();
	
	public ArrayList sumaArray(int [] numeros){
		int suma = 0;
		ArrayList <Integer> mayores = new ArrayList<>();
		for(int i = 0; i < numeros.length; i++){
			suma += numeros[i];
			if(numeros[i] > 10){
				mayores.add(numeros[i]);
			}
		}
		System.out.println("La suma de todos los numeros del array es: " + suma + ".");
		return mayores;	
	}
	
	public ArrayList nombresArray(){
		ArrayList <String> nombres = new ArrayList<>();
		ArrayList <String> nombres_largos = new ArrayList<>();
		nombres.add("Nancy");
		nombres.add("Jinichi");
		nombres.add("Fujibayashi");
		nombres.add("Momochi");
		nombres.add("Ishikawa");
		
		Collections.shuffle(nombres);
		
		for(int i = 0; i < nombres.size(); i++){
			if(nombres.get(i).length() > 5){
				nombres_largos.add(nombres.get(i));
			}
		}
		return nombres_largos;
	}
	
	public void alphabetList(){
		ArrayList <Character> alfabeto = new ArrayList<>();
		alfabeto.add('a');
		alfabeto.add('b');
		alfabeto.add('c');
		alfabeto.add('d');
		alfabeto.add('e');
		alfabeto.add('f');
		alfabeto.add('g');
		alfabeto.add('h');
		alfabeto.add('i');
		alfabeto.add('j');
		alfabeto.add('k');
		alfabeto.add('l');
		alfabeto.add('m');
		alfabeto.add('n');
		alfabeto.add('o');
		alfabeto.add('p');
		alfabeto.add('q');
		alfabeto.add('r');
		alfabeto.add('s');
		alfabeto.add('t');
		alfabeto.add('u');
		alfabeto.add('v');
		alfabeto.add('w');
		alfabeto.add('x');
		alfabeto.add('y');
		alfabeto.add('z');
		
		Collections.shuffle(alfabeto);
		
		int last = alfabeto.size() - 1;
		String vocales = "aeiouAEIOU";
		
		System.out.println("El último caracter del arreglo es: " + alfabeto.get(last) + ".");
		System.out.println("El primer caracter del arreglo es: " + alfabeto.get(0) + ".");
		if(vocales.indexOf( alfabeto.get(0)) >= 0){
			System.out.println("El primer caracter es una vocal.");
		};
	}
	
	public int [] randomNumber(){
		int [] numeros = new int [30];
		for(int i = 0; i < numeros.length; i++){
			numeros[i] = rand.nextInt(100 - 55) + 55;
					}
		return numeros;
	}
	
	public ArrayList orderedList(){
		ArrayList <Integer> numeros = new ArrayList<>();
		for(int i = 0; i < 10; i++){
			numeros.add( rand.nextInt(100 - 55) + 55 );
		}
		Collections.sort(numeros);
		
		return numeros;
	}
	
	public String randomString(int size){
		byte[] array = new byte[size];
		rand.nextBytes(array);
		String randString = new String(array, Charset.forName("UTF-8"));
		//System.out.println("El String generado es: " + randString);
		return randString;
	}
	
	public void randStringList(){
		ArrayList <String> stringList = new ArrayList<>();
		for (int i = 0; i < 10; i++){
			stringList.add( randomString(5) );
		}
		System.out.println(stringList);
	}
		
}