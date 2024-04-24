package EjerciciosPractica0;
import java.util.Scanner;

import java.util.Scanner;

public class Ejercicio13 {
	
	static int factorial(int n) {
		if(n == 0) {
			return 1;
		}

		int acu = n;
		for(int i = (n-1); i > 0; i--) {
			acu = acu * i;
		}
		return acu;
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese un número: ");
		int numero = scan.nextInt();
		System.out.println("El factorial del número " + numero + " es " + factorial(numero));
	}

}
