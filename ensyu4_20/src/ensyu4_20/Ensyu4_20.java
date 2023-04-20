package ensyu4_20;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：ensyu4_20
* 概要：演習4_20クラス
* 作成者：関口駿太郎
* 作成日：2023.04.19
*/


public class Ensyu4_20 {
	
	/*
	 * 関数名：main
	 * メソッドの説明：n段の正方形を表示するプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.19
	 */
	public static void main(String[] args) {
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//("正方形を表示します。")と出力する
		System.out.println ("正方形を表示します。");
		//("段数は:")と出力する
		System.out.print ("段数は:");
		//firstNumberの値に代入された値を読み込む
		int firstNumber = standardInput.nextInt ();
		//firstNumberが0より小さいか等しい場合
		if (firstNumber <= 0) {
			//("範囲外の値です。")と出力する
			System.out.print ("範囲外の値です。");
		}
		/*
		 * secondNumberの値を1で初期化
		 * secondNumberの値がfirstNumberの値より小さいか等しい場合
		 * secondNumberの値を1ずつ増加させる
		 */
		for (int secondNumber = 1; secondNumber <= firstNumber; secondNumber ++) {
			/*
			 * thirdNumberの値を1で初期化
			 * thirdNumberの値がfirstNumberの値より小さいか等しい場合
			 * thirdNumberの値を1ずつ増加させる
			 */
			for (int thirdNumber = 1; thirdNumber <= firstNumber; thirdNumber ++) {
				//("*")を出力する
				System.out.print ("*");
			}
			//改行して出力する
			System.out.println ();
			
		}
		
		

	}
}
