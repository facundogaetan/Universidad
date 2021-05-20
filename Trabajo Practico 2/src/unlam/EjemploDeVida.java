package unlam;

public class EjemploDeVida {

	public static void main(String[] args) {
	
		//Punto 2a , 2b	
		
		Persona sofia = new Persona ("Sofia", "Mujer", 38432153,2.8,0.50);
		
		//Punto 2c Se observa unlam.Persona@15db9742
		System.out.println(sofia);
		
		//Punto 2d
		System.out.println(sofia.pesar());
		System.out.println(sofia.medir());
		
		//Punto 2e
		sofia.alimentar(1.0);
		sofia.crecer(0.5);
		sofia.cumplirAnos();
		
		//Punto 2f
		System.out.println(sofia.pesar());
		System.out.println(sofia.medir());
		
		//Podemos notar en consola como crecio y aumento de peso segun los parametros enviados.
		
		
	}

}
