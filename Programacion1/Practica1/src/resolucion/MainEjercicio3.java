package resolucion;

public class MainEjercicio3 {

	public static void main(String[] args) {

		Circulo c1 = new Circulo(0, 3, 1);
		Circulo c2 = new Circulo(-2, 0, 1);
		
		c1.imprimir();
		c2.imprimir();
		double[] distancia = Circulo.distancia(c1, c2);
		System.out.println("La distancia es: " + "x = " + distancia[0] + " y = " + distancia[1]);
		
	}

}

/*
 Ejercicio 3
La siguiente clase en Java describe a un c´ırculo en un plano (representado mediante su radio y
las coordenadas de su centro):
public class Circulo
{
double radio;
Punto centro;
}
Adem´as de la clase Circulo, pueden encontrar dentro del proyecto que se encuentra en la p´agina
de la materia la clase Dibujador. Los objetos de esta ´ultima permiten dibujar c´ırculos en la pantalla
mediante el m´etodo dibujar(Circulo c). Para ello es necesario construir un Dibujador e invocar
sobre ´este el m´etodo mencionado. Por ejemplo:
Dibujador dib = new Dibujador();
Circulo circ1 = new Circulo(100, 200, 80); // Ver constructor m´as abajo
Circulo circ2 = new Circulo(500, 400, 120); // Ver constructor m´as abajo
dib.dibujar(circ1);
dib.dibujar(circ2);
a) Escribir el constructor Circulo(double centro_x, double centro_y, double radio).
b) Escribir el m´etodo void imprimir() que muestra por consola los valores del c´ırculo.
c) Escribir los m´etodos de instancia double perimetro() y double superficie() que devuelven el
per´ımetro y la superficie del c´ırculo, respectivamente.
d) Escribir el m´etodo de instancia void escalar(double factor) que modifique el radio del c´ırculo
en un factor de escala pasado como par´ametro.
e) Escribir el m´etodo de instancia void desplazar(double desp_x, double desp_y) que desplace el
centro del c´ırculo tanto como lo indiquen los par´ametros recibidos.

f) Escribir el m´etodo de clase static double distancia(Circulo c1, Circulo c2) que calcula y devuelve la 
distancia entre los puntos m´as cercanos de los c´ırculos. Por ejemplo, un c´ırculo con centro
(0, 0) y radio 1 tiene distancia 1 de otro de centro (3, 0) y radio 1. Observaci´on: notar que la
distancia no puede ser un valor negativo, es decir, si los c´ırculos se solapan, entonces la distancia
entre ellos es cero.

g) Escribir el m´etodo de clase static boolean seTocan(Circulo c1, Circulo c2) que devuelva verdadero si las 
´areas de los c´ırculos pasados como par´ametro se solapan y falso si no.
h) Escribir el m´etodo de instancia boolean loContiene(Circulo otro) que devuelva verdadero si toda
la superficie del c´ırculo pasado como par´ametro est´a contenida en la superficie del argumento
impl´ıcito y falso en caso contrario.1

 */