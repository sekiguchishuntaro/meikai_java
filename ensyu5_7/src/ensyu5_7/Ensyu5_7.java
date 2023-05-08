package ensyu5_7;

/*
* クラス名：Ensyu5_7
* 概要：演習5_7クラス
* 作成者：関口駿太郎
* 作成日：2023.04.21
*/

public class Ensyu5_7 {
	
	/*
	 * 関数名：main
	 * メソッドの説明：0.0から1.0まで0.001おきに、その値と、その値の2乗を表示するプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.21
	 */
	public static void main(String[] args) {
		//("実数値    実数値の2乗")と出力する
		System.out.println ("実数値    実数値の2乗");
		//("------------------------")と出力する
		System.out.println ("------------------------");
		/*
		 * seondNumberの値を0で初期化
		 * secondNumberの値が1000より小さいか等しい場合
		 * secondNumberの値を1ずつ増加せる
		 */
		for (int secondNumber = 0; secondNumber <= 1000; secondNumber ++) {
			//(float) secondNumber / 1000の値をfirstNumberに代入
			float firstNumber = (float) secondNumber / 1000;
			//("%5.3f %8.6f\n", firstNumber, firstNumber * firstNumber)と出力する
			System.out.printf ("%5.3f %8.6f\n", firstNumber, firstNumber * firstNumber);
		}
	}
}
