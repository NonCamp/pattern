package com.zmy.pattern.observer;

public abstract class Subject {
	
	public abstract void attach(Observer observer);
	public abstract void detach(Observer observer);
	public abstract void change(String state);
}
