package EjerciciosPractica0;
import java.util.Scanner;

public class Ejercicio18 {

	static int cantidadVocales(String s) {
		int cont = 0;
		for(int x = 0; x < s.length(); x++) {
			if(s.charAt(x) == 'a' 
				|| s.charAt(x) == 'e' 
				|| s.charAt(x) == 'i' 
				|| s.charAt(x) == 'u' 
				||s.charAt(x) == 'o' 
				||s.charAt(x) == 'á' 
				||s.charAt(x) == 'é' 
				||s.charAt(x) == 'í' 
				||s.charAt(x) == 'ó' 
				||s.charAt(x) == 'ú') {
				cont += 1;
			}
		}
		return cont;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Ingrese una palabra: ");
		
		System.out.print("La palabra tiene " + cantidadVocales(scan.nextLine()) + " vocales.");
		
	}

}
