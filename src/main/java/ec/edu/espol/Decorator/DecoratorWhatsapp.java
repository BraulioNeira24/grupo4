package ec.edu.espol.Decorator;

public class DecoratorWhatsapp extends Decorator {

	public DecoratorWhatsapp(Notificador notificador) {
		super(notificador);
	}

	public void enviar(String aMensaje) {
		super.enviar(aMensaje);

		//Logíca de enviar una notificación por WhatsApp
	}
}