package jdbc.sampleJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SampleJDBC {
	
//	サーバー起動コマンド
//	>cd C:\Users\home\Tools\derby\db-derby-10.15.2.0-bin
//	>java -jar lib/derbyrun.jar server start
	
	public void doSomething01() {
		
		Connection connection = null;
		
		try {
			
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
			
			sql = "SELECT * FROM item;";
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

}
