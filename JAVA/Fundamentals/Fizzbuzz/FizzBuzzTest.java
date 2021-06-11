import java.util.Scanner;
public class FizzBuzzTest{
	public static void main (String [] args){
		FizzBuzz fb = new FizzBuzz();
		Scanner scan = new Scanner(System.in);
		int numb = 0;
		System.out.println("Dame un número y veamos que pasa:");
		try{
			numb = scan.nextInt();
			fb.fizzBuzz(numb);
		} catch(Error e){
			System.out.println("Lo ingresado no es un número, intenta de nuevo");
		}
		
	}
}