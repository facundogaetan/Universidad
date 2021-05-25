package unlam;

public class PruebaTelevisor {

	public static void main(String[] args) {
		//a
		Televisor sony = new Televisor();
		
		//b
		sony.encenderOApagar();
		
		//c
		System.out.println(sony.toString());
		
		//d
		sony.seleccionarEntrada('A');
		
		//e
		sony.subirElVolumen();
		System.out.println(sony.getVolumenActual());
		
		//f
		sony.bajarElVolumen();
		System.out.println(sony.getVolumenActual());
		
		//g
		sony.subirDeCanal();
		System.out.println(sony.getCanalActual());
		
		//h
		sony.bajarCanal();
		System.out.println(sony.getCanalActual());
		
		//i
		sony.cambiarDeCanal('1');
		System.out.println(sony.getCanalActual());
		
		//j
		sony.cambiarDeCanal('1', '2');
		System.out.println(sony.getCanalActual());
		
		//k
		sony.cambiarDeCanal('1', '2', '3');
		System.out.println(sony.getCanalActual());
		
		//l
		sony.cambiarDeCanal('1', '2', '3', '4');
		System.out.println(sony.getCanalActual());
		
		//m
		sony.volverAlCanalAnterior();
		System.out.println(sony.getCanalActual());
		
		//n
		sony.silenciar();
		
		//o
		sony.getEntradaUsb();
		System.out.println(sony.getEntradaActual());
		
		//p
		System.out.println(sony.getNumeroDeSerie());
		
		//q
		System.out.println(sony.isEncendido());
		
		//r
		System.out.println(sony.getVolumenActual());
		
		//s
		System.out.println(sony.getCanalActual());
		
		//t
		System.out.println(sony.getEntradaActual());

	}
}