public class main{
	public static void main (String [] args){
		BasicJava methods = new BasicJava();
		
		//Imprime hasta el 255
		methods.printTo();
		//Imprime los impares
		methods.printOdds();
		//Imprime la suma de los 255
		methods.printSum();
		//Mostrar Valores
		int [] temp = {1,3,5,7,9,13};
		methods.printValues(temp);
		//Mostrar el Mayor (incl negativos)
		int [] temp2 = {-3,-5,-7};
		methods.printMax(temp2);
		//Devuelve el promedio de la Matriz
		int [] temp3 = {2,10,3};
		methods.printProm(temp3);
		//Devuelve los primos en un array
		methods.printArrayOdds();
		//Cuenta loa valores mayor que el valor dado
		int [] temp4 = {1,3,5,7};
		methods.printArrayMax(temp4, 3);
		//Valores del array al cuadrado
		int [] temp5 = {1,5,10,-2};
		methods.printCube(temp5);
		//cambia los valores negativos por un 0
		int [] temp6 = {1,5,10,-2};
		methods.printDelNegatives(temp6);
		//Devuelve y muestra los min max y prom del array
		int [] temp7 = {1,5,10,-2};
		methods.showmmp(methods.printMinMaxProm(temp7));
		//Mueve los valores hacia atras del array
		int [] temp8 = {1,5,10,7,-2};
		methods.show( methods.returnInverse(temp8) );
	}
}