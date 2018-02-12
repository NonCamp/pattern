package com.zmy.pattern.abstract_factory;

public class ConcreteFactory1Impl extends Factory{

	@Override
	public ProductA createProA() {
		return new ConcreteProductA("工厂1");
	}

	@Override
	public ProductB createProB() {
		return new ConcreteProductB("工厂1");
	}
	
}
