package ensyu6_9;
//ランダムで値を生成する準備
import java.util.Random;
//キーボードから値や文字を入力するための準備
import java.util.Scanner;
/*
* クラス名：Ensyu6_9
* 概要：演習6_9クラス
* 作成者：関口駿太郎
* 作成日：2023.04.25
*/


public class Ensyu6_9 {
	
	/*
	 * 関数名：main
	 * メソッドの説明：要素型がint型である配列を作り、全要素を1から10の乱数で埋めつくすプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.25
	 */
	public static void main(String[] args) {
		//乱数を扱うための準備
		Random randomNumber = new Random ();
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//FIRST_VALUEの値を1で初期化
		final int FIRST_VALUE = 1;
		//SECOND_VALUEの値を10で初期化
		final int SECOND_VALUE = 10;
		//firstNumberの値を0で初期化
		int firstNumber = 0;
		//doからwhileまで一度実行
		do {
			
		//("要素数:")を出力する
		System.out.print("要素数:");
		//firstNumberに代入された値を読み込む
		 firstNumber = standardInput.nextInt();
		 //firstNumberの値が0より小さいか等しい場合繰り返し行う
		}while (firstNumber <= 0);
		//配列を生成
		int[]secondNumber = new int[firstNumber];
		/*
		 * thirdNumberの値を0で初期化
		 * thirdNumberの値がfirstNumberの値より小さい場合
		 * thirdNumberの値を1ずつ増加させる
		 */
		for (int thirdNumber = 0; thirdNumber < firstNumber; thirdNumber ++)
			//FIRST_VALUE + randomNumber.nextInt (SECOND_VALUE)をsecondNumber[thirdNumber]の値に加え、1から10の乱数生成
			secondNumber[thirdNumber] = FIRST_VALUE + randomNumber.nextInt (SECOND_VALUE);
		/*
		 * thirdNumberの値を0で初期化
		 * thirdNumberの値がfirstNumberの値より小さい場合
		 * thirdNumberの値を1ずつ増加させる
		 */
		for (int thirdNumber = 0; thirdNumber < firstNumber; thirdNumber ++)
			//("secondNumber[" + thirdNumber + "] =" + secondNumber[thirdNumber])を出力する
			System.out.println ("secondNumber[" + thirdNumber + "] =" + secondNumber[thirdNumber]);
			


	}
}
