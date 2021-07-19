package ar.edu.unlam.interfaz;

import java.util.Scanner;

import ar.edu.unlam.dominio.Jugador;
import ar.edu.unlam.dominio.Partido;
import ar.edu.unlam.dominio.Puesto;
import ar.edu.unlam.dominio.TipoEquipo;

public class TestPartidoFutbol {
	

	public static void main(String[] args) {
		/*
		 * TODO: Generar un menu que permita:
		 * 
		 * 1) Crear partido: Se debera solicitar el ingreso de datos por pantalla.
		 * 2) Agregar jugador equipo local: Se debera° solicitar el ingreso de datos por pantalla.
		 * 3) Agregar jugador equipo visitante: Se deber√° solicitar el ingreso de datos por pantalla.
		 * 4) Iniciar el partido: Cambia el estado de la variable iniciado de la clase Partido 
		 *                        No se puede inciar el partido si ambos equipos no tienen almenos 11 jugadores cada uno.
		 * 
		 * 5) Registar gol: Para registrar un gol, primero debe buscarse el jugador por su DNI, indicando su equipo (Local o Visitante). Debe existir el partido y estar iniciado.
		 * 6) Finalizar partido: Cambia el estado de la variable iniciado de la clase Partido.
		 * 
		 * */

		/*************************************************************
		 * 
		 * Notas:
		 *  - El men√∫ finaliza, cuando el partido est√© finalizado.
		 *	- Una vez finalizado el partido, informar equipo ganador indicando: Local, Visitante o Empate y jugadores que marcaron gol ordenados por DNI (en caso de existir).
		 *  - y tambien informar el jugador mas joven que hizo un gol   
		 *  
		 *  Puede crear todos los metodos y atributos que necesite 
		 *************************************************************/
		int numeroPartido = 0;
		int opcionMenu1 = 0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("---- BIENVENIDO AL PARTIDO ----");
		System.out.println("Ingrese numero de partido para acceder al menu");
		numeroPartido = teclado.nextInt();
		
		Partido nuevoPartido = new Partido(numeroPartido);
		nuevoPartido.iniciarPartido();
		
		do {
			System.out.println("Ingrese 1 para agregar un jugador al equipo LOCAL");
			System.out.println("Ingrese 2 para agregar un jugador al equipo VISITANTE");
			System.out.println("Ingrese 3 para iniciar el partido (MIN 11 jugadores cada equipo)");
			System.out.println("Ingrese 4 para registrar un nuevo gol");
			System.out.println("Ingrese 5 para finalizar el partido");
			System.out.println("Ingrese 0 para salir del menu");
			
			opcionMenu1 = teclado.nextInt();
			
			switch (opcionMenu1) {
			case 1:
				// opcion para agregar un jugador LOCAL
				System.out.println("Ingrese DNI del jugador");
				int dniLocal = teclado.nextInt();
				
				System.out.println("Ingrese nombre");
				String nombreLocal = teclado.next();
				
				System.out.println("Ingrese apellido");
				String apellidoLocal = teclado.next();
				
				System.out.println("Ingrese numero de camiseta");
				int camisetaLocal = teclado.nextInt();
				
				System.out.println("Ingresa edad");
				int edadLocal = teclado.nextInt();
				
				System.out.println("Ingrese puesto");
				System.out.println("1 para ARQUERO");
				System.out.println("2 para DEFENSOR");
				System.out.println("3 para MEDIOCAMPISTA");
				System.out.println("4 para DELANTERO");
				int puestoLocal = teclado.nextInt();
				
				Puesto puesto = null;
				switch (puestoLocal) {
				case 1:
					puesto = puesto.Arquero;
					break;
				case 2:
					puesto = puesto.Defensor;
					break;
				case 3:
					puesto = puesto.Mediocampista;
					break;
				case 4:
					puesto = puesto.Delantero;
					break;
				default:
					System.out.println("Opcion invalida");
					break;
				}
				
				Jugador jugadorLocal = new Jugador(dniLocal, nombreLocal, apellidoLocal, camisetaLocal, edadLocal, TipoEquipo.Local, puesto);
			nuevoPartido.agregarJugadorAEquipo(jugadorLocal, TipoEquipo.Local);
			if (nuevoPartido.agregarJugadorAEquipo(jugadorLocal, TipoEquipo.Local)) {
				System.out.println("Jugador agregado correctamente");
				
			} else {
				System.out.println("Error al agregar jugador");
			}
			
			break;
			
			case 2:
			// opcion visitante
				System.out.println("Ingrese DNI del jugador");
				int dniVisitante = teclado.nextInt();
				
				System.out.println("Ingrese nombre");
				String nombreVisitante = teclado.next();
				
				System.out.println("Ingrese apellido");
				String apellidoVisitante = teclado.next();
				
				System.out.println("Ingrese numero de camiseta");
				int camisetaVisitante = teclado.nextInt();
				
				System.out.println("Ingresa edad");
				int edadVisitante = teclado.nextInt();
				
				System.out.println("Ingrese puesto");
				System.out.println("1 para ARQUERO");
				System.out.println("2 para DEFENSOR");
				System.out.println("3 para MEDIOCAMPISTA");
				System.out.println("4 para DELANTERO");
				int puestoVisitante = teclado.nextInt();	
		
				Puesto puestoV = null;
				switch (puestoVisitante) {
				case 1:
					puestoV = puestoV.Arquero;
					break;
				case 2:
					puestoV = puestoV.Defensor;
					break;
				case 3:
					puestoV = puestoV.Mediocampista;
					break;
				case 4:
					puestoV = puestoV.Delantero;
					break;
				default:
					System.out.println("Opcion invalida");
					break;
				}
				
				Jugador jugadorVisitante = new Jugador(dniVisitante, nombreVisitante, apellidoVisitante, camisetaVisitante, edadVisitante, TipoEquipo.Visitante, puestoV);
				nuevoPartido.agregarJugadorAEquipo(jugadorVisitante, TipoEquipo.Visitante);
				if (nuevoPartido.agregarJugadorAEquipo(jugadorVisitante, TipoEquipo.Visitante)) {
					System.out.println("Jugador agregado correctamente");
					
				} else {
					System.out.println("Error al agregar jugador");
				}
				
				break;
				
				case 3:
				nuevoPartido.iniciarPartido();
				System.out.println("Partido iniciado correctamente");
				
				case 4: {
					
				System.out.println("øDe que equipo es el jugador a ingresar?");
				System.out.println("Ingrese 1 para LOCAL o ingrese 2 para VISITANTE");
				int opcionDeGol = teclado.nextInt();
				TipoEquipo equipoGoleador = null;
				Jugador jugadorGoleador = null;
				switch (opcionDeGol) {
					case 1:
						equipoGoleador = TipoEquipo.Local;
						break;
					case 2:
						equipoGoleador = TipoEquipo.Visitante;
						break;
					default:
						System.out.println("Opcion incorrecta");
						break;
				}
				
				System.out.println("Ingrese DNI del jugador a ingresar");
				int dniGoleador = teclado.nextInt();
				jugadorGoleador = nuevoPartido.buscarJugadorPorDNIEnEquipo(dniGoleador, equipoGoleador);
				nuevoPartido.registrarGolDeJugador(jugadorGoleador);
				if (nuevoPartido.registrarGolDeJugador(jugadorGoleador)) {
					System.out.println("Gol registrado con exito");
					
				} else {
					System.out.println("Error al registrar el gol");
					
				}
			}
			break;
				case 5:
				
				nuevoPartido.finalizarPartido();
				System.out.println("Partido finalizado");
				System.out.println(nuevoPartido.obtenerEquipoGanador());
				System.out.print("Goleador mas joven del partido:");
				System.out.println(nuevoPartido.obtenerJugadorMasJovenQueHizoUnGol());
				break;
			case 0:
				break;
			default:
				System.out.println("Opcion incorrecta - vuelva a ingresar opcion");
				break;
			}
		} while (opcionMenu1 != 0);

	}
}

		