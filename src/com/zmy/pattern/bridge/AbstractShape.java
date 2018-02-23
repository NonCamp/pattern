package com.zmy.pattern.bridge;

public abstract class AbstractShape {
	protected AbstractColor color;
	public abstract void show();
	public void setColor(AbstractColor color) {
		this.color = color;
	}
	
}
