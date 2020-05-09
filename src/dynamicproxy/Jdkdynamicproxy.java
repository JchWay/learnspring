package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Jdkdynamicproxy {
	
	public static void main(String[] args) {
		
		//���������ʵ����
		Programmer programmer = new Programmer();
		
		//����������ʵ����
		InvocationHandler handler = new DynamicProxyHandler(programmer);
		
		People proxyProgrammer = (People)Proxy.newProxyInstance(
				programmer.getClass().getClassLoader(),
				programmer.getClass().getInterfaces(),
				handler);//�������󶨴�����
		System.out.println(proxyProgrammer.WorkAndGetReward());		
				
	}

}
