package EjerciciosPractica0;
import java.util.Scanner;

public class Ejercicio16 {

	static void imprimirReversa(String cadena) {

		System.out.print(reversa(cadena));
		
		}
	
	static String reversa(String cadena) {
		
		String cadenaNueva = "";
		for(int i = cadena.length()-1; i >= 0; i--) {
			cadenaNueva += cadena.charAt(i);
			}
		
		return cadenaNueva;
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Escriba algo:");
		imprimirReversa(scan.nextLine());
		
	}

}
