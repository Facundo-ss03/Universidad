package EjerciciosPractica0;
import java.util.Scanner;

public class Ejercicio7 {
	
	static void imprimirPromedio(float a, float b) {
		System.out.println("El promedio es: " + (a+b)/2);
		
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
			
		System.out.println("Ingrese dos números: ");
			
		imprimirPromedio(scan.nextFloat(), scan.nextFloat());

	}

}
