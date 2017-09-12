package aspectj;

import java.util.HashMap;

public aspect ASingleton {
	private HashMap<Class<?>, Object> singletons = new HashMap<Class<?>, Object>();

	// Intercepte chaque appel à new, des classes, des packages orders et clients.
	pointcut init():
		call(clients.*.new(..)) ||
		call(orders.*.new(..));
	
	
	Object around(): init()
	{
		Class<?> singletonClass = thisJoinPoint.getSignature().getDeclaringType();
		Object singletonObject = this.singletons.get(singletonClass);
		if (singletonObject == null) {
			singletonObject = proceed();
			this.singletons.put(singletonClass, singletonObject);
		}
		return singletonObject;
	}
}

