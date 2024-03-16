package EjerciciosPractica0;
import java.util.Scanner;

public class Ejercicio17 {
	
	static int cantidadApariciones(String s, char c) {
		
		int cont = 0;
		for(int x = 0; x < s.length(); x++) {
			if(s.charAt(x) == c) cont += 1;
		}
		
		return cont;
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Ingrese una palabra o frase, y un caracter: ");

		String cadena = scan.nextLine();
		String primerLetra = scan.nextLine();
		char caracter = primerLetra.charAt(0);
		System.out.print(caracter);
		
		
		System.out.print("El caracter aparece " + cantidadApariciones(cadena, caracter) + " veces.");
	}

}
