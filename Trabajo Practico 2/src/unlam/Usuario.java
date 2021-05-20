package unlam;

public class Usuario {
	private String usuario;
	private String contrasenia;
	private String nombre;
	private String apellido;
	private int dni;
	private int edad;
	
	//constructores	
	public Usuario(String usuario,String contrasenia,String nombre,String apellido,int dni,int edad) {
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
	}
	//metodos		
		public String getUsuario() {
			return usuario;
		}
		
		public String getContrasenia() {
			return contrasenia;
		}
		
		public int getEdad() {
			return edad;
		}
		
		public void setContrasenia(String contrasenia) {
			this.contrasenia = contrasenia;	
		}
		
		public void setEdad(int edad) {
			this.edad = edad;
		}
}
