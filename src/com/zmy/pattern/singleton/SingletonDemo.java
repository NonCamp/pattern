package com.zmy.pattern.singleton;

public class SingletonDemo {
	private static SingletonDemo singleton;

	private SingletonDemo() {
	}

	public static SingletonDemo getInstance(){
		if (singleton == null) {
			singleton = new SingletonDemo();
		}
		return singleton;
	}
	
}
