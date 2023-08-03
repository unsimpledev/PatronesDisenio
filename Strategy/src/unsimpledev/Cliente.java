package unsimpledev;

import java.sql.Date;

import unsimpledev.strategy.MetodoPagoPaypal;
import unsimpledev.strategy.MetodoPagoTarjeta;

/**
 * Crea el carrito para hacer la compra, los datos estan hardcodeados
 * porque solo tienen el fin de mostrar el funcionamiento
 * del patrón.
 * La elección del método concreto de pago es mediante un random, 
 * para simular la elección del cliente del tipo de pago.
 */
public class Cliente {
	
	private Carrito carrito;
	
	public void comprar() {
		carrito = new Carrito();
		carrito.agregar(new Item(1,200.0));
		carrito.agregar(new Item(2,150.0));
		carrito.agregar(new Item(3,100.0));		
	}
	
	public void pagarCompra(int opcion) {
		if (opcion == 0) {
			//Elijo pagar con paypal
			carrito.pagar( new MetodoPagoPaypal("pepito@gmail.com"));
		}else {
			//Elijo pagar con tarjeta
			carrito.pagar( new MetodoPagoTarjeta("Pepe", "12345678","111", new Date(2025,12,01)));
		}
	}
	
	//Prueba de cliente
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.comprar();
		cliente.pagarCompra((int) Math.round(Math.random()));

	}

}
