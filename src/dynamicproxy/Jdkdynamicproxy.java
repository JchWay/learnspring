package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Jdkdynamicproxy {
	
	public static void main(String[] args) {
		
		//被代理的真实对象
		Programmer programmer = new Programmer();
		
		//处理器绑定真实对象
		InvocationHandler handler = new DynamicProxyHandler(programmer);
		
		People proxyProgrammer = (People)Proxy.newProxyInstance(
				programmer.getClass().getClassLoader(),
				programmer.getClass().getInterfaces(),
				handler);//代理对象绑定处理器
		System.out.println(proxyProgrammer.WorkAndGetReward());		
				
	}

}
