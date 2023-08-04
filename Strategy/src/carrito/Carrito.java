package carrito;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

	private List<Item> items;

	public Carrito() {
		this.items = new ArrayList<Item>();
	}
	
	public void agregar(Item item) {
		this.items.add(item);
	}
	
	public void quitar(Item item) {
		this.items.remove(item);
	}
	
	public double calcularTotal() {
		double total = 0;
		for (Item i : items) {
			total += i.getValor();
		}
		return total;
	}
	
	public boolean pagar(IMetodoPago metodoPago) {
		return metodoPago.pagar(calcularTotal());
	}
	
}
