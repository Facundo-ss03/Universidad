package Ejercicios;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Ejercicio1 {

	public static void main(String[] args) {

		System.out.print(tieneRepetidos());
	}

	static public int tieneRepetidos() {
		int n = 5;
		int k = 5;
		int x = 0;

		int i = 0;
		while(i < n) {
			
			x += n*(n-k+1);
			
			System.out.print(n-k+1 + " : " +i +" : "+k + "/");
			k--;
			i++;
		}
		x=x*n;
		return x;
	}
}
