package Ejercicios;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class onjetos {

	public boolean saludar() {
		String g = "hg";
		System.out.print(g);
		return true;
	}
	
	@Test
	public void hola() {
		System.out.print("ola");
		assertTrue(saludar());
	}
}
