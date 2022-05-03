package annotation.validator;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import annotation.annotationInterface.NotNull;
import annotation.annotationInterface.WordCount;

public class Validator {
	
	private static List<String> errorMessages;
	private static Object object;
	
	public static List<String> validate(Object obj) {
		
		errorMessages = new ArrayList<String>();
		object = obj;
		
		try {	
			checkNotNullAnnotation();
			checkWordCountAnnotation();
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		return errorMessages;
		
	}

	private static void checkNotNullAnnotation() throws IllegalArgumentException, IllegalAccessException {
			
		//対象のクラス情報を取得し、リフレクションでprivate含むフィールド情報を取る。
		Class clazz = object.getClass();
		Field[] fields = clazz.getDeclaredFields();
		
		//全てのフィールドを配列で取得したら一つずつ確認
		for (Field field : fields) {
			
			//privateでもアクセス可能に
			field.setAccessible(true);
			
			//フィールドにつけられたアノテーションの情報取得
			NotNull notNullAnnotation = field.getAnnotation(NotNull.class);
			
			//NotNullアノテーションがついていないフィールドは何もしない
			if (notNullAnnotation == null) {
				continue;
			}
			
			//フィールドがnullでなければ何もしない
			if (field.get(object) != null) {
				continue;
			}
			
			//エラーメッセージ追加
			errorMessages.add("[ " + field.getName() + " ]フィールドがnullです");
			
		}
		
	}
	
	private static void checkWordCountAnnotation() throws IllegalArgumentException, IllegalAccessException {
		
		Class clazz = object.getClass();
		Field[] fields = clazz.getDeclaredFields();
		
		for (Field field : fields) {
			
			field.setAccessible(true);
			WordCount wordCount = field.getAnnotation(WordCount.class);
			
			if (wordCount == null) {
				continue;
			}
			
			int countString = wordCount.value();
			String fieldString = (String) field.get(object);
			
			if (fieldString.length() <= countString) {
				continue;
			}
			
			errorMessages.add("[ " + field.getName() + " ]フィールドは" + countString + "文字以下である必要があります。");
			
		}
		
	}
	
}
