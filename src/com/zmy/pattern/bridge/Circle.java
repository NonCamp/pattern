package com.zmy.pattern.bridge;

public class Circle extends AbstractShape{

	@Override
	public void show() {
		String color = super.color.draw();
		System.out.println(color +"的圆形");
	}

}
