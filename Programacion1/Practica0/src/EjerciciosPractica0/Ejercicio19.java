package EjerciciosPractica0;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String abecedario = "abcdefghijklmnñopqrstuvwxyz";
		String palabra = "adios";
		
//		int cont = 0;
//		for(int x = 0; x < palabra.length(); x++) {
//			char caracter = palabra.charAt(x);
//			for(int i = 0; i < abecedario.length(); i ++) {
//				if(caracter == abecedario.charAt(i)) {
//					cont += 1;
//				}
//			}
//		}
		
		String caracteres = "";
		
//		guardamos las letras de la palabra en una cadena
		
		for(int x = 0; x < palabra.length(); x++) {
			caracteres += palabra.charAt(x);
		}

		int indices[] = new int[caracteres.length()];
		System.out.print(indices);
		int i = 0;
		int x = 0;
		int indice = 0;
		while(i < abecedario.length()) {
	
			if(caracteres.charAt(x) == abecedario.charAt(i)) {
				indices[indice] = i; 
				x++;
				i = 0;
			}
			else i++;
		}
		
		boolean bandera = true;
		for(int j = 0; x < caracteres.length(); x++) {
			if(indices[j] <= indices[j+1]) {
				bandera = true;
			}
			else bandera = false;
		}
		
		if(bandera == true) {
			System.out.print("La palabra es alfabética.");
		}
	}
}
