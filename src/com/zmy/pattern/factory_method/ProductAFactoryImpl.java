package com.zmy.pattern.factory_method;


public class ProductAFactoryImpl extends Factory{

	@Override
	public Product createPro() {
		return new ConcreteProductA();
	}

}
