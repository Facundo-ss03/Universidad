package EjerciciosPractica0;
import java.util.Scanner;

public class Ejercicio12 {
	
	static double potencia(double x, int a) {
		double acu = x;
		for(int i = 1; i < a; i++) {
			acu = acu * x;
		}
		return acu;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Ingrese un número y un exponente: ");
		System.out.println(potencia(scan.nextDouble(), scan.nextInt()));

	}

}
