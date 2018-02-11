package com.zmy.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject extends Subject{
	private List<Observer> observers = new ArrayList<Observer>();
	private String subjectState;
	
	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void change(String state) {
		System.out.println("主题更改为"+state+"。。");
		subjectState = state;
		for (Observer observer : observers) {
			observer.update(subjectState);
		}
	}

}
