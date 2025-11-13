package ec.edu.espol.Decorator;

public abstract class Decorator extends Notificador {
	private Notificador wrapee;

	public Decorator(Notificador wrapee) {
		this.wrapee = wrapee;
	}

	public void enviar(String aMensaje) {
		wrapee.enviar(aMensaje);
	}
}