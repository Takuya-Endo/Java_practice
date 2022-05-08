package nestedClass.sampleEnum;

public enum SampleEnum {
	
	sampleA, sampleB("引数ありコンストラクタ"), sampleC;
	
	//上に列挙したものは、このクラス自体のインスタンスとして自動生成される
	//コンストラクタはprivateでないといけない
	private SampleEnum() {
		this.field = "デフォルトコンストラクタ";
	}
	private SampleEnum(String field) {
		this.field = field;
	}
	
	private String field;
	public String getField() {
		return this.field;
	}
	
	public static void print() {
		
		System.out.println(SampleEnum.sampleA);
		System.out.println(SampleEnum.valueOf("sampleA"));
		System.out.println(SampleEnum.values()[0]);
		
		System.out.println(SampleEnum.sampleA.getField());
		System.out.println(SampleEnum.valueOf("sampleA").getField());
		System.out.println(SampleEnum.values()[0].getField());
		
		System.out.println(SampleEnum.sampleB);
		System.out.println(SampleEnum.valueOf("sampleB"));
		System.out.println(SampleEnum.values()[1]);
		
		System.out.println(SampleEnum.sampleB.getField());
		System.out.println(SampleEnum.valueOf("sampleB").getField());
		System.out.println(SampleEnum.values()[1].getField());
		
	}
	
}
