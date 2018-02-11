package com.zmy.pattern.builder;

public class ConcreteBuilder extends Builder{
	
	Product product;
	
	@Override
	public void buildPartA() {
		product = new Product("A");
	}

	@Override
	public void buildPartB() {
		product = new Product("B");
	}

	@Override
	public void buildPartC() {
		product = new Product("C");
	}

}
