import java.lang.Math;

public class Pitagoras {
	
	public double calcularHipotenusa(int catA, int catB){
		double hipo = (catA*catA) + (catB*catB);
		hipo = Math.sqrt(hipo);
		return hipo;
	}
	
}