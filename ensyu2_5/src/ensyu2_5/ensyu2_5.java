package ensyu2_5;

import java.util.Scanner;
/*
 * クラス名：ensyu2_5
 * 概要：演習2_5クラス
 * 作成者：関口駿太郎
 * 作成日：2023.04.06
 */

public class ensyu2_5 {
	/*
	 * 関数名：main
	 * メソッドの説明：二つの実数値を読み込み、その和と平均を求めて表示するプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.06
	 */

	public static void main(String[] args) {

		//キーボードで入力したものを促す
		Scanner standardInput = new Scanner(System.in);

		//firstNumberの値の入力を促す
		System.out.print("firstNumberの値:");

		//firstNumberの実数値を読み込む
		double firstNumber = standardInput.nextDouble();

		//secondNumberの値の入力を促す
		System.out.print("secondNumberの値:");

		//secondNumberの実数値を読み込む
		double secondNumber = standardInput.nextDouble();

		//firstNumberとsecondNumberの合計を表示する
		System.out.println("合計は" + (firstNumber + secondNumber) + "です。");

		//firstNumberとsecondNumberの平均を表示する
		System.out.println("平均は" + (firstNumber + secondNumber) / 2 + "です。");		
		
		
		
		
	}

}
