package annotation;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Validator {
	
	public static List<String> validate(Object object) {
		
		List<String> errorMessages = new ArrayList<String>();
		
		try {
			
			Class clazz = object.getClass();
			Field[] fields = clazz.getDeclaredFields();
			
			for (Field field : fields) {
				
				field.setAccessible(true);
				NotNull itemValidation = field.getAnnotation(NotNull.class);
				
				if (itemValidation == null) {
					continue;
				}
				
				if (field.get(object) != null) {
					continue;
				}
				
				errorMessages.add("[ " + field.getName() + " ]フィールドがnullです");
				
			}
			
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		return errorMessages;
		
	}

}
