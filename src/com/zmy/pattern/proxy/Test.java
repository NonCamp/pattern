package com.zmy.pattern.proxy;

public class Test {
	public static void main(String[] args) {
		Subject sub = new StaticProxy();
		sub.doSomething();
		sub.output("static proxy");
		
		JdkDynamicProxy jdkDynamicProxy = new JdkDynamicProxy();
		Subject subject = (Subject)jdkDynamicProxy.bind(new RealSubject());
		subject.doSomething();
		subject.output("jdk dynamic proxy");
		
		CglibDynamicProxy cglibProxy = new CglibDynamicProxy();
		RealSubject realSubject = (RealSubject)cglibProxy.getInstance(new RealSubject());
		realSubject.doSomething();
		realSubject.output("cglib dynamic proxy");
	}
}
