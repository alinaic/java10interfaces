package java10interfaces;

// para decir que heredamos de un interfaz
// se dice que se implementa ese interfaz

public class Defensa implements Jugador {

	public void correr() {
		System.out.println("defensa corre");
	}

	public void parar() {
		System.out.println("defensa se para");
	}// end parar

}// end class
