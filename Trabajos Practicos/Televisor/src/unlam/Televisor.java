package unlam;

public class Televisor {

	private char ENTRADA_TELEVISION_DE_AIRE = 'A';
	private char ENTRADA_TELEVISION_POR_CABLE = 'C';
	private char ENTRADA_HDMI1= 1;
	private char ENTRADA_HDMI2 = 2;
	private char ENTRADA_USB = 'U';

	private static int numSerie = 0;

	public boolean tvEncendido = false;
	public byte volumen = 0;
	public short canalActual;
	public short canalAnterior;
	public short canalIngresado;
	public char entradaActual;
	public char entradaDeseada;

	//constructor
	public Televisor () {
		numSerie++;	
	}

	//metodos

	public short convertirAShort(int valor) {
		return ((short) (valor - '0'));
	}

	public void encenderOApagar () {
		if (tvEncendido == false) {
			tvEncendido = true;
		} else {
			tvEncendido = false;
		}
	}

	public String toString() {
		if (tvEncendido == true) {
			return "El volumen actual es: " + getVolumenActual() + 
					"\nSe encuentra en el canal: " + getCanalActual() +
					"\nSe encuentra en: " + getEntradaActual();

		} else {
			return "El TV se encuentra apagado.";
		}
	}

	public void seleccionarEntrada(char entradaDeseada) {
		if (entradaDeseada == 'A' || entradaDeseada == 'C' || entradaDeseada == 'U' || entradaDeseada == '1' || entradaDeseada == '2') {
			entradaActual = entradaDeseada;	
		} else {
			System.out.println("Entrada incorrecta");
		}

	}

	public void subirElVolumen() {
		if (volumen < 100) {
			volumen++;
		} else {
			System.out.println("No es posible subir el volumen");
		}
	}

	public void bajarElVolumen() {
		if(volumen > 0) {
			volumen--;
		} else {
			System.out.println("No es posible bajar el volumen");
		}
	}

	public void subirDeCanal() {
		if (entradaActual != 'U') {
			canalAnterior = canalActual;
			canalActual++;
		}
	}

	public void bajarCanal() {
		if (entradaActual != 'U' && canalActual >= 0) {
			canalAnterior = canalActual;
			canalActual--;
		}
	}
	
	public void cambiarDeCanal(char canalDeseado) {
		short ud = convertirAShort(canalDeseado);
		if (entradaActual == 'A' || entradaActual == 'C') {
			canalActual = ud;
			canalAnterior = canalActual;
		}
	}

	public void cambiarDeCanal(char primerDigito, char segundoDigito) {
		short pd = convertirAShort(primerDigito);
		short sd = convertirAShort(segundoDigito);
		if (entradaActual == 'A' || entradaActual == 'C') {
			short canalDeseado = (short) ((pd * 10) + sd);
			if (canalDeseado > 0 && canalDeseado < 32767) {
				canalActual = canalDeseado;
				canalAnterior = canalActual;		
			}
		}	
	}

	public void cambiarDeCanal(char primerDigito, char segundoDigito, char tercerDigito) {
		short pd = convertirAShort(primerDigito);
		short sd = convertirAShort(segundoDigito);
		short td = convertirAShort(tercerDigito);
		if (entradaActual == 'A' || entradaActual == 'C') {
			short canalDeseado = (short) ((pd * 100 + (sd * 10) + td));
			if (canalDeseado > 0 && canalDeseado < 32767) {
				canalActual = canalDeseado;
				canalAnterior = canalActual;
			}
		}		
	}

	public void cambiarDeCanal(char primerDigito, char segundoDigito, char tercerDigito, char cuartoDigito) {
		short pd = convertirAShort(primerDigito);
		short sd = convertirAShort(segundoDigito);
		short td = convertirAShort(tercerDigito);
		short cd = convertirAShort(cuartoDigito);
		if (entradaActual == 'A' || entradaActual == 'C') {
			short canalDeseado = (short) ((pd * 1000 + (sd *  100) + (td * 10) + cd));
			if (canalDeseado > 0 && canalDeseado < 32767) {
				canalActual = canalDeseado;
				canalAnterior = this.canalActual;
			}
		}		
	}

	public void volverAlCanalAnterior() {
		canalActual = canalAnterior;
	}

	public void silenciar() {
		volumen = 0;
		System.out.println("MUTE");
	}

	public void getEntradaUsb() {
		entradaActual = 'U';
	}

	public int getNumeroDeSerie() {
		return numSerie;
	}

	public boolean isEncendido() {
		return tvEncendido;
	}

	public byte getVolumenActual () {
		return volumen;
	}

	public short getCanalActual() {
		return canalActual;
	}

	public char getEntradaActual() {
		return entradaActual;
	}

}
