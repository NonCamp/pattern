package com.zmy.pattern.bridge;

public class Rectangle extends AbstractShape{

	@Override
	public void show() {
		String color = super.color.draw();
		System.out.println(color + "的矩形");
	}

}
