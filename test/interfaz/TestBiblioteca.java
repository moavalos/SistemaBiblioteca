package interfaz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dominio.Libro;
import dominio.LibroMatematica;

public class TestBiblioteca {
	
	// aplicación que le permita llevar el control de préstamos de los libros a los distintos estudiantes
	
	@Test
	public void queSePuedaCrearUnLibro() {
		Integer cod = 1550;
		String nombre = "no se, no leo", autor = "MrGuarango";
		Libro libro = new Libro(cod, nombre, autor);
		
		assertEquals(cod, libro.getCod());
	}
	
	@Test
	public void queSePuedaCrearUnLibroDeMatematica() {
		Integer cod = 1550;
		Libro libroDeMatematica = new LibroMatematica(cod, "no se, no leo", "MrGuarango");
		assertEquals(cod, libroDeMatematica.getCod());
		
	}
	


}
