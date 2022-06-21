package dominio;

public class Libro {

	private Integer cod;
	private String nombre;
	private String autor;
	private TipoDeLibro tipoDeLibro;

	public Libro(Integer cod, String nombre, String autor, TipoDeLibro tipoDeLibro) {
		// TODO Auto-generated constructor stub
		this.cod = cod;
		this.nombre = nombre;
		this.autor = autor;
		this.tipoDeLibro = tipoDeLibro;
	}

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

	public TipoDeLibro getTipoDeLibro() {
		return tipoDeLibro;
	}

	public void setTipoDeLibro(TipoDeLibro tipoDeLibro) {
		this.tipoDeLibro = tipoDeLibro;
	}

}
