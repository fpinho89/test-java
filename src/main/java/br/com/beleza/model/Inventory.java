package br.com.beleza.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	
	private int quantity;
	
	private List<Warehouse> warehouses;
	
	public Inventory() {
		this.warehouses = new ArrayList<Warehouse>();
	}
	
	public int getQuantity() {
		quantity = calcQuantity();
		return this.quantity;
	}
	
	public List<Warehouse> getWarehouses() {
		return warehouses;
	}
	
	public void addWarehouse(Warehouse warehouse) {
		this.warehouses.add(warehouse);
	}
	
	private int calcQuantity() {
		Integer q = 0;
		
		for (Warehouse warehouse : this.warehouses) {
			q += warehouse.getQuantity();
		}		
		return q;
	}
}
