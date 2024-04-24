package resolucion;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		int numerador1 = 24;
		int denominador1 = 12;
		int numerador2 = 4;
		int denominador2 = 6;
		
		Fraccion f1 = new Fraccion(numerador1, denominador1);
		Fraccion f2 = new Fraccion(numerador2, denominador2);
		f1.imprimir();
		f1.invertirSigno();
		System.out.println(f1.resultado);
		f1.invertir();
		System.out.println(f1.resultado);
		
		f1.reducir();
		System.out.println(f1.numerador + "/" + f1.denominador);
		f2.reducir();
		System.out.println(f2.numerador + "/" + f2.denominador);
		
		Fraccion f3 =  Fraccion.producto(f1, f2);
		
		System.out.println(f1.numerador + "/" + f1.denominador + " x " + f2.numerador + "/" + f2.denominador + " = " + f3.numerador + "/" + f3.denominador);
		
		
	}

}

/*

a) Escribir el constructor Fraccion(int numerador, int denominador)

b) Escribir el m´etodo de instancia void imprimir() que imprime en pantalla la fracci´on en alg´un
formato comodo. Crear en un main una Fraccion e imprimirla con este m´etodo.

c) Escribir el m´etodo de instancia void invertirSigno() que invierte el signo del n´umero: si era
negativo pasa a ser positivo y viceversa.

d) Escribir el m´etodo de instancia void invertir() que invierte el numerador y el denominador de
la fracci´on. Ej. invertir(1/2) = 2/1.

e) Escribir el m´etodo de instancia double aDouble() que convierte el n´umero racional en un double
(n´umero de punto flotante) y devuelve el resultado.

f) Escribir el m´etodo de instancia void reducir() que reduce el n´umero racional a sus t´erminos m´as
chicos. Para esto buscar el MCD del numerador y el denominador y luego dividir numerador y
denominador por su MCD. Usar la funci´on ya programada de la pr´actica anterior.

g) Escribir el m´etodo de clase static Fraccion producto(Fraccion q1, Fraccion q2) que calcula el
producto entre dos fracciones en nuevo objeto Fraccion. Este debe estar reducido a su m´ınima ´
expresi´on, de modo que el numerador y el denominador no tengan un divisor com´un mayor a 1.
¿Por qu´e en este caso hace falta la palabra clave static?

h) Escribir el m´etodo de clase static Fraccion suma(Fraccion q1, Fraccion q2) que calcula la suma
de dos fracciones en un nuevo objeto Fraccion. Este debe debe estar reducido a su m´ınima ´
expresi´on.

*/