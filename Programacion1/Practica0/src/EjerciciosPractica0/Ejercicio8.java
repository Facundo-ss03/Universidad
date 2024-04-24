package EjerciciosPractica0;
import java.util.Scanner;

public class Ejercicio8 {
	
	static void ponerNota(float x, float y) {
		float promedio = (x + y)/2;
		
		if(promedio >= 7) {
			System.out.println("Promocionado.");
		}
		else if (promedio >= 4 && promedio < 7) {
			System.out.println("Aprobado.");
		}
		else System.out.println("Debe recuperar.");
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Ingrese dos números");
		
		ponerNota(scan.nextFloat(), scan.nextFloat());
	}

}
