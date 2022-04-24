package locale;

import java.util.Locale;

public class SampleLocale {

	public void doSomething01() {
		
		Locale locale = null;
		
		locale = Locale.getDefault();
		System.out.println(locale.getLanguage() + ", " + locale.getCountry());
		
		locale = new Locale("en", "EN"); //"EN"が間違っているが、例外は送出されない
		System.out.println(locale.getLanguage() + ", " + locale.getCountry());
		
		locale = Locale.US;
		System.out.println(locale.getLanguage() + ", " + locale.getCountry());
		
	}
	
}
