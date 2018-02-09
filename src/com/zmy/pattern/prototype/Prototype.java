package com.zmy.pattern.prototype;

public class Prototype implements Cloneable{
	public Prototype clone(){
		Prototype prototype = null;
		try {
			prototype = (Prototype) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return prototype;
	}
	public void show(){
		System.out.println("我是原型模式");
	}
}
