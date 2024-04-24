package cfggdfsxdfg;

public class ejemplo1 {
	
	static int sumatoriaRec(int n) {
		
		if(n == 0) {
			return 0;
		}
		else {
			return n + sumatoriaRec(n-1);
		}
		
	}

	public static void main(String[] args) {
		
		int num = 3;
		System.out.println(sumatoriaRec(num));

	}

}
