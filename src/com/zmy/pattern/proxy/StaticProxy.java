package com.zmy.pattern.proxy;

public class StaticProxy implements Subject{

	private RealSubject realSubject ;
	
	public StaticProxy(RealSubject realSubject) {
		this.realSubject = realSubject;
	}
	
	@Override
	public void doSomething() {
		realSubject.doSomething();
	}


	@Override
	public void output(String name) {
		System.out.println("可以先做些其他事情。。。。");
		realSubject.output(name);
	}

}
