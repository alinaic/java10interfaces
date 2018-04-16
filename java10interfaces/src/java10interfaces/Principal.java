package java10interfaces;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Defensa ana = new Defensa();
		Defensa luis = new Defensa();
		Delantero marco = new Delantero();
		Centrocampista julian = new Centrocampista();
		Portero isabel = new Portero();

		// de un interfaz no puedo crear objetos:
		// Jugador j = new Jugador();
		// pero si puedo hacer es crear lo que se llama una clase anonima
		// una clase anonima, no tiene nombre
		// y es usada para la creacion de un objecto que
		// cumpla las reglas de un interfaz:

		Jugador j = new Jugador() {

			@Override
			public void parar() {
				System.out.println("parar para j");

			}

			@Override
			public void correr() {
				System.out.println("correr para j");

			}
		};
		agregarJugadorAlCampo(j);
		agregarJugadorAlCampo(julian);
		agregarJugadorAlCampo(isabel);

		agregarJugadorAlCampo(ana);
		agregarJugadorAlCampo(luis);
		agregarJugadorAlCampo(marco);

		// para solucionar el siguiente problema y el
		// metodo pueda recibir tanto defensas como delanteros
		// podría usar herencias, la herencia en Java esta limitada
		// a que una clase solo pueda como mucho heredar de otra.
		// La solucion que vamos a monstrar, es usando interfaces
		// una clase puede "heredar" de todos los interfaces que quiera.
		// una interfaz es lo mismo que una clase abstracta cuyos metodos
		// no tienen codigo y en la clase no hay variables
	}

	// el modificador static indica que el elemento
	// puede ser usado directamente, sin necesidad
	// de hacer un objeto para ello

	public static void agregarJugadorAlCampo(Jugador d) {
		System.out.println("agrego un jugador");
		d.correr();
	}
}
