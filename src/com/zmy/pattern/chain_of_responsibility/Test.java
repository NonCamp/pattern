package com.zmy.pattern.chain_of_responsibility;

public class Test {

	public static void main(String[] args) {
		Handler handler = new ConcreteHandler();
		Handler handler2 = new ConcreteHandler2();
		handler.setHandler(handler2);
		handler.handleRequest();
	}

}
