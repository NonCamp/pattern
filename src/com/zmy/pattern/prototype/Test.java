package com.zmy.pattern.prototype;

public class Test {
	public static void main(String[] args) {
		//浅拷贝
		Prototype proto = new Prototype();
		for (int i = 0; i < 10; i++) {
			Prototype clone = proto.clone();
			clone.show();
		}
		//深拷贝
		Prototype2 proto2 = new Prototype2();
		for (int i = 0; i < 10; i++) {
			Prototype2 clone = proto2.clone();
			clone.show();
		}
	}
}
