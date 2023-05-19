package ensyu6_10;

//ランダムで値を生成する準備
import java.util.Random;
//キーボードから値や文字を入力するための準備
import java.util.Scanner;
/*
* クラス名：Ensyu6_10
* 概要：演習6_10クラス
* 作成者：関口駿太郎
* 作成日：2023.04.25
*/

public class Ensyu6_10 {
	/*
	 * 関数名：main
	 * メソッドの説明：連続する要素が値をもつことのないプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.25
	 */
	public static void main(String[] args) {
		//乱数を扱うための準備
		Random randomNumber = new Random();
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
		int[] secondNumber = new int[firstNumber];
		//thirdNumberの値を0で初期化
		int thirdNumber = 0;
		/*
		 * fourNumberの値を1で初期化
		 * fourNumberの値がsecondNumberの値より小さい場合
		 * fourNumberrの値を1ずつ増加させる
		 */
		for (int fourNumber = 0; fourNumber < secondNumber.length; fourNumber++) {
			//fourNumberの値が0と等しい場合
			if (fourNumber == 0) {
				//randomNumber.nextInt(SECOND_VALUE) + FIRST_VALUEの乱数をthirdNumberに代入する
				thirdNumber = randomNumber.nextInt(SECOND_VALUE) + FIRST_VALUE;
				//thirdNumberの値をsecondNumber[fourNumber]に代入する
				secondNumber[fourNumber] = thirdNumber;
				
			} 
			//fourNumberの値が0より大きい場合
			else if (fourNumber > 0) {
				//doからwhileまで一度行う
				do {
					//randomNumber.nextInt(SECOND_VALUE) + FIRST_VALUEの乱数をthirdNumberに代入する
					thirdNumber = randomNumber.nextInt(SECOND_VALUE) + FIRST_VALUE;
					//thirdNumberの値をsecondNumber[fourNumber]に代入する
					secondNumber[fourNumber] = thirdNumber;
				//secondNumber[fourNumber]の値がsecondNumber[fourNumber - 1]の値と等しい場合	
				} while (secondNumber[fourNumber] == secondNumber[fourNumber - 1]);
			}
		}
		/*
		 * fourNumberの値を0初期化
		 * fourNumberの値がfirstNumberの値より小さい場合
		 * fourNumberの値を1ずつ増加させる
		 */
		for (int fourNumber = 0; fourNumber < firstNumber; fourNumber++)
			//("secondNumber[" + fourNumber + "] = " + secondNumber[fourNumber])と出力する
			System.out.println("secondNumber[" + fourNumber + "] = " + secondNumber[fourNumber]);

	}
}
