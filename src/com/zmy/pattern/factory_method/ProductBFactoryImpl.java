package com.zmy.pattern.factory_method;

public class ProductBFactoryImpl extends Factory{

	@Override
	public Product createPro() {
		return new ConcreteProductB() ;
	}

}
