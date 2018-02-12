package com.zmy.pattern.abstract_factory;

public class Test {
	
	public static void main(String[] args) {
		Factory factory1 = new ConcreteFactory1Impl();
		ProductA proA1 = factory1.createProA();
		proA1.use();
		ProductB proB1 = factory1.createProB();
		proB1.use();
		
		Factory factory2 = new ConcreteFactory2Impl();
		ProductA proA2 = factory2.createProA();
		proA2.use();
		ProductB proB2 = factory2.createProB();
		proB2.use();
	}
}
