package com.zmy.pattern.factory_method;

public class Test {
	public static void main(String[] args) {
		Factory factory = new ProductAFactoryImpl();
		Product pro = factory.createPro();
		pro.use();
	}
}
