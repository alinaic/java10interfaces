package java10interfaces;

public class Portero implements Jugador {

	@Override
	public void correr() {
		System.out.println("Portero corre");

	}

	@Override
	public void parar() {
		System.out.println("Portero para");

	}

}
