package carrito;

/** 
 * Interfaz que representa la estrategia de pago
 */
public interface IMetodoPago {

	public boolean pagar(double monto);
}
