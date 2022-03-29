package nestedClass.sampleConcealment;

/*public*/ class SampleImplements implements SampleInterface {
	
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
