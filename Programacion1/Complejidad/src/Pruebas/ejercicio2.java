package Pruebas;

public class ejercicio2 {
	
	static int calculo(int[] a){
	int res = 0;
	for (int i = 0; i < a.length; i++) {
		int x = 0;
			for (int j = 0; j < a.length; j++) {
				int y = 0;
				for (int k = 0; k < 100; k++) {
					y++;
				}
				x += a[j] * y;
			}
		res += x;
	}
	return res;
}
	static int calculo2(int[] a) {
		int res = 0;
		int x = 0;
		for(int i = 0; i < a.length; i ++) {
			x += a[i] * 100;
		}
		res += x*a.length;
		return res;
	}

	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = 2;
		a[1] = 7;
		a[2] = 12;
		a[3] = 9;
		a[4] = 15;

		System.out.print(calculo(a));
		System.out.print(calculo2(a));	
		
	}

}
