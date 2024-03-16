package EjerciciosPractica0;
import java.util.Scanner;

public class Ejercicio15 {

	static boolean esDivisible(int n, int m) {
		if (n%m == 0) return true;
		else return false;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Ingrese dos números: ");
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		if(esDivisible(n, m)) {
			System.out.print("El número n es divisible por m.");
		}
		else {
			System.out.print("El número n no es divisible por m.");
		}
	}

}
