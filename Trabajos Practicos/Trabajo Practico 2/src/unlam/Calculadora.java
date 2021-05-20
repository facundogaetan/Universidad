package unlam;

public class Calculadora {

	// facundo gaetan
	private double operador1;
	private double operador2;

	//constructores

	public Calculadora(double operador1, double operador2) {
		this.operador1 = operador1;
		this.operador2 = operador2;
	}


	//sumar
	public double sumar(double operador1, double operador2){
		return operador1 + operador2;
	}

	//restar
	public double restar(double operador1, double operador2){
		return operador1 - operador2;
	}

	//multiplicar
	public double multiplicar(double operador1, double operador2){
		return operador1 * operador2;
	}
	//dividir 	
	public double dividir(double operador1, double operador2) {
		double resultado = 0
				;
		if (operador2 != 0) {
			resultado = operador1 / operador2;
			return resultado;
		} else {
			System.out.println("No se puede realizar la division");
			return resultado;
		}

	}
}

