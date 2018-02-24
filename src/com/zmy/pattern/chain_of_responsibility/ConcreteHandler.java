package com.zmy.pattern.chain_of_responsibility;

public class ConcreteHandler extends Handler{

	@Override
	public void handleRequest() {
		if (this.getHandler() != null) {
			this.getHandler().handleRequest();
		} else {
			System.out.println("第一级处理。。。");
		}
	}

}
