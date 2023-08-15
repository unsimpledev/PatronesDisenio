package envioconcreto;
import envio.Notificacion;

public class NotificacionPorEmail extends Notificacion {

	private String direccionSMTP;
	private int puertoSMTP;
	private String usuario;
	private String clave;
	
	
	@Override
	public void cargarDatos() {
		//Tomar datos de BD o configuracion
		direccionSMTP = "";
		puertoSMTP = 1800;
		usuario = "usuario";
		clave = "clave";
		System.out.println("Cargando datos de SMTP");		
	}

	@Override
	public void formatearTexto() {
		System.out.println("Cargando y formateando el texto en HTML");		
		
	}

	@Override
	public void despacharMensaje() {
		System.out.println("enviando mensaje por Email a " + this.getDestinatario());
	}

}
