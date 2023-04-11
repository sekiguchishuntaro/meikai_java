package ensyu3_10;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
 * クラス名：Ensyu3_10
 * 概要：演習3_10クラス
 * 作成者：関口駿太郎
 * 作成日：2023.04.11
 */

public class Ensyu3_10 {

	/*
	 * 関数名：main
	 * メソッドの説明：二つの整数値を読み込んで、それらの値の差を表示するプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.11
	 */
	public static void main(String[] args) {

		//キーボードで入力したものを表示させるために促す
		Scanner standardInput = new Scanner(System.in);

		//キーボードで打ちこんだ値を読み込むための準備段階であり、整数値firstNumberを出力する
		System.out.print("整数値firstNumber:");

		//キーボードで打ちこんだ整数値firstNumberを出力するため、値を取り込む
		int firstNumber = standardInput.nextInt();

		//キーボードで打ちこんだ値を読み込むための準備段階であり、整数値secondNumberを出力する
		System.out.print("整数値secondNumber:");

		//キーボードで打ちこんだ整数値secondNumberを出力するため、値を取り込む
		int secondNumber = standardInput.nextInt();

		//整数値の値の差を出すための宣言
		int valueDifference;

		//値の差を出すため、絶対値を出す演算子を使う
		if (firstNumber >= secondNumber)

			//firstNumberをsecondNumberで引いた数が絶対値になるため、firstNumber - secondNumberを使い値の差を出す
			valueDifference = firstNumber - secondNumber;
		
		//firstNumber - secondNumber以外の場合も考える
		else
			//secondNumberをfirstNumberで引いた場合も考え、secondNumber - firstNumberを使い値の差を出す。
			valueDifference = secondNumber - firstNumber;
		
		//値の差を出し、結果として（それらの差は" + valueDifference + "です。）と出力する
		System.out.println("それらの差は" + valueDifference + "です。");

	}
}
