package acumuladores;

public class Acumuladores {
	
	public boolean todosMultiplosEnAlgunaFila(int[][] mat, int num) {
		
		boolean matrizVacia = mat == null || mat.length == 0;
	    boolean numeroNoPositivo = num <= 0;
	    boolean resultado = !matrizVacia && !numeroNoPositivo;

		if(resultado == true) {
		    for(int fila = 0; fila < mat.length; fila++) {
				boolean filaMultiplo = true;
				
				filaMultiplo = iterarColumnas(mat[fila], filaMultiplo, num);
				/*
				for(int col = 0; col < mat[0].length; col++) {
	
					filaMultiplo = filaMultiplo && esMultiplo(mat[fila][col], num);
	
				}
				*/
				resultado = !resultado && !filaMultiplo;
				
			}
		}
		return resultado;
	}
	
	private boolean iterarColumnas(int[] fila, boolean mul, int num) {
		for(int col = 0; col < fila.length; col++) {
			
			mul = mul && esMultiplo(fila[col], num);

		}
		return mul;
	}
	
	private boolean esMultiplo(int a, int b) {
		if(a%b == 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
