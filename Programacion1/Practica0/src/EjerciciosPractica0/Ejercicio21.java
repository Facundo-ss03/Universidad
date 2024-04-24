package EjerciciosPractica0;
import java.util.Scanner;

import java.util.Scanner;

public class Ejercicio21 {

	static boolean esSinRepetidos(String cadena) {
		
		boolean bandera = true;
		
		int i = 0;
		int cont = 0;
		while(i < cadena.length()) {
			char caracter = cadena.charAt(i);
			for(int x = 0; x < cadena.length(); x++) {
				if(caracter == cadena.charAt(x)) {
					cont += 1;
				}
			}
			i++;
		}
		
		if(cont == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Ingrese una palabra: ");
		
		System.out.print(esSinRepetidos(scan.nextLine()));
	}

}
