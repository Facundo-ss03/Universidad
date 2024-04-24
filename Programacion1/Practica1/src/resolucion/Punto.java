package resolucion;

public class Punto {
	public Punto() {
		this.x = 0;
		this.y = 0;
	}
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	double x;
	double y;
	
	public void imprimir() {
		System.out.println("Las coordenadas del punto son: " + x + "," + y);
	}
	
	public void desplazar(double desp_x, double desp_y) {
		x = desp_x;
		y = desp_y;
	}
	
	public static void distancia(Punto p1, Punto p2) {
		double dist_x = Math.abs(p1.x - p2.x);
		double dist_y = Math.abs(p1.y - p2.y);
		
		System.out.println("distancia entre los puntos: " + dist_x + "," + dist_y);
	}
	
}

/*
 
Ejercicio 2
Teniendo en cuenta la siguiente clase en Java:

public class Punto
{
double x;
double y;
}

a) Escribir el constructor Punto() que inicializa las dos coordenadas a 0.
b) Escribir el constructor Punto(double x, double y)
c) Escribir el m´etodo void imprimir() que muestra por consola los valores del punto.
d) Escribir el m´etodo de instancia void desplazar(double desp_x, double desp_y) que desplace el
punto tanto como lo indiquen los par´ametros recibidos.
e) Escribir el m´etodo de clase static double distancia(Punto p1, Punto p2) que devuelve la distancia
entre los dos puntos.

*/