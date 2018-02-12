package com.zmy.pattern.abstract_factory;

public class ConcreteFactory2Impl extends Factory{

	@Override
	public ProductA createProA() {
		return new ConcreteProductA("工厂2");
	}

	@Override
	public ProductB createProB() {
		return new ConcreteProductB("工厂2");
	}

}
