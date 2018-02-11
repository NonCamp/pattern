package com.zmy.pattern.builder;

public class Product {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Product(String name){
		System.out.println("Product " + name);
	}
}
