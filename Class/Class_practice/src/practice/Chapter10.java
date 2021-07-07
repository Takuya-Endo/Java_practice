package practice;

import java.sql.SQLException;

public class Chapter10 {
	
	public static void main(String[] args) {
		
		try {
			int array[] = { 1, 3, 5 };
			Chapter10.validIndex(array, 2);
			Chapter10.validIndex(array, 3);
			System.out.println("validIndexの呼び出し終了");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentExceptionが発生しました");
			e.printStackTrace();
		}
		
		try {
			Chapter10.throwSQLException();
		} catch (SQLException e) {
			System.out.println("SQLExceptionが発生しました");
			e.printStackTrace();
		} finally { //解答追加
			System.out.println("throwSQLExceptionの呼び出し終了");
		}
		System.out.println("mainメソッド終了");
	}
	
  //public static void validIndex(int array[], int index) throws IllegalArgumentException {	//回答
	public static void validIndex(int[] array, int index) {									//解答
		if (array.length <= index) {	//解答
			throw new IllegalArgumentException(index +  " はサイズの範囲外です");
		}
		System.out.println("インデックス " + 2 + " の要素は " + array[index] + " です");
		
//		回答
//		if (0 <= index && index <= 2) {
//			System.out.println("インデックス " + 2 + " の要素は " + array[index] + " です");
//		}
//		else {
//			throw new IllegalArgumentException(index +  " はサイズの範囲外です");
//		}
	}
	
	public static void throwSQLException() throws SQLException {
		throw new SQLException("SQLエラーです");
	}

}
