package com.zmy.pattern.state;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		//Red->Blue->Green->Red
		 Context c = new Context();  
         State redsState = new RedState();         
         c.setState(redsState);  
		 while (true){  
		     System.out.println("当前状态："+c.getState().getState());  
		     System.out.print("上一个状态: ");
		     c.push();
		     Thread.currentThread().sleep(2000);
		 }          
	}
}
