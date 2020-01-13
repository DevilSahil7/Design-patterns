package com.designpattern.visitor;

public class Fruit implements ItemElement {

	private int pricePerKG;
	private int weight;
	private String name;
	
	
	
	
	public Fruit(int pricePerKG, int weight, String name) {
		super();
		this.pricePerKG = pricePerKG;
		this.weight = weight;
		this.name = name;
	}
	
	public int getPricePerKG() {
		return pricePerKG;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public String getName() {
		return this.name;
	}




	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}
