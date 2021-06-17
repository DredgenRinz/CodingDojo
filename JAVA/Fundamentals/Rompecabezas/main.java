public class main{
	
	public static void main (String [] args){
		PuzzleJava metods = new PuzzleJava();
		
		//1 Suma números
		int [] ej1 = {3,5,1,2,7,9,8,13,25,32};
		System.out.println("los numeros mayores que 10 son: " + metods.sumaArray(ej1));
		
		//2 Nombres
		System.out.println("Los nombres con más de 5 letras son: " + metods.nombresArray());
		
		//3 Alfabeto
		metods.alphabetList();
		
		//4 números aleatorios
		System.out.println("Los números generados son: " + metods.randomNumber());
		
		//5 números aleatorios ordenados
		System.out.println("Los números generados ordenados son: " + metods.orderedList());
		
		//6 String random
		System.out.println("El String generado es: " + metods.randomString(7));
		
		//7 Array de String aleatorios
		System.out.println("Los Strings generados son: ");
		metods.randStringList();
	}
}()