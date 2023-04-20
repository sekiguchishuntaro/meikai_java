package ensyu4_23;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：ensyu4_23
* 概要：演習4_23クラス
* 作成者：関口駿太郎
* 作成日：2023.04.19
*/

public class Ensyu4_23 {
	
	/*
	 * 関数名：main
	 * メソッドの説明：n段の数字のピラミッドを表示するプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.19
	 */
	public static void main(String[] args) {
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//("ピラミッドを表示します。")と出力する
		System.out.println ("ピラミッドを表示します。");
		//("段数は:")と出力する
		System.out.print ("段数は:");
		//firstNumberに代入された値を読み込む
		int firstNumber = standardInput.nextInt ();
		//firstNumberの値が0より小さいか等しい場合
		if (firstNumber <= 0)
			//("範囲外の値です。")と出力
			System.out.print ("範囲外の値です。");
		/*
		 * secondNumberの値を1で初期化
		 * secondNumberの値がfirstNumberより小さいか等しい場合
		 * secondNumberの値を1ずつ増加させる
		 */
		for (int secondNumber = 1; secondNumber <= firstNumber; secondNumber ++) {
			/*
			 * thirdNumberの値を1で初期化
			 * thirdNumberの値がfirstNumber - 1より小さいか等しい場合
			 * thirdNumberの値を1ずつ増加させる
			 */
			for (int thirdNumber = 1; thirdNumber <= firstNumber - secondNumber; thirdNumber ++) {
				//(' ')を出力する
				System.out.print (' ');
			}
			/*
			 * thirdNumberの値を1で初期化
			 * thirdNumberが2 * secondNumber - 1より小さいか等しい場合
			 * thirdNumberの値を1ずつ増加させる
			 */
			for (int thirdNumber = 1; thirdNumber <= 2 * secondNumber - 1; thirdNumber ++) {
				//(secondNumber % 10)を出力する
				System.out.print (secondNumber % 10);
			}
			//改行し出力する
			System.out.println ();
		}
	}

}
