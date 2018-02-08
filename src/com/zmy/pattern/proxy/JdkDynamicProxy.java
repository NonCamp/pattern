package com.zmy.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk动态代理
 * @author Young
 *
 */
public class JdkDynamicProxy implements InvocationHandler{
	private Object tar;
	
	public Object bind(Object tar){
		this.tar = tar;
		return Proxy.newProxyInstance(tar.getClass().getClassLoader(), tar.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//调用之前做一些事情
		return method.invoke(tar, args);
		//调用之后做一些事情
	}


}
