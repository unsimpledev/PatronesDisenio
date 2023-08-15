package cliente;

import envio.Notificacion;
import envioconcreto.NotificacionPorEmail;
import envioconcreto.NotificacionPorSMS;

public class Cliente {

	public static void main(String[] args) {
		Notificacion notificacion = new NotificacionPorEmail();
		notificacion.enviarMensaje("destinatario@gmail.com");
		
		notificacion = new NotificacionPorSMS();
		notificacion.enviarMensaje("12345678");
	}

}
