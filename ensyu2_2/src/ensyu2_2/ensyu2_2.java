package ensyu2_2;
/*
 * クラス名：ensyu2_2
 * 概要：演習2_1クラス
 * 作成者：関口駿太郎
 * 作成日：2023.04.06
 */

public class ensyu2_2 {
	
	/*
	 * 関数名：main
	 * メソッドの説明：三つのint型の変数に値を代入し、合計と平均を求めるプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.06
	 * 
	 */
	public static void main(String[] args) {
		
		//firstNumberはint型の変数
		int firstNumber;
		//secondNumberはint型の変数
		int secondNumber;
		//thirdNumberはint型の変数
		int thirdNumber;
		
		//firstNumberに値を代入
		firstNumber = 5;
		//secondNumberに値を代入
		secondNumber = 10;
		//thirdNumberに値を代入
		thirdNumber = 15;
		
		//firstNumberとsecondNumberとthirdNumberの合計を表す
		System.out.println("合計は" +(firstNumber + secondNumber + thirdNumber)+"です。");
		//firstNumberとsecondNumberとthirdNumberの平均を表す
		System.out.println("平均は" +(firstNumber + secondNumber + thirdNumber)/3 +"です。");
	}
 
}
