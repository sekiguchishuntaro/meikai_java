package ensyu6_12;

//ランダムで値を生成する準備
import java.util.Random;
//キーボードから値や文字を入力するための準備
import java.util.Scanner;
/*
* クラス名：Ensyu6_12
* 概要：演習6_12クラス
* 作成者：関口駿太郎
* 作成日：2023.04.25
*/


public class Ensyu6_12 {
	/*
	 * 関数名：main
	 * メソッドの説明：配列の要素の並びをシャッフルするプログラム
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
		//firstNumberの値を0で初期化する
		int firstNumber = 0;
		//doからwhileまで一度実行
		do {
		//("要素数:")を出力する	
		System.out.print("要素数:");
		//firstNumberに代入された値を読み込む
		firstNumber = standardInput.nextInt();
		//firstNumberの値が0より小さいか等しい場合に繰り返し行う
		}while (firstNumber <= 0);
		//配列の生成
		int [] secondNumber = new int[firstNumber];
		/*
		 * thirdNumberの値を0で初期化
		 * thirdNumberの値がfirstNumberの値より小さい場合
		 * thirdNumberの値を1ずつ増加させる
		 */
		for (int thirdNumber = 0; thirdNumber < firstNumber; thirdNumber ++) {
			//("secondNumber[" + thirdNumber + "] = ")を出力する
			System.out.print ("secondNumber[" + thirdNumber + "] = ");
			//secondNumber [thirdNumber]に代入された値を読み込む
			secondNumber [thirdNumber] = standardInput.nextInt ();
			 
		}
		/*
		 * thirdNumberの値を0で初期化
		 * thirdNumberの値がfirstNumberの値より小さい場合
		 * thirdNumberの値を1ずつ増加させる
		 */
		for (int thirdNumber = 0; thirdNumber < firstNumber; thirdNumber ++ ) {
			//thirdNumber1にrandomNumber.nextInt (firstNumber)を代入
			int thirdNumber1 =randomNumber.nextInt (firstNumber);
			//thirdNumber2にrandomNumber.nextInt (firstNumber)を代入
			int thirdNumber2 =randomNumber.nextInt (firstNumber);
			//fourNumberにsecondNumber[thirdNumber1]を代入
			int fourNumber = secondNumber[thirdNumber1];
			//secondNumber[thirdNumber1]にsecondNumber[thirdNumber2]代入
			secondNumber[thirdNumber1] = secondNumber[thirdNumber2];
			//secondNumber[thirdNumber2]にfourNumberを代入
			secondNumber[thirdNumber2] = fourNumber;
			

		}
		//("要素をかき混ぜました。")と出力する
		System.out.println ("要素をかき混ぜました。");
		/*
		 * thirdNumberの値を0で初期化
		 * thirdNumberの値がfirstNumberの値より小さい場合
		 * thirdNumberの値を1ずつ増加させる
		 */
		for (int thirdNumber = 0; thirdNumber < firstNumber; thirdNumber ++)
			//("secondNumber[" + thirdNumber + "] = " + secondNumber[thirdNumber])を出力する
			System.out.println ("secondNumber[" + thirdNumber + "] = " + secondNumber[thirdNumber]);



	}
}
