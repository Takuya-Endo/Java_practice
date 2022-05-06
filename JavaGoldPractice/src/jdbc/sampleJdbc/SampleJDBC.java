package jdbc.sampleJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SampleJDBC {
	
//	サーバー起動コマンド
//	>cd C:\Users\home\Tools\derby\db-derby-10.15.2.0-bin
//	>java -jar lib/derbyrun.jar server start
	public void doSomething01() {
		
		Connection connection = null;
		
		try {
			
//			コマンドプロンプトでSQLを入力する簡易クライアント起動は「>java -jar lib/derbyrun.jar ij」
//			ij> connect 'jdbc:derby://localhost:1527/data/Sample;';
			connection = DriverManager.getConnection("jdbc:derby://localhost:1527/data/Sample");
			
			System.out.println(connection);
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void doSomething02() {
		
//		ij> connect 'jdbc:derby://localhost:1527/data/Sample;';
		try (Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/data/Sample")) {
			
			System.out.println(connection);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void doSomething03() {
		
//		ij> connect 'jdbc:derby://localhost:1527/data/Sample;';
		try (Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/data/Sample")) {
			
			String sql = "";
			PreparedStatement preparedStatement = null;
			
			sql = "SELECT * FROM item";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.close();
			
			sql = "INSERT INTO item (id, name) VALUES (?, ?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, 2);
			preparedStatement.setString(2, "sample");
			preparedStatement.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void doSomething04() {
		
//		ij> connect 'jdbc:derby://localhost:1527/data/Sample;';
		try (Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/data/Sample")) {
			
			String sql = "INSERT INTO item (id, name) VALUES (?, ?)";
			try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
				
				preparedStatement.setInt(1, 2);
				preparedStatement.setString(2, "sample");
				int result = preparedStatement.executeUpdate();
				System.out.println(result);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void doSomething05() {
		
//		ij> connect 'jdbc:derby://localhost:1527/data/Sample;';
		try (Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/data/Sample")) {
			
			String sql = "SELECT * FROM item";
			try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
				
				ResultSet resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					
					System.out.print(resultSet.getInt(1) + ", ");
					System.out.print(resultSet.getInt("id") + ", ");
					System.out.print(resultSet.getString(2) + ", ");
					System.out.print(resultSet.getString("name") + ", ");
					System.out.println();
					
				}
				
			}
			
			//preparedStatementは明示的に閉じる必要あり
			//resultSetも明示的に閉じる必要あり
			//ただし、preparedStatementが閉じられると、resultSetも同時に閉じる
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void doSomething06() {
		
//		ij> connect 'jdbc:derby://localhost:1527/data/Sample;';
		try (Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/data/Sample")) {
			String sql = "";
			
			sql = "INSERT INTO item (id, name) VALUES (?, ?)";
			try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
				String[] names = {"sampleC", "sampleD", "sampleE"};
//				int result = 0;
//				for (int i = 0; i < 3; i++) {
//					preparedStatement.setInt(1, i + 3);
//					preparedStatement.setString(2, names[i]);
//					result += preparedStatement.executeUpdate();
//				}
//				System.out.println(result + "件更新");
				for (int i = 0; i < 3; i++) {
					preparedStatement.setInt(1, i + 3);
					preparedStatement.setString(2, names[i]);
					preparedStatement.addBatch();
				}
				int[] results = preparedStatement.executeBatch();
				System.out.println(results.length + "件更新");
			}
			
			sql = "SELECT * FROM item";
			try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
				ResultSet resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					System.out.print(resultSet.getInt("id") + " ");
					System.out.print(resultSet.getString("name") + "\n");
				}
			}
			
			//preparedStatementは明示的に閉じる必要あり
			//resultSetも明示的に閉じる必要あり
			//ただし、preparedStatementが閉じられると、resultSetも同時に閉じる
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void doSomething07() {
		
		System.out.println("id" + "　" + "name");
		String sql = "";
		String arg = "";
		
//		↓サーバー起動
//		>cd C:\Users\home\Tools\derby\db-derby-10.15.2.0-bin
//		>java -jar lib/derbyrun.jar server start
		
		String cnnect = "jdbc:derby://localhost:1527/data/Sample";
		try (Connection connection = DriverManager.getConnection(cnnect)) {
			
			System.out.println("---------------");
			sql = "SELECT * FROM item";
			try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
				ResultSet resultSet = preparedStatement.executeQuery();
				while (resultSet.next()){
					int id = resultSet.getInt(1);
					String name = resultSet.getString(2);
					System.out.println(" " + id + "　" + name);
				}
			}
			
			System.out.println("---------------");
			sql = "SELECT * FROM item WHERE name = ?";
			try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
				preparedStatement.setString(1, "sample");
				ResultSet resultSet = preparedStatement.executeQuery();
				while (resultSet.next()){
					int id = resultSet.getInt(1);
					String name = resultSet.getString(2);
					System.out.println(" " + id + "　" + name);
				}
			}
			
			//PreparedStatementを使用せず、変数でSQL文に値を渡す
			System.out.println("---------------");
			arg = "'sample'";
			sql = "SELECT * FROM item WHERE name = " + arg;
			try (Statement statement = connection.createStatement()) {
				boolean result = statement.execute(sql);
				if (!result) return;
				ResultSet resultSet = statement.executeQuery(sql);
				while (resultSet.next()){
					int id = resultSet.getInt(1);
					String name = resultSet.getString(2);
					System.out.println(" " + id + "　" + name);
				}
			}
			
			//Statementを使用すると、SQLインジェクションのリスク
			System.out.println("---------------");
			arg = "'sample' OR 1 = 1";
			sql = "SELECT * FROM item WHERE name = " + arg;
			try (Statement statement = connection.createStatement()) {
				boolean result = statement.execute(sql);
				if (!result) return;
				ResultSet resultSet = statement.executeQuery(sql);
				while (resultSet.next()){
					int id = resultSet.getInt(1);
					String name = resultSet.getString(2);
					System.out.println(" " + id + "　" + name);
				}
			}
			
			System.out.println("---------------");
			arg = "sample";
			sql = "SELECT * FROM item WHERE name = " + arg;
			try (Statement statement = connection.createStatement()) {
				sql = "SELECT * FROM item WHERE name = " + statement.enquoteIdentifier(arg, true);
				System.out.println(sql);
				boolean result = statement.execute(sql);
				if (!result) return;
				ResultSet resultSet = statement.executeQuery(sql);
				while (resultSet.next()){
					int id = resultSet.getInt(1);
					String name = resultSet.getString(2);
					System.out.println(" " + id + "　" + name);
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
