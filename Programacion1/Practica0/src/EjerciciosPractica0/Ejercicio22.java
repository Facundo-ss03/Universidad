package EjerciciosPractica0;
import java.util.Scanner;

public class Ejercicio22 {

	static boolean esSinRepetidos(String cadena) {
		
		int i = 0;
		int cont = 0;
		char menosCaracter;
		while(i < cadena.length()) {
			char caracter = cadena.charAt(i);
			for(int x = 0; x < cadena.length(); x++) {
				if(caracter == cadena.charAt(x)) {
					cont += 1;
					menosCaracter = caracter;
				}
			}
			i++;
		}

		i = 0;
		
		if(i == 0) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print(esSinRepetidos(scan.nextLine()));
		
	}

}
