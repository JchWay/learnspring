package dynamicproxy;

import java.lang.reflect.Method;

public class Cglibproxy {

	@Override
	public Object intercept(Object proxy, Method method, Object[] params, MethodProxy methodProxy) throws Throwable {
		System.out.println("before invoke:" + method.getName() + " - " + System.currentTimeMillis());
		Object retObj = methodProxy.invokeSuper(proxy, params);
		System.out.println("after invoke:" + method.getName() + " - " + System.currentTimeMillis());
		return retObj;
	}

}