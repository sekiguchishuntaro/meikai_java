package ensyu3_11;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：Ensyu3_11
* 概要：演習3_11クラス
* 作成者：関口駿太郎
* 作成日：2023.04.11
*/

public class Ensyu3_11 {

	/*
	 * 関数名：main
	 * メソッドの説明：二つの整数値を読込み、10以下の値である時とそうでない時を表示するプログラム
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
		int firstNumber = standardInput.nextInt();

		//キーボードで打ちこんだ値を読み込むための準備段階であり、整数secondNumberを出力する
		System.out.print("整数secondNumber:");

		//キーボードで打ちこんだ整数secondNumberを出力するため、値を取り込む
		int secondNumber = standardInput.nextInt();

		//値の差を出すため絶対値をだせる演算子を使い、firstNumberからsecondNumberを引いた値と、secondNumberからfirstNumberを引いた値を出す
		int valueDifference = firstNumber >= secondNumber ? firstNumber - secondNumber : secondNumber - firstNumber;

		//それぞれ引いた値が差となり、その値が10以下なのか11以上なのか判断し出力する
		System.out.println("それらの差は" + (valueDifference <= 10 ? "10以下" : "11以上") + "です。");

	}
}
