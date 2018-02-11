package com.zmy.pattern.builder;

public class Test {

	public static void main(String[] args) {
		Builder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		director.build();
	}

}
