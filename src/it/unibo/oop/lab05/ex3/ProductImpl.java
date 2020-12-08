package it.unibo.oop.lab05.ex3;

public class ProductImpl {

	private String name;
	private double quantity;
	
	public ProductImpl(final String name, final double quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	
	public double getQuantity() {
		return quantity;
	}
	
	public boolean equals(final Object o) {
		if (o instanceof Product) {
			final var p = (Product) o;
			return name.equals(p.getName());
		}
		return false;
	}
	
	public final String toString() {
		return "ProductImpl [" + name + ", " + quantity " ]";
	}
}
