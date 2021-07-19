package ar.edu.unlam.dominio;

public class Jugador {

	private int dni;
	private String nombre;
	private String apellido;
	private int numeroCamiseta;
	private int edad;
	private TipoEquipo tipoEquipo;
	private Puesto puesto;
	public Jugador(int dni, String nombre, String apellido, int numeroCamiseta, int edad, TipoEquipo tipoEquipo,
			Puesto puesto) {
		
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getNumeroCamiseta() {
		return numeroCamiseta;
	}
	public void setNumeroCamiseta(int numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public TipoEquipo getTipoEquipo() {
		return tipoEquipo;
	}
	public void setTipoEquipo(TipoEquipo tipoEquipo) {
		this.tipoEquipo = tipoEquipo;
	}
	public Puesto getPuesto() {
		return puesto;
	}
	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}
	
	

}
