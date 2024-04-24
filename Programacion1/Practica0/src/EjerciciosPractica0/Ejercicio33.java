package EjerciciosPractica0;

public class Ejercicio33 {

	static int mcd(int a, int b) {
		int r = 0;
		if(b == 0) {
			return 0;
		}
		if(a%b == 0) {
			return b;
		}
		else {
		r = a%b;
		int x = mcd(b, r);
		return x;
		}
	}
	
	public static void main(String[] args) {
		
		int a = 64;
		int b = 12;
		
		System.out.print("el mcd de a y b es: " + mcd(a, b));
		
	}

}
