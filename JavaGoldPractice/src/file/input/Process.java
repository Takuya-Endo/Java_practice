package file.input;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Process {
	
	public void doSomething01() {
		try {
			
			File file = new File("src\\module\\src\\com\\sample\\client\\Main.java");
			FileInputStream fileInputStream = new FileInputStream(file);
			BufferedInputStream bufferedInputStream01 = new BufferedInputStream(fileInputStream);
			BufferedInputStream bufferedInputStream02 = new BufferedInputStream(fileInputStream);
			
			try (bufferedInputStream01; bufferedInputStream02) {
				
				for (byte b : bufferedInputStream01.readAllBytes()) {
					System.out.print(b);
				}
				
				System.out.print("\n");
				
				while (bufferedInputStream02.readNBytes(1024).length != 0) {
					System.out.print(bufferedInputStream02.readNBytes(500));
				}
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
