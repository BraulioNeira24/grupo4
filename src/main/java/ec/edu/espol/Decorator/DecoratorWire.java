public class DecoratorWire extends Decorator {

	public DecoratorWire(Notificador notificador) {
		super(notificador);
	}

	public void enviar(String aMensaje) {
		super.enviar(aMensaje);

		//Logíca de enviar una notificación por Wire
	}
}