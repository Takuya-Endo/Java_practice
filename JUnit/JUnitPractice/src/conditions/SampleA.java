package conditions;

import java.util.Objects;

public class SampleA {
	
	public String method(String str) throws Exception {
		
		if (Objects.isNull(str)) {
			throw new Exception("nullpo");
		}
		
		if (str.equals("")) {
			return "strは空文字です";
		}
		
		return "strは空文字ではありません";
		
	}
	
}
