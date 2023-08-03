package unsimpledev;

import java.util.Objects;

public class Item {

	private long id;
	private double valor;
	
	public Item(long id, double valor) {
		this.id = id;
		this.valor = valor;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, valor);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return id == other.id && Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	
}
