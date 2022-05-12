package locale;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;

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
	
	public void doSomething03() {
		
		DateTimeFormatter dateTimeFormatter = null;
		String now = "";
		
		dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		now = dateTimeFormatter.format(LocalDate.now());
		System.out.println(now);
		
		dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		now = dateTimeFormatter.format(LocalDate.now());
		System.out.println(now);
		
		dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		now = dateTimeFormatter.format(LocalDate.now());
		System.out.println(now);
		
		dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		now = dateTimeFormatter.format(LocalDate.now());
		System.out.println(now);
		
		
		Locale locale = Locale.US;
		
		dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(locale);
		now = dateTimeFormatter.format(LocalDate.now());
		System.out.println(now);
		
		dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(locale);
		now = dateTimeFormatter.format(LocalDate.now());
		System.out.println(now);
		
		dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(locale);
		now = dateTimeFormatter.format(LocalDate.now());
		System.out.println(now);
		
		dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(locale);
		now = dateTimeFormatter.format(LocalDate.now());
		System.out.println(now);
		
	}
	
	public void doSomething04() {
		
		Locale locale = new Locale.Builder()
				.setLanguage("en")
				.setRegion("US")
				.build();
		
		DateTimeFormatter dateTimeFormatter = null;
		String now = "";
		
		dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		now = dateTimeFormatter.format(LocalDate.now());
		System.out.println(now);
		
		dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(locale);
		now = dateTimeFormatter.format(LocalDate.now());
		System.out.println(now);
		
	}
	
	public void doSomething05() {
		
		String country = "";
		ResourceBundle resourceBundle = null;
		
		resourceBundle = ResourceBundle.getBundle("LocaleInfo");
		country = resourceBundle.getString("country");
		System.out.println(country); //Japan
		
//		resourceBundle = ResourceBundle.getBundle("LocaleInfo");
//		country = resourceBundle.getString("aaaaaaaaa");
//		System.out.println(country); //java.util.MissingResourceException
		
		resourceBundle = ResourceBundle.getBundle("LocaleInfo", Locale.US);
		country = resourceBundle.getString("country");
		System.out.println(country); //America
		
		//LocaleInfo.propertiesのないよう(unknown)を表示させるには、
		//デフォルトを変える必要がある？
		resourceBundle = ResourceBundle.getBundle("LocaleInfo", Locale.FRANCE);
		country = resourceBundle.getString("country");
		System.out.println(country); //Japan
		
		Locale locale = new Locale.Builder().setLanguage("fr").setRegion("FR").build();
		resourceBundle = ResourceBundle.getBundle("LocaleInfo", locale);
		country = resourceBundle.getString("country");
		System.out.println(country); //Japan
		
	}
	
}
