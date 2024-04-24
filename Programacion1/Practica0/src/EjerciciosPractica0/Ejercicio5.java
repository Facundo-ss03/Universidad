package EjerciciosPractica0;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Ingrese dos números: ");
		float promedio = (scan.nextFloat() + scan.nextFloat())/2;
		
		System.out.println("El promedio es: " + promedio);
	}

}
