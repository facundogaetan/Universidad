package unlam;

public class EjemplosDeCoches {
	
	public static void main(String[] args) {
		
		//Construimos el objeto Gol Trend
		Coche gol = new Coche("Volkswagen", "Gol Trend", 13000, 2018, 1200000);
		
		//Probamos los metodos
		System.out.println(gol.getCantidadCoches());
		
		Coche corsa = new Coche("Chevrolet", "Corsa Classic", 150000, 2010, 700000);
		
		System.out.println(corsa.getCantidadCoches());
		
		//obetenemos los km dados por constructor
		System.out.println(corsa.getKilometros());
		
		//modificamos los km (no hagan esto en casa)
		corsa.setKilometrosActuales(5000);
		
		//verificamos los km actuales
		System.out.println(corsa.getKilometros());
		
		//obtenemos el precio
		System.out.println(corsa.getPrecio());
		
		//modificamos el precio
		corsa.setPrecio(5);
		
		//obtenemos nuevo precio
		System.out.println(corsa.getPrecio());
		
		//calculamos antiguedad
		System.out.println(corsa.calcularAntiguedad());
		
	}

}
