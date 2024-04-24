package resolucion;

public class Fraccion {
	
	public Fraccion(int num, int den){
		if(den > 0 || den < 0) {
			this.numerador = num;
			this.denominador = den;
	    	this.resultado = numerador/denominador;
    	}
		else{
			System.out.print("¡No se puede dividir por cero!");
		}
	}
	
    int numerador;
    int denominador;
    double resultado;
    
    public void imprimir() {
    	System.out.println(resultado);
    }
    
    public void invertirSigno() {
    	if(resultado < 0){
    		resultado = resultado + (resultado*resultado);
    	}
    	else {
    		resultado = resultado - (resultado*resultado);
    	}
    	
    }
	
    public void invertir() {
    	this.resultado = denominador/numerador;
    }
    
    public double aDouble() {
    	return resultado;
    }
    
    public void reducir() {
    	int mcd = buscarMcd(numerador, denominador);
    	
    	this.numerador = numerador/mcd;
    	this.denominador = denominador/mcd;
    }
    
    public int buscarMcd(int numerador, int denominador) {
		int r = 0;
		if(denominador == 0) {
			return 0;
		}
		if(numerador%denominador == 0) {
			return denominador;
		}
		else {
		r = numerador%denominador;
		int mcd = buscarMcd(denominador, r);
		return mcd;
		}
    }
    
    static Fraccion producto(Fraccion f1, Fraccion f2) {
    	
    	int productoNumerador = f1.numerador*f2.numerador;
    	int productoDenominador = f1.denominador*f2.denominador;
    	
    	Fraccion f3 = new Fraccion(productoNumerador, productoDenominador);
    	f3.reducir();
    	return f3;
    }
}
