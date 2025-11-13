package ec.edu.espol.Decorator;

public class GestorDeNotificaciones {
	private Notificador notificador;

	public Notificador getNotificador() {
		return this.notificador;
	}

	public void setNotificador(Notificador notificador) {
		this.notificador = notificador;
	}

	public void enviarNotificacion(String mensaje) {
		notificador.enviar(mensaje);
	}

	public static void main(String[] args) {
		GestorDeNotificaciones gestor = new GestorDeNotificaciones();
		Notificador notificadorBase = new Notificador();
		Notificador notificadorConSignal = new DecoratorSignal(notificadorBase);
		Notificador notificadorSignalWhasapp = new DecoratorWhatsapp(notificadorBase);

		gestor.setNotificador(notificadorBase);
		gestor.enviarNotificacion("Mensaje de prueba sin Signal");

		gestor.setNotificador(notificadorConSignal);
		gestor.enviarNotificacion("Mensaje de prueba con Signal");

		gestor.setNotificador(notificadorSignalWhasapp);
		gestor.enviarNotificacion("Mensaje de prueba con Signal y WhatsApp");
	}
}