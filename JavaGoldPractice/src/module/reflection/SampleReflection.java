package module.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SampleReflection {
	
	public void doSomething01() {
		try {
			
			Object object = Factory.create();
			
			Class clazz = object.getClass();
			Method[] methods = clazz.getDeclaredMethods();
			
			System.out.println(methods.length);
			for (Method method : methods) {
				System.out.println(method.invoke(object));
			}
		
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
