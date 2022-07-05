package Prototype;

public class Main {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 3; i++) {
			
			Sample sample = new Sample("Sample0" + i);
			sample.runSlowInitializeMethod();
			System.out.println(sample.getName() + "：" + sample.getInitializeCompletedFlag());
			
		}
		
		System.out.println();
		
		PrototypeSample prototypeSample = new PrototypeSample("Sample01");
		prototypeSample.runSlowInitializeMethod();
		System.out.println(prototypeSample.getName() + "：" + prototypeSample.getInitializeCompletedFlag());
		for (int i = 2; i <= 3; i++) {
			
			PrototypeSample prototypeSampleClone = prototypeSample.clone("Sample0" + i);
			System.out.println(prototypeSampleClone.getName() + "：" + prototypeSampleClone.getInitializeCompletedFlag());
			
		}
		
		
		/*
		 * ↑プロトタイプはサブクラスの生成を必要としないが、「初期化」の操作を必要とする。
		 * プロトタイプインターフェースを用意して、、等ではなく、
		 * cloneメソッドを追加して、まずそれを通常通り初期化した後に、コピーしてたくさん作る、という方針
		 * 下のように柔軟に変更していくことはできない。固定の型があって、しかし重くても一度作れば後はコピーするだけで済む。
		 * 
		 * ↓ファクトリメソッドはサブクラスの生成を必要とするが、初期化を必要としない。
		 * ファクトリやビルダーは、インターフェースを用意して、サブクラスで実装し、
		 * 柔軟に生成できるようにする。
		 * インスタンスによってセットするフィールドを変えたり初期化処理を柔軟に変えたりできるものの
		 * 一つ重い処理があると効率が悪い。
		 * プロトタイプが、作ってからコピーに対して、作りながら変更していく方針
		 * 
		 */
	}

}
