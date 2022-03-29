package nestedClass.sampleConcealment;

public class ImplementsAndFactory {

	public static SampleInterface create() {	
		
//		return new this.SampleInnerImplements();
		
		ImplementsAndFactory implementsAndFactory = new ImplementsAndFactory();
		SampleInnerImplements sampleInnerImplements = implementsAndFactory.new SampleInnerImplements();
		return sampleInnerImplements;
		
	}
	
	private class SampleInnerImplements implements SampleInterface {
		
		//情報隠蔽したいメソッド
		public void conceal() {
			System.out.println("conceal");
		}
		
		//公開したいメソッド
		@Override
		public void publish() {
			System.out.println("publish");
		}
		
	}
	
}
