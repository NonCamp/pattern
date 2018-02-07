package com.zmy.pattern.strategy;

public class Context {
	private Strategy strategy;
	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	public void use(){
		strategy.algorithm();
	}
}
