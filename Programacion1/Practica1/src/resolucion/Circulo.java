package resolucion;

public class Circulo {
	public Circulo(double centro_x, double centro_y, double rad){
		this.centro = new Punto(centro_x, centro_y);
		this.radio = rad;
	}
	
	double radio;
	Punto centro;
	
	public void imprimir() {
		System.out.println("Coords: " + centro.x + " " + centro.y + " Radio: " + radio);
	}
	
	public double perimetro() {
		double p = 2 * 3.14 * radio;
		return p;
	}
	
	public double superficie() {
		double a = 3.14 * (radio*radio);
		return a;
	}
	
	public void escalar(double factor) {
		radio = radio*factor;
	}
	
	public void desplazar(double desp_x, double desp_y) {
		centro.x = desp_x;
		centro.y = desp_y;
	}
	
	public static double[] distancia(Circulo c1, Circulo c2) {
		double[] distancias = new double[2];
		
		distancias[0] = Math.abs(c1.centro.x - c2.centro.x) - (c1.radio + c2.radio); 
		distancias[1] = Math.abs(c1.centro.y - c2.centro.y) - (c1.radio + c2.radio);
		
		if(seTocan(distancias[0], distancias[1])) {
			distancias[0] = 0;
			distancias[1] = 0;
			return distancias;
		}
		else if(distancias[0] > 0 && distancias[1] < 0) {
			distancias[1] = 0;
			return distancias;
		}
		else{
			System.out.println("La distancia es: ");
			return distancias;
		}
	}
	
	public static boolean seTocan(double a, double b) {
		if(a <= 0 && b < 0) {
			return true;
		}
		else return false;
	}
}

/*
Adem´as de la clase Circulo, pueden encontrar dentro del proyecto que se encuentra en la p´agina
de la materia la clase Dibujador. Los objetos de esta ´ultima permiten dibujar c´ırculos en la pantalla
mediante el m´etodo dibujar(Circulo c). Para ello es necesario construir un Dibujador e invocar
sobre ´este el m´etodo mencionado. Por ejemplo:
Dibujador dib = new Dibujador();
Circulo circ1 = new Circulo(100, 200, 80); // Ver constructor m´as abajo
Circulo circ2 = new Circulo(500, 400, 120); // Ver constructor m´as abajo
dib.dibujar(circ1);
dib.dibujar(circ2);

h) Escribir el m´etodo de instancia boolean loContiene(Circulo otro) que devuelva verdadero si toda
la superficie del c´ırculo pasado como par´ametro est´a contenida en la superficie del argumento
impl´ıcito y falso en caso contrario.1

 */