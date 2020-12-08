package it.unibo.oop.lab05.ex3;

import java.util.HashSet;
import java.util.Set;

public class WarehouseImpl {

	private Set<Product> wareh = new HashSet<>();
	
	public WarehouseImpl() {}
	
	public void addProduct(Product p) {
		this.wareh.add(p);
	}
	
	public Set<String> allNames(){
		Set<String> warehNames = new HashSet<>();
		for(Product p : wareh) {
			warehNames.add(p.getName());
		}
		return warehNames;
	}
	
	 public Set<Product> allProducts(){
		 return new HashSet<>(this.wareh);		 
	 }
	 
	public boolean containsProduct(Product p) {
		if(wareh.contains(p)) {
			System.out.println("Product" + p.getName() + "contained");	
			return true;
		}else {
			System.out.println("Product" + p.getName() + "not contained");	
			return false;
		}
	}
	
	public double getQuantity(String name) {
		for(Product p : this.wareh) {
			if(p.getName().equals(name)) {
				return p.getQuantity();
			}
		}
		return 0;
	}
	
}
