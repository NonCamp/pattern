package com.zmy.pattern.simpleFactory;

public class Test {
	public static void main(String[] args) {
		Product product = Factory.createProduct("A");
		product.use();
		
		Product product2 = Factory.createProduct("B");
		product2.use();
	}
}
