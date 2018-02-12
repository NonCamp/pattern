package com.zmy.pattern.factory_method;

public class Test {
	public static void main(String[] args) {
		Factory factory = new ProductAFactoryImpl();
		Product pro = factory.createPro();
		pro.use();
		
		Factory factory2 = new ProductBFactoryImpl();
		Product pro2 = factory2.createPro();
		pro2.use();
		
		
	}
}
