package unlam;

public class CalculadoraArea {
	
	private double operador1;
	private double operador2;
	private static double radio;
	private static double resultado;
	private static double cuadrado;
	//multiplicar
	public static double multiplicar(double operador1, double operador2){
		return operador1 * operador2;}
	
		public static void main(String[] args) { 
			cuadrado = multiplicar(10,10);
			resultado = multiplicar(Math.PI,cuadrado);
			System.out.println(resultado);		
		}
}