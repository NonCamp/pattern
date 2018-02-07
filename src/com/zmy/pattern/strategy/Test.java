package com.zmy.pattern.strategy;

public class Test {
	public static void main(String[] args) {
		Context context = new Context(new StrategyA());
		context.use();
	}
}
