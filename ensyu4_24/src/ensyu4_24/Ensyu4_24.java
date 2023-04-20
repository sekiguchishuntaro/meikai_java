package ensyu4_24;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：ensyu4_24
* 概要：演習4_24クラス
* 作成者：関口駿太郎
* 作成日：2023.04.19
*/


public class Ensyu4_24 {
	
	/*
	 * 関数名：main
	 * メソッドの説明：正の整数値を読み込み、それが素数であるかどうかを判定するプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.19
	 */
	public static void main(String[] args) {
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//firstNumberの値を0で初期化
		int firstNumber = 0;
		
			//("正の整数値:")を出力する
			System.out.print ("2以上の整数値:");
			//firstNumberに代入された値を読み込む
			firstNumber = standardInput.nextInt();

		
		//firstNumberが2より小さいか判断
		if (firstNumber < 2) {
			//("2以下のため素数ではありません。")と出力する
			System.out.print ("2以下のため素数ではありません。");
		}
		/*
		 * secondNumberの値を2で初期化
		 * secondNumberの値がfirstNumberより小さいか等しい場合
		 * secondNumberの値を1ずつ増加させる
		 */
		for (int secondNumber = 2; secondNumber <= firstNumber; secondNumber ++) {
			//secondNumberの値がfirstNumberの値と等しい場合
			if (firstNumber == secondNumber) {
				//(firstNumber +"は素数です。")と出力する
				System.out.println (firstNumber +"は素数です。");

			}
			//割り切れた場合
			else if (firstNumber % secondNumber == 0) {
				//("それは素数ではありません。")と出力する
				System.out.println (firstNumber +"は素数ではありません。");
				//for文を抜け出す
				break;
			}
		}
	
	}
}

