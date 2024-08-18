package acumuladores;

public class Acumuladores {
	
	public boolean todosMultiplosEnAlgunaFila(int[][] mat, int num) {
		
	    if(matrizInvalida(mat) || num <= 0) return false;
		
		boolean	res = false;
		
		    for(int fila = 0; fila < mat.length; fila++) {
		    	
				boolean filaMultiplo = todaLaFilaEsMultiplo(mat[fila], num);
				
				res = res || filaMultiplo;
				
			}
		    
		return res;
	}
	
	private boolean todaLaFilaEsMultiplo(int[] fila, int num) {			//Valida si todos los elementos de una fila son múltiplos de "num".
		
		boolean filaMultiplo = true;
		
		for(int col = 0; col < fila.length; col++) {
			
			filaMultiplo = filaMultiplo && esMultiplo(fila[col], num);

		}
		return filaMultiplo;
	}
	
	private boolean esMultiplo(int a, int b) {				//Valida si el valor 'a' es múltiplo de 'b'.
		if(a%b == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean hayInterseccionPorFila(int[][] mat1, int[][] mat2) {
		
		if(matrizInvalida(mat1) || matrizInvalida(mat2) || (mat1.length != mat2.length)) return false;

		boolean res = true;

			for(int fila = 0; fila < mat1.length; fila++) {

				res = res && tieneIntersecciones(mat1[fila], mat2[fila]);
				
			}
			
		return res;
	}
	
	private boolean tieneIntersecciones(int[] mat1, int[] mat2) {			//Valida si hay coincidencias entre los elementos de dos arrays.
		
		boolean hayCoincidencia = false;

			for(int col = 0; col < mat1.length; col++) {
				
				hayCoincidencia = hayCoincidencia || contiene(mat1[col], mat2);
				
			}
			
		return hayCoincidencia;
		
	}
	
	private boolean contiene(int a, int[] b) {						//Valida si el array pasado por parametro contiene el valor 'a'.
		
		for(int valores = 0; valores < b.length; valores++) {
			if(a == b[valores]) return true;
		}
		
		return false;
	}

	public boolean algunaFilaSumaMasQueLaColumna(int[][] mat, int nColum) {
		
		if(matrizInvalida(mat) || (nColum < 0) || (nColum >= mat[0].length)) return false;
		
		boolean res = false;
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
	
	private int sumarColumna(int[][] mat, int nColum) {				//Suma los elementos de una columna.

		int acu = 0;
		for(int fila = 0; fila < mat.length; fila++) {
			
			acu += mat[fila][nColum];
			
		}
		return acu;
	}

	public boolean hayInterseccionPorColumna(int[][] mat1, int[][]mat2) {

		if(matrizInvalida(mat1) || matrizInvalida(mat2) || (mat1[0].length != mat2[0].length)) return false;
		
		if(mat1 == mat2) return true;
		
		boolean res = true;
		boolean colInterseccion = false;
		
		for(int col = 0; col < mat1[0].length; col++) {
				
			int[] columna1 = obtenerColumna(col, mat1);
			int[] columna2 = obtenerColumna(col, mat2);
			
			for(int i = 0; i < columna1.length; i++) {
					
				colInterseccion = colInterseccion || contiene(columna1[i], columna2);
					
			}
			
			res = res && colInterseccion;

		}
				
		return res;
	}
	
	private int[] obtenerColumna(int col, int[][] mat) {			//Separa una columna de una matriz, convirtiendola en un array.
		
		int[] columna = new int[mat.length];
		for(int fila = 0; fila < mat.length; fila++) {
			
			columna[fila] = mat[fila][col];
		}
		
		return columna;
	}
	
	private boolean matrizInvalida(int[][] mat) {						//Valida que las matrices no sean null ni estén vacías.

		boolean matrizInvalida = (mat == null || mat.length == 0);		
	    
	    if(matrizInvalida) {
	    	return true;
	    }
	    else 
	    {
	    	return false;
	    }
	}
}
