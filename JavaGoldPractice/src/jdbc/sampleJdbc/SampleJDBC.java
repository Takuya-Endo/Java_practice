package jdbc.sampleJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

}
