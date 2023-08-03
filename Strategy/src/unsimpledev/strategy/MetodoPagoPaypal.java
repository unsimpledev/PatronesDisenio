package unsimpledev.strategy;

/**
 * Estrategia concreta para pago por Paypal
 */
public class MetodoPagoPaypal implements IMetodoPago {

	private String email;
	
	public MetodoPagoPaypal(String email) {
		this.email = email;
	}

	
	/**
	 * Aca el sistema se comunica con paypal para crear un link de pago para el email,
	 * y redirige hacia ese link. Una vez validado el pago retorna true.
	 */
	@Override
	public boolean pagar(double monto) {
		System.out.println("Pago con Paypal");
		return true;
	}

}
