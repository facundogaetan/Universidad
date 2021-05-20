package unlam;

public class EjemploCalculadora {

	public static void main(String[] args) {
		Calculadora casio = new Calculadora (6,3);
		
		System.out.println(casio.sumar(6, 3));
		System.out.println(casio.restar(6, 3));
		System.out.println(casio.multiplicar(6, 3));
		System.out.println(casio.dividir(6, 3));
		
		Calculadora laCalculadoraDelCelular = new Calculadora(1,1);
		
		System.out.println(laCalculadoraDelCelular.sumar(6, 3));
		System.out.println(laCalculadoraDelCelular.restar(6, 3));
		System.out.println(laCalculadoraDelCelular.multiplicar(6, 3));
		System.out.println(laCalculadoraDelCelular.dividir(6, 3));

		// ambas calculadoras funcionan de la misma forma ya que usan los mismos metodos
	}
}
