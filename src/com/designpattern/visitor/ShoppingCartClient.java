package com.designpattern.visitor;

public class ShoppingCartClient {

	public static void main(String[] args) {
		ItemElement[] items = new ItemElement[] { new Book(20, "1234"), new Book(100, "4567"),
				new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Orange") };
		int total = calculatePrice(items);
		System.out.println("Total cost: " + total);

	}

	public static int calculatePrice(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum = 0;
		for (ItemElement item : items) {
			sum = sum + item.accept(visitor);
		}
		return sum;

	}

}
