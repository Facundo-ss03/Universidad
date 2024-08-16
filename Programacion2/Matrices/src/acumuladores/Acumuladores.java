package acumuladores;

public class Acumuladores {
	
	public boolean todosMultiplosEnAlgunaFila(int[][] mat, int num) {
		
		boolean matrizVacia = mat == null || mat.length == 0;
	    boolean numeroNoPositivo = num <= 0;
	    boolean resultado = !matrizVacia && !numeroNoPositivo;

		if(resultado == true) {
			
			resultado = false;
		    for(int fila = 0; fila < mat.length; fila++) {
		    	
				boolean filaMultiplo = tieneFilaMultiplo(mat[fila], num);
				
				resultado = resultado || filaMultiplo;
				
			}
		}
		return resultado;
	}
	
	private boolean tieneFilaMultiplo(int[] fila, int num) {
		
		boolean filaMultiplo = true;
		
		for(int col = 0; col < fila.length; col++) {
			
			filaMultiplo = filaMultiplo && esMultiplo(fila[col], num);

		}
		return filaMultiplo;
	}
	
	private boolean esMultiplo(int a, int b) {
		if(a%b == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean hayInterseccionPorFila(int[][] mat1, int[][] mat2) {
		
		boolean res = true;

		if(mat1.length != mat2.length) {
			res = false;
		}
		if(mat1.length == 0 || mat2.length == 0) {
			res = false;
		}
		if(mat1 == null || mat2 == null) {
			res = false;
		}
		
		if(res == true) {

			for(int fila = 0; fila < mat1.length; fila++) {

				res = res && tieneInterseccion(mat1[fila], mat2[fila]);
				
			}
			
		}
		
		return res;
	}
	
	private boolean tieneInterseccion(int[] mat1, int[] mat2) {
		boolean hayCompartidos = false;

			for(int col = 0; col < mat1.length; col++) {
				
				hayCompartidos = hayCompartidos || contiene(mat1[col], mat2);
				
			}
			
		return hayCompartidos;
		
	}
	
	private boolean contiene(int a, int[] b) {
		
		for(int valores = 0; valores < b.length; valores++) {
			if(a == b[valores]) return true;
		}
		
		return false;
	}

	public boolean algunaFilaSumaMasQueLaColumna(int[][] mat, int nColum) {
		boolean res = false;
		
		if(mat.length == 0 || nColum >= mat[0].length || nColum < 0) return false;

		int sumaDeColumna = sumarColumna(mat, nColum);
		int sumaTotal = 0;
		
		for(int fila = 0; fila < mat.length; fila++) {
			for(int col = 0; col < mat[fila].length; col++) {

				sumaTotal += mat[fila][col];
				
			}
			res = res || (sumaTotal > sumaDeColumna);
			sumaTotal = 0;
		}
		
		return res;
	}
	
	private int sumarColumna(int[][] mat, int nColum) {

		int acu = 0;
		for(int fila = 0; fila < mat.length; fila++) {
			
			acu += mat[fila][nColum];
			
		}
		return acu;
	}
}
