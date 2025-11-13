public class DecoratorTelegram extends Decorator {

	public DecoratorTelegram(Notificador notificador) {
		super(notificador);
	}

	public void enviar(String aMensaje) {
		super.enviar(aMensaje);

		//Logíca de enviar una notificación por Telegram
	}
}