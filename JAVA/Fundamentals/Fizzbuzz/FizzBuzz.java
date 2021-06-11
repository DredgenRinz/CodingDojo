public class FizzBuzz {
	public String fizzBuzz(int numb){
		if(numb % 3 == 0){
			System.out.println("Fizz");
		} else if(numb % 5 == 0){
			System.out.println("Buzz");
		} else if(numb % 3 == 0 && numb % 5 == 0){
			System.out.println("FizzBuzz");
		} else {
			System.out.println("Ninguna coincidencia con: "+numb);
		}
		return null;
	}
}