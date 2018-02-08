package com.zmy.pattern.proxy;

public class StaticProxy implements Subject{

	private Subject subject ;
	
	public StaticProxy() {
		this.subject = new RealSubject();
	}
	
	@Override
	public void doSomething() {
		subject.doSomething();
	}


	@Override
	public void output(String name) {
		System.out.println("可以先做些其他事情。。。。");
		subject.output(name);
	}

}
