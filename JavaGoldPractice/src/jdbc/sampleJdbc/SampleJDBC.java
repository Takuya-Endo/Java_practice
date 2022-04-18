package jdbc.sampleJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
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

}
