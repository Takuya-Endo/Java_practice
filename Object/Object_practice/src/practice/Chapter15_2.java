package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Chapter15_2 {
	
	public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();
        // PathクラスのインスタンスをFileSystem.getPathメソッドで生成
        Path inputPath = fs.getPath("resources/input.txt");
        Path outputPath = fs.getPath("resources/output.txt");
        
        //try-catch-finally 例外処理
        //try：例外が発生する可能性がある処理（例外が発生しなければ通常に行われるべき処理を書く）
        //catch：例外が発生した場合に行われる処理
        //finally：例外発生の有無に関わらず必ず実行する処理
        
        //回答
//      try (FileReader fileReader = new FileReader("resources/input.txt"); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
        //解答
        try (BufferedReader reader = Files.newBufferedReader(inputPath); BufferedWriter writer = Files.newBufferedWriter(outputPath);) {
        	//↑
        	//try-with-resourcesでは try { でなく try (---) { とし、
        	//()内にクローズの対象となるリソースの生成処理を記述することで、
        	//finallyブロックでclose()を呼び出さなくても自動でクローズされる。
        	
            String line = null;
            // BufferedReader.readLineメソッドを使用して、1行づつ処理
            // 読み込む行がなくなるまでループ
            while (・・・) {
                // 文字数が5以外の場合はスキップ
                ・・・
                // 読み込んだ1行を出力
                ・・・
                // 改行がついてないので改行を出力
                ・・・
            }

        //resourceディレクトリにinput.txtファイルが存在しなかった場合の例外処理
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("出力処理終了");
        }
    }

}
