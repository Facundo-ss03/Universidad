package EjerciciosPractica0;
import java.util.Scanner;

public class Ejercicio20 {
	
	static boolean esCapicua(String cadena) {
		
		String cadenaNueva = "";
		for(int i = cadena.length()-1; i >= 0; i--) {
			cadenaNueva += cadena.charAt(i);
			}
		
		if(cadena.equals(cadenaNueva)) 
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Ingrese una palabra: ");
		
		if(esCapicua(scan.nextLine())) {
			System.out.print("La palabra es Capícula");
		}
		else {	
			
			System.out.print("La palabra no es Capícula");
			
		}
		
	}

}
