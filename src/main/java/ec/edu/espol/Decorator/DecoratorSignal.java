package ec.edu.espol.Decorator;

public class DecoratorSignal extends Decorator {

	public DecoratorSignal(Notificador aNotificador) {
		super(aNotificador);
	}

	public void enviar(String aMensaje) {
		super.enviar(aMensaje);

		//Logíca de enviar una notificación por Signal
	}
}