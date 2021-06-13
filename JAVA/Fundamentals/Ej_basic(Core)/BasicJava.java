import java.util.ArrayList;

public class BasicJava{
	public void printTo255(){
		for(int i = 0; i < 256; i++){
			System.out.println("Imprimiendo, el número es " + i + ";");
		}
	}
	
	public void printOdds(){
		for(int i = 0; i < 256; i++){
			if(i % 2 != 0){
				System.out.println("Imprimiendo, el número impar es " + i + ";");
			}
		}
	}
	
	public void printSum(){
		int suma = 0;
		for(int i = 0; i < 256; i++){
			suma += i;
			System.out.println("Imprimiendo, el número es: " + i + ", y la suma es: " + suma + ";");
		}
	}
		
	public void printValues(int [] arrayA){
		for(int i = 0; i < arrayA.length; i++){
			System.out.println("Imprimiendo, el número en la pos " + i + " es " + arrayA[i] + ".");
		}
	}
	
	public void printMax(int [] arrayA){
		int max = 0;
		for(int i = 0; i < arrayA.length; i++){
			if(arrayA[i] < max){
				max = arrayA[i];
			}
		}
		System.out.println("El número mayor fue " + max + ";");
	}
	
	public void printProm(int [] arrayA){
		int prom = 0;
		for(int i = 0; i < arrayA.length; i++){
			prom += arrayA[i];
		}
		prom /= arrayA.length;
		System.out.println("El promedio del array es " + prom + ".");
	}
	
	public void printArrayOdds(){
		ArrayList<Integer> odds = new ArrayList<>();
		for(int i = 1; i < 256; i++){
			if(i % 2 != 0){
				odds.add(i);
			}
		}
	}
	
	public void printArrayMax(int [] arrayA, int key){
		int cont = 0;
		for(int i = 0; i < arrayA.length; i++){
			if(arrayA[i] > key){
				cont++;
			}
		}
		System.out.println("Habia " + cont + " Números mayores que " + key +".");
	}
	
	public void printCube(int [] arrayA){
		for(int i = 0; i < arrayA.length; i++){
			arrayA[i] *= arrayA[i];
		}
		for (int i = 0; i < arrayA.length; i++){
			System.out.println("El número pos " + i + " Es ahora " + arrayA[i] + ".");
		}
	}
	
	public void printDelNegatives(int [] arrayA){
		for(int i = 0; i < arrayA.length; i++){
			if(arrayA[i] < 0){
				arrayA[i] = 0;
			}
		}
		for (int i = 0; i < arrayA.length; i++){
			System.out.println("El número pos " + i + " Es ahora " + arrayA[i] + ".");
		}
	}
	
	public int [] printMinMaxProm(int [] arrayA){
		int min = 0;
		int max = 0;
		int prom = 0;
		for(int i = 0; i < arrayA.length; i++){
			if(arrayA[i] < min){
				min = arrayA[i];
			}
			if(arrayA[i] > max){
				max = arrayA[i];
			}
			prom += arrayA[i];
		}
		prom /= arrayA.length;
		int [] ret = new int[]{max, min, prom};
		return ret;
	}
	
	public int [] returnInverse(int [] arrayA){
		for(int i = 0; i < arrayA.length; i++){
			if(i != arrayA.length-1){
				arrayA[i] = arrayA[i+1];
			} else {
				arrayA[i] = 0;
			}
		}
		
		return arrayA;
	}
	
}