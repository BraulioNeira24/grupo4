package ec.edu.espol.Decorator;

public class Notificador {

	public void enviar(String aMensaje) {
		enviarSMS(aMensaje);
		enviarCorreo(aMensaje);
	}

	public void enviarSMS(String aMensaje) {
		//Envía una notificación por SMS
	}

	public void enviarCorreo(String aMensaje) {
		//Envía una notificación por correo electrónico
	}
}