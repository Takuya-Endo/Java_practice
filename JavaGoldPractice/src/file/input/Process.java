package file.input;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

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
	
	public void doSomething02() {
		
		System.out.print("入力待ち>>");
		
		//↓ バイトストリームを扱うInputStreamから、
		InputStream inputStream = null;
		//↓ 変換用のInputStreamReaderを経由して、
		InputStreamReader inputStreamReader = null;
		//↓ 文字ストリームを扱うBufferedReaderを取得
		BufferedReader bufferedReader = null;
		
		try {
			
			inputStream = System.in; //inはInputStream型のstatic finalフィールド
			//output ≠ System.out //outはOutputStreamでなくPrintStreamの点に注意。また、どちらもJVM起動と同時に開く。
			
			inputStreamReader = new InputStreamReader(inputStream); //変換用
			bufferedReader = new BufferedReader(inputStreamReader); //変換
			
			System.out.println(bufferedReader.readLine());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedReader.close();
				inputStreamReader.close();
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void doSomething03() {
		
		System.out.print("入力待ち>>");
		
		//↓ バイトストリームを扱うInputStreamから、
		InputStream inputStream = null;
		//↓ 変換用のInputStreamReaderを経由して、
		InputStreamReader inputStreamReader = null;
		//↓ 文字ストリームを扱うBufferedReaderを取得
		BufferedReader bufferedReader = null;
		
		try {
			
			//下3行を1行で書き換える
			Console console = System.console();
//			inputStream = System.in; //inはInputStream型のstatic finalフィールド
//			inputStreamReader = new InputStreamReader(inputStream); //変換用
//			bufferedReader = new BufferedReader(inputStreamReader); //変換
			
			//readLineで例外処理も不要になる
			System.out.println(console.readLine());
//			System.out.println(bufferedReader.readLine());
			
			
//		} catch (IOException e) {
//			e.printStackTrace();
		} finally {
			try {
				bufferedReader.close();
				inputStreamReader.close();
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void doSomething04() {
		
		Path path = Paths.get("src");
		try (Stream<Path> pathStream = Files.walk(path)) {
			
			pathStream.forEach(System.out::println);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void doSomething05() {
		
		BiPredicate<Path, BasicFileAttributes> matcher = (argPath, basicFileAttributes) -> argPath.toString().contains("file");
		
		Path path = Paths.get("src");
		try (Stream<Path> pathStream = Files.find(path, 5, matcher)) {
			
			pathStream.forEach(System.out::println);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void doSomething06() {
		
		FileVisitor<Path> visitor = new SimpleFileVisitor<Path>() {
			
			private int fileLevel = 0;
			
			@Override
			public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
				String space = "";
				for (int i = 0; i < this.fileLevel; i++) {
					space += "   ";
				}
				System.out.println(space + "∟" + dir.getFileName() + "\n" + space + space + "|");
				this.fileLevel++;
				return FileVisitResult.CONTINUE;
			}
			
			@Override
			public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
				this.fileLevel--;
				return FileVisitResult.CONTINUE;
			}
			
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
				String space = "";
				for (int i = 0; i < this.fileLevel; i++) {
					space += "    ";
				}
				System.out.println(space + "∟" + file.getFileName());
				return FileVisitResult.CONTINUE;
			}
		};
		
		try  {
			
			Path path = Files.walkFileTree(Paths.get("src"), visitor);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
