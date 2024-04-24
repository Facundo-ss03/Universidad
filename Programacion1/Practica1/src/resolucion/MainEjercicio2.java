package resolucion;

public class MainEjercicio2 {

	public static void main(String[] args) {
		
		Punto p1 = new Punto(4, -5);
		Punto p2 = new Punto(-2, 4);
		
		p1.imprimir();
		p2.imprimir();
		
		Punto.distancia(p1, p2);
	}

}

/*
 
Ejercicio 2
Teniendo en cuenta la siguiente clase en Java
public class Punto
{
double x;
double y;
}
P´agina 1 de 8
Programaci´on I 2
do cuatrimestre de 2022
a) Escribir el constructor Punto() que inicializa las dos coordenadas a 0.
b) Escribir el constructor Punto(double x, double y)
c) Escribir el m´etodo void imprimir() que muestra por consola los valores del punto.
d) Escribir el m´etodo de instancia void desplazar(double desp_x, double desp_y) que desplace el
punto tanto como lo indiquen los par´ametros recibidos.
e) Escribir el m´etodo de clase static double distancia(Punto p1, Punto p2) que devuelve la distancia
entre los dos puntos.

*/