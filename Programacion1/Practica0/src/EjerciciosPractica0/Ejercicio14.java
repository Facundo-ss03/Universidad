package EjerciciosPractica0;
import java.util.Scanner;

public class Ejercicio14 {

	static double cantCifras(double n){
		
		if(n == 0) n++;
		System.out.println(Math.floor(Math.log10(Math.abs(n)) + 1));
		double cantidad = Math.floor(Math.log10(Math.abs(n)) + 1);
		return cantidad;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Ingrese un número: ");
		double numero = scan.nextDouble();
		
		System.out.print("El número " + numero + " tiene " + cantCifras(numero) + "dígitos.");

	}

}
