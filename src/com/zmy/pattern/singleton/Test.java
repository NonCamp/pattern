package com.zmy.pattern.singleton;

public class Test {
	public static void main(String[] args) {
		SingletonDemo instance = SingletonDemo.getInstance();
		SingletonDemo instance2 = SingletonDemo.getInstance();
		System.out.println(instance.toString());
		System.out.println(instance2.toString());
		
		SingletonDemo2 s1 = new SingletonDemo2();
		SingletonDemo2 s2 = new SingletonDemo2();
		System.out.println(s1);
		System.out.println(s2);
	}
}
