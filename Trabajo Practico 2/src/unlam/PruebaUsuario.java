package unlam;

public class PruebaUsuario {
	public static void main(String[] args) {
	Usuario facu = new Usuario("facundito", "123456", "Facundo", "Gaetan", 40111111, 24);

	System.out.println(facu.getContrasenia());
	System.out.println(facu.getUsuario());
	//cambiamos la contrasenia
	facu.setContrasenia("987654");
	
	//consultamos la nueva contrasenia
	System.out.println(facu.getContrasenia());
	
	//cambiamos la edad
	facu.setEdad(30);
	
	//consultamos la edad
	System.out.println(facu.getEdad());
	
	
	
}
	}