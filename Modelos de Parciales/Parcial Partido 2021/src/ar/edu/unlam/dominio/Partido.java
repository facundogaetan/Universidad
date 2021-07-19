package ar.edu.unlam.dominio;

public class Partido {

	private int numeroPartido;
	private boolean iniciado;
	private int cantidadDeJugadores;
	private Jugador[] equipoLocal;
	private Jugador[] equipoVisitante;
	private Jugador[] goles;
	private final int JUGADORES_LOCAL = 5;
	private final int JUGADORES_VISITANTE = 5;
	private int golesLocal = 0;
	private int golesVisitante = 0;
	
	public Partido(int numeroPartido) {
		this.numeroPartido = numeroPartido;
		this.equipoLocal = new Jugador[JUGADORES_LOCAL];
		this.equipoVisitante = new Jugador[JUGADORES_VISITANTE];
		this.goles = new Jugador[15];
	}

	/**
	 * Agregar un jugador al array del equipo correspondiente según el tipo de equipo
	 * 
	 * @param jugador 	Jugador Jugador que se agregará al equipo correspondiente
	 * @return boolean 	Verdadero en caso de éxito
	 */

	public boolean agregarJugadorAEquipo(Jugador jugador, TipoEquipo tipoEquipo) {
		boolean seAgrego = false;
		if(tipoEquipo == TipoEquipo.Local) {
			for(int i = 0; i< equipoLocal.length; i++) {
				if(equipoLocal[i] == null) {
					equipoLocal[i] = jugador;
					seAgrego = true;
				}
			}
		} else if (tipoEquipo == TipoEquipo.Visitante){
			for(int i = 0; i< equipoVisitante.length; i++) {
				if(equipoVisitante[i] == null) {
					equipoVisitante[i] = jugador;
					seAgrego = true;
				}
			}
		}
		return seAgrego;
	}

	
	/**
	 * Agrega un jugador al array de goles
	 * 
	 * @param jugador 	Jugador Jugador que se agregará al array de goles
	 * @return boolean 	Verdadero en caso de éxito
	 */
	public boolean registrarGolDeJugador(Jugador jugador) {
		boolean seRegistroGol = false;
		for(int i = 0; i<goles.length; i++) {
			if(goles[i] == null) {
				goles[i] = jugador;
				seRegistroGol = true;
				//sumar goles dependiendo del equipo
				if (jugador.getTipoEquipo() == TipoEquipo.Local) {
					golesLocal++;
				}	else {
					golesVisitante++;
				}
			}
		}

		return seRegistroGol;
	}

	/**
	 * Busca un jugador por su DNI, debiendo indicar el equipo al que pertenece
	 * @param dni int					DNI del jugador
	 * @param tipoEquipo TipoEquipo		Tipo de equipo en el que se buscará el jugador (local o visitante)
	 * @return Jugador 					En caso de encontrarlo o null.
	 * */
	public Jugador buscarJugadorPorDNIEnEquipo(int dni, TipoEquipo tipoEquipo) {
	Jugador jugadorEncontrado = null;
		if (tipoEquipo == tipoEquipo.Local) {
			for (int i = 0; i < equipoLocal.length; i++) {
				if (equipoLocal[i] != null) {
					if (equipoLocal[i].getDni() == dni) {
						jugadorEncontrado = equipoLocal[i];
					}
				}
			}
		} else if (tipoEquipo == tipoEquipo.Visitante) {
			for (int i = 0; i < equipoVisitante.length; i++) {
				if (equipoVisitante[i] != null) {
					if (equipoVisitante[i].getDni() == dni) {
						jugadorEncontrado = equipoVisitante[i];
					}
				}
			}
		}
		return jugadorEncontrado;
	}
			
			
		
	

	/**
	 * Cambia el estado de la variable iniciado a verdadero
	 * */
	public void iniciarPartido() {
		this.iniciado = true;

	}

	/**
	 * Cambia el estado de la variable iniciado a falso
	 * */
	public void finalizarPartido() {
		this.iniciado = false;
	}

	/**
	 * Obtiene un array de jugadores que marcaron un gol, debiendo ser ordenados por DNI
	 * @return Jugador[]	En caso de existir goles o null.
	 * */
	public Jugador[] obtenerGolesDeJugadoresOrdenadosPorDni() {
		Jugador aux = null;
		for (int i = 0; i < (cantidadDeJugadores-1) ; i++) {
			for (int j = 0; j < (cantidadDeJugadores-1); j++ ) {
				if (goles[j].getDni() > goles[j+1].getDni()) {
					aux = goles[j];
					goles[j] = goles [j+1];
					goles[j+1] = aux;
				}
			}
		}
		return goles;
	}

	/**
	 * Devuelve un String con la descripción del equipo ganador: Local, Visitante o Empate
	 */
	public String obtenerEquipoGanador() {
		String resultadoPartido;
		if (golesLocal > golesVisitante) {
			resultadoPartido = "Gano EQUIPO LOCAL";
		} else if (golesVisitante > golesLocal) {
			resultadoPartido = "Gano EQUIPO VISITANTE";
		} else {
			resultadoPartido = "EMPATE";

		}
		return resultadoPartido;
	}
	
	/*
	 * Devuelve el jugador mas joven querealizo un gol
	 */
	public Jugador obtenerJugadorMasJovenQueHizoUnGol() {
		Jugador goleadorMasJoven = null;
		int menorEdad = 0;
		for (int i = 0; i > goles.length; i++) {
			if (goles[i] != null); {
				if (menorEdad == 0 || this.goles[i].getEdad() < menorEdad) {
					menorEdad = goles[i].getEdad();
					goleadorMasJoven = goles[i];
						
					}
				}
			}
		return goleadorMasJoven;
			
		}
		
}
