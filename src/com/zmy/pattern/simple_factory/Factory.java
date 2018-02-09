package com.zmy.pattern.simple_factory;

public class Factory {
	
	public static Product createProduct(String name){
		if("A".equalsIgnoreCase(name)){
			return new ConcreteProductA();
		}
		if("B".equalsIgnoreCase(name)){
			return new ConcreteProductB();
		}
		return null;
	}
}
