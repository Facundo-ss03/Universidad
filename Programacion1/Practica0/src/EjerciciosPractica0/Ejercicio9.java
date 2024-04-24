package EjerciciosPractica0;
import java.util.Scanner;

public class Ejercicio9 {
	
	static void imprimirFecha(int dia, int mes, int anio) {
		String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		System.out.println(dia + " del " + meses[mes-1] + " de " + anio);
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Ingrese una fecha:");
		
		imprimirFecha(scan.nextInt(), scan.nextInt(), scan.nextInt());
		
	}

}
