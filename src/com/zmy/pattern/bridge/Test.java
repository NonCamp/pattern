package com.zmy.pattern.bridge;

public class Test {
	public static void main(String[] args) {
		AbstractColor red = new Red();
		AbstractShape circle = new Circle();
		circle.setColor(red);
		circle.show();
		
		AbstractColor blue = new Blue();
		AbstractShape rectangle = new Rectangle();
		rectangle.setColor(blue);
		rectangle.show();
		
	}
}
