package com.zmy.pattern.abstract_factory;

public class ConcreteProductB extends ProductB{
	private String name;
	public ConcreteProductB(String name){
		this.name = name;
	}
	@Override
	public void use() {
		System.out.println(name+"制造产品B");
	}

}
