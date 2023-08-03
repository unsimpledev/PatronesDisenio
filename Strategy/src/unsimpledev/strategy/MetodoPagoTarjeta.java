package unsimpledev.strategy;

import java.util.Date;

/**
 * Estrategia concreta para pago por Tarjeta
 */
public class MetodoPagoTarjeta implements IMetodoPago {

	private String nombre;
	private String numero;
	private String cvv;
	private Date vencimiento;
	
	
	public MetodoPagoTarjeta(String nombre, String numero, String cvv, Date vencimiento) {
		this.nombre = nombre;
		this.numero = numero;
		this.cvv = cvv;
		this.vencimiento = vencimiento;
	}


	/**
	 * Aca el sistema se comunica con el procesador de pagos por tarjeta de credito.
	 * Envía los datos de la tarjeta y el procesador acepta y valida el pago.
	 * Una vez validado el pago retorna true
	 */
	@Override
	public boolean pagar(double monto) {
		System.out.println("Pago con tarjeta de crédito");
		return true;
	}

}
