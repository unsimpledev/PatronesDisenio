package envio;

public abstract class Notificacion {

	private String destinatario;
	
	//Template Method enviarMensaje
	//El comportamiento lo implementan las clases hijas
	public void enviarMensaje(String destinatario) {	
		this.destinatario = destinatario;
		cargarDatos();
		formatearTexto();
		despacharMensaje();
	}
	
	public abstract void cargarDatos();
	
	public abstract void formatearTexto();
	
	public abstract void despacharMensaje();

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
	
	
}
