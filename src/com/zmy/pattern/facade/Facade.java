package com.zmy.pattern.facade;

public class Facade {
	ServiceA serviceA;
	ServiceB serviceB;
	ServiceC serviceC;
	
	public Facade(){
		this.serviceA = new ServiceAImpl();
		this.serviceB = new ServiceBImpl();
		this.serviceC = new ServiceCImpl();
	}
	
	public void output(){
		serviceA.methodA();
		serviceC.methodC();
	}
	
	public void output2(){
		serviceB.methodB();
		serviceC.methodC();
	}
	
	public void output3(){
		serviceA.methodA();
		serviceB.methodB();
		serviceC.methodC();
	}
}
