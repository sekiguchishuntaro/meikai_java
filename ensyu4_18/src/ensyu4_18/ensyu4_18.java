package ensyu4_18;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：ensyu4_18
* 概要：演習4_18クラス
* 作成者：関口駿太郎
* 作成日：2023.04.18
*/


public class ensyu4_18 {
	
	/*
	 * 関数名：main
	 * メソッドの説明：1からnまでの整数値の2乗値を表示するプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.18
	 */
	public static void main(String[] args) {
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//("firstNumberの値:")を出力する
		System.out.print ("firstNumberの値:");
		//firstNumberに代入された値を取り込む
		int firstNumber = standardInput.nextInt ();
		//firstNumberの値が0より小さいか等しい場合
		if (firstNumber <= 0) {
			//("範囲外の値です。")と出力する
			System.out.print ("範囲外の値です。");
		}
		//thirdNumberの値を1で初期化、thirdNumberがfirstNumberより小さいか等しい場合、thirdNumberの値を1ずつ増加させる
		for (int thirdNumber = 1; thirdNumber <= firstNumber; thirdNumber ++) {
			//(thirdNumber + "の2乗は" + thirdNumber * thirdNumber)を出力する
			System.out.println (thirdNumber + "の2乗は" + thirdNumber * thirdNumber);
		}
			

	}
}
