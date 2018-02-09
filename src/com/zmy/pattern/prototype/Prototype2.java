package com.zmy.pattern.prototype;

import java.util.ArrayList;

public class Prototype2 implements Cloneable {
	private ArrayList<String> list = new ArrayList<>();

	public Prototype2 clone() {
		Prototype2 proto = null;
		try {
			proto = (Prototype2) super.clone();
			proto.list = (ArrayList<String>) this.list.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return proto;
	}
	
	public void show(){
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(list);
	}
}
