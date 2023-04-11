package ensyu3_12;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：Ensyu3_12
* 概要：演習3_12クラス
* 作成者：関口駿太郎
* 作成日：2023.04.11
*/

public class Ensyu3_12 {
	/*
	 * 関数名：main
	 * メソッドの説明：キーボードから読み込んだ三つの整数値の最小値を求めて表示するプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.11
	 */

	public static void main(String[] args) {
		
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		
		//キーボードで打ちこんだ値を読み込むための準備段階であり、整数firstNumberを出力する
		System.out.print("整数firstNumber:");
		
		//キーボードで打ちこんだ整数firstNumberを出力するため、値を取り込む
		int firstNumber = standardInput.nextInt ();
		
		//キーボードで打ちこんだ値を読み込むための準備段階であり、整数secondNumberを出力する
		System.out.print("整数secondNumber:");
		
		//キーボードで打ちこんだ整数secondNumberを出力するため、値を取り込む
		int secondNumber = standardInput.nextInt ();
		
		//キーボードで打ちこんだ値を読み込むための準備段階であり、整数thirdNumberを出力する
		System.out.print("整数thirdNumber:");
		
		//キーボードで打ちこんだ整数thirdNumberを出力するため、値を取り込む
		int thirdNumber = standardInput.nextInt ();
		
		//仮にminimumNumberの値を出すためminimumNumber = firstNumberとする
		int minimumNumber = firstNumber;
		
		//secondNumberがminimumNumberより小さい値であれば、それが最小値となる
		if (secondNumber < minimumNumber) minimumNumber = secondNumber;
		
		//thirdNumberがminimumNumberより小さい値であれば、それが最小値となる
		if (thirdNumber < minimumNumber) minimumNumber =thirdNumber;
		
		//3つの整数値の値を読み込み結果一番値の小さいものが、minimumNumberとして（最小値は" + minimumNumber + "です。）と出力する
		System.out.println ("最小値は" + minimumNumber + "です。");
		


		
		
	}
}
