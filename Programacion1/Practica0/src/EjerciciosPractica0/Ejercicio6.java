package EjerciciosPractica0;
import java.util.Scanner;

public class Ejercicio6 {
	
	static void imprimirSuma(int a, int b) {
		System.out.println("La suma es: " + (a+b));
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese dos números: ");
		
		imprimirSuma(scan.nextInt(), scan.nextInt());
	}

}
