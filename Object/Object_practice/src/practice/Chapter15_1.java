package practice;

public class Chapter15_1 {
	
	public static void main(String[] args) {
		
        int a = 976;
        int b = 427;
        System.out.println(a + " と " + b + " の最大公約数は、" + gcd(a, b) + "です。");
        
    }

    	
	//ユークリッドの互除法
	//例）148 と 28 の最大公約数
	//　148 % 28 = 16　← 大きい数（148）を小さい数（28）で割る
	//　28 % 16 = 12　 ← 割った数（28）を余り（16）で割る
	//　16 % 12 = 4 　 ← さらに割った数（16）を余り（12）で割る
	//　12 % 4 = 0   　← さらに計算して、余りが0になった時の割った数（4）が最大公約数
	
	//最大公約数：Greatest Common Divisor
    
	// ユークリッドの互除法で最大公約数を計算するメソッド
	static int gcd(int a, int b) {
			
			//余りが0になるまでwhileで繰り返し
			//		int dividend = a;	//割られる数
			//		int divisor = b;	//割る数
			//		int remainder = a % b;		//余り
			//		
			//		while(remainder > 0) {
			//			
			//			dividend = divisor;				//割る数 が次の計算では 割られる数 になる
			//			divisor = remainder;			//余り 　が次の計算では 割る数　　 になる
			//			
			//			remainder = dividend % divisor;	//余りを計算
			//			
			//		}
			//		
			//		return divisor;
		
		//再帰処理で繰り返し
		if (a % b == 0) {
			return b;
		}
		return gcd(b, a % b);
		
    }

}
