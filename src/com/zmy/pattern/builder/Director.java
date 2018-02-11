package com.zmy.pattern.builder;

public class Director {
	private Builder builder;
	
	public Director(Builder builder){
		this.builder = builder;
	}
	
	public void  build(){
		builder.buildPartA();
		builder.buildPartB();
	}
	
	
}
