package EjerciciosPractica0;
import java.util.Scanner;

public class Ejercicio10 {

	static int sumatoria(int n) {
		int suma = 0;
		int acu = 0;
		for(int x = 1; x < n; x++) {
			suma = acu += x;
		}
		return suma;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese un número: ");
		System.out.println(sumatoria(scan.nextInt()));
	}

}
