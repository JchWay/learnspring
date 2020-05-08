package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Jdkdynamicproxy {
	
	public static void main(String[] args) {
		
		//Ҫ���������ʵ����
		Programmer programmer = new Programmer();
		
		//��Ҫ���������ʵ������������ĵ��ô������Ĺ��캯����
		InvocationHandler handler = new DynamicProxyHandler(programmer);
		
		People proxyProgrammer = (People)Proxy.newProxyInstance(
				programmer.getClass().getClassLoader(),
				programmer.getClass().getInterfaces(),
				handler);
		System.out.println(proxyProgrammer.WorkAndGetReward());		
				
	}

}
