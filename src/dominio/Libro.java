package dominio;

public class Libro {

	private Integer cod;
	private String nombre;
	private String autor;
	//• Los libros pueden ser prestados a cualquier estudiante.
	private Estudiante estudiante;

	public Libro(Integer cod, String nombre, String autor) {
		this.cod = cod;
		this.nombre = nombre;
		this.autor = autor;

	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}
