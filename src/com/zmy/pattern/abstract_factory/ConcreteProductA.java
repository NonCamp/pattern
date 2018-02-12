package com.zmy.pattern.abstract_factory;

public class ConcreteProductA extends ProductA{
	private String name;
	public ConcreteProductA(String name){
		this.name = name;
	}
	
	@Override
	public void use() {
		System.out.println(name+"制造产品A");
	}

}
