package unlam;

public class Persona {
		private String nombre;
		private String genero;
		private long dni;
		private double peso;
		private double altura;
		private int edad;
		private boolean viva;
		
	
		public Persona(String nombre, String genero, long dni, double peso, double altura){
			this.nombre = nombre;
			this.genero = genero;
			this.dni = dni;
			this.peso = peso;
			this.altura = altura;
			viva = true;
		}
			
		
		public void alimentar(double kilos){
			peso+=kilos;
		}	
		
		public void crecer(double metros){
				altura+=metros;
		}
		
		public void cumplirAnos(){
			edad++;
		}
		
		public void morir(){
			viva = false;
		}
		
		public double pesar(){
			return peso;
		}
		
		public double medir() {
			return altura;
		}
	}


