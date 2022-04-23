package locale;

import java.util.Locale;

public class SampleLocale {

	public void doSomething01() {
		
		Locale locale = null;
		
		locale = Locale.getDefault();
		System.out.println(locale.getLanguage() + ", " + locale.getCountry());
		
		locale = new Locale("en", "EN");
		System.out.println(locale.getLanguage() + ", " + locale.getCountry());
		
	}
	
}
