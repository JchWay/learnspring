package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Jdkdynamicproxy {
	
	public static void main(String[] args) {
		
		//要被代理的真实对象
		Programmer programmer = new Programmer();
		
		//将要被代理的真实对象传入代理对象的调用处理器的构造函数中
		InvocationHandler handler = new DynamicProxyHandler(programmer);
		
		People proxyProgrammer = (People)Proxy.newProxyInstance(
				programmer.getClass().getClassLoader(),
				programmer.getClass().getInterfaces(),
				handler);
		System.out.println(proxyProgrammer.WorkAndGetReward());		
				
	}

}
