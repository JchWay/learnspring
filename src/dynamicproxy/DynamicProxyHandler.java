package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler {

	private Object obj;
	
	public DynamicProxyHandler(Object obj) {
		this.obj=obj;
	}
	
	@Override
	public Object invoke(Object proxy,Method method,Object[] args) throws Throwable{
		System.out.println(method.getName());
		System.out.println("before invoke:"+method.getName());
		//objΪ�󶨵���ʵ����methodΪ���������õķ���
		Object invoke = method.invoke(obj, args);
		System.out.println("after invoke:"+method.getName());
		
		return invoke;
	}
}
