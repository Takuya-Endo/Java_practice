package locale;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
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
	
	public void doSomething02() {
		
		DateTimeFormatter dateTimeFormatter = null;
		String now = "";
		
		dateTimeFormatter = DateTimeFormatter.ISO_DATE;
		now = dateTimeFormatter.format(LocalDate.now());
		System.out.println(now);

		dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
		now = dateTimeFormatter.format(LocalDate.now());
		System.out.println(now);
		
		dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		now = dateTimeFormatter.format(LocalDate.now());
		System.out.println(now);
		
	}
	
}
