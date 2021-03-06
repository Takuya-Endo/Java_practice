package properties;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

public class SampleProperties {

	public void doSomething01() {
		try {
			
			Path path = Paths.get("src", "properties", "sample.properties");
			File file = path.toFile();	
			try (FileReader fileReader = new FileReader(file)) {
				
				Properties properties = new Properties();
				properties.load(fileReader);
				
				Set set = properties.keySet();
				set.stream().forEach(key -> System.out.println(key + "=" + properties.get(key)));
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void doSomething02() {
		
		String basename = "sample";
		ResourceBundle resourceBundle = ResourceBundle.getBundle(basename);
		Set<String> set = resourceBundle.keySet();
		set.stream().forEach(key -> System.out.println(key + "=" + resourceBundle.getString(key)));
		
	}
	
	public void doSomething03() {
		try {
			
			Path path = Paths.get("src", "properties");
			URLClassLoader urlClassLoader;
			urlClassLoader = new URLClassLoader(new URL[]{path.toFile().toURI().toURL()});
			
			ResourceBundle resourceBundle = ResourceBundle.getBundle("sample",  Locale.JAPAN, urlClassLoader);
//			ResourceBundle resourceBundle = ResourceBundle.getBundle("sample",  Locale.US, urlClassLoader);
			resourceBundle.keySet().stream().forEach(key -> System.out.println(key + "=" + resourceBundle.getString(key)));
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
}
