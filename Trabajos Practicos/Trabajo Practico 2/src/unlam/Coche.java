package unlam;

public class Coche {
	//atributos 
	private final int CERO_KM = 0;
	private final int ANO_ACTUAL = 2021;
	private static int cantidadCoches;
	private String marca;
	private String modelo;
	private int kilometrosActuales;
	private int anioDeFabricacion;
	private double precio;
	
	//constructores
	
	public Coche (String marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		
	}
	
	public Coche (String marca, String modelo, int kilometrosActuales, int anioDeFabricacion, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.kilometrosActuales = kilometrosActuales;
		this.anioDeFabricacion = anioDeFabricacion;
		this.precio = precio;
		cantidadCoches++;
	}
	
	//metodos

	
		public int getCantidadCoches() {
			return cantidadCoches;
		}
				
		public void setKilometrosActuales (int kilometrosActuales) {
			this.kilometrosActuales = kilometrosActuales;
		}
		
		public void setPrecio (int precio) {
			this.precio = precio;
		}

	 	public double getPrecio() {
			return precio;
		}	
		
		public int calcularAntiguedad() {
			return (ANO_ACTUAL - this.anioDeFabricacion);
		}

		public int getKilometros() {
			return kilometrosActuales;
		}	

}
