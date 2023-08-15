package envioconcreto;
import envio.Notificacion;

public class NotificacionPorSMS extends Notificacion {

	private String urlGatewaySMS;
	private String apikey;
	
	@Override
	public void cargarDatos() {
		//Tomar datos de BD o configuracion
		urlGatewaySMS = "url";
		apikey = "estaeslapiakeyparaenvioporSMS";
		System.out.println("Cargando datos de Gateway SMS");		
	}

	@Override
	public void formatearTexto() {
		System.out.println("Cargando el texto plano");		
		
	}

	@Override
	public void despacharMensaje() {
		System.out.println("enviando mensaje por SMS a " + this.getDestinatario());		
	}

}
