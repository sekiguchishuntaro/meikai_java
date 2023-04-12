package ensyu3_16;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：Ensyu3_16
* 概要：演習3_16クラス
* 作成者：関口駿太郎
* 作成日：2023.04.11
*/

public class Ensyu3_16 {

	/*
	 * 関数名：main
	 * メソッドの説明：三つの整数値を読み込んで昇順にソートするプログラム
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

		//キーボードで打ちこんだ値を読み込むための準備段階であり、整数thirdNumberを出力する
		System.out.print("整数thirdNumber:");

		//キーボードで打ちこんだ整数thirdNumberを出力するため、値を取り込む
		int thirdNumber = standardInput.nextInt();

		//firstNumberがsecondNumberより大きい場合、二値の交換を行う
		if (firstNumber > secondNumber) {

			//firstNumberの値をascendingOrderに保存しておく
			int ascendingOrder = firstNumber;

			//secondNumberの値をfirstNumberに代入する
			firstNumber = secondNumber;

			//ascendingOrderに保存しておいた最初のfirstNumberの値をsecondNumberに代入する
			secondNumber = ascendingOrder;
		}

		//secondNumberがthirdNumberより大きい場合、二値の交換を行う
		if (secondNumber > thirdNumber) {

			//secondNumberの値をascendingOrderに保存しておく
			int ascendingOrder = secondNumber;

			//thirdNumberの値をsecondNumberに代入する
			secondNumber = thirdNumber;

			//ascendingOrderに保存しておいた最初のsecondNumberの値をthirdNumberに代入する
			thirdNumber = ascendingOrder;

		}

		//firstNumberがsecondNumberより大きい場合、二値の交換を行う
		if (firstNumber > secondNumber) {

			//firstNumberの値をascendingOrderに保存しておく
			int ascendingOrder = firstNumber;

			//secondNumberの値をfirstNumberに代入する
			firstNumber = secondNumber;

			//ascendingOrderに保存しておいた最初のfirstNumberの値をsecondNumberに代入する
			secondNumber = ascendingOrder;
		}
		//firstNumberとsecondNumberとthirdNumber値の交換ができたら、（firstNumber ≦　secondNumber ≦　thirdNumberとなるようにソートしました。）と出力する
		System.out.println("firstNumber ≦　secondNumber ≦ thirdNumberとなるようにソートしました。");

		//値の交換ができれば、一番小さいほうfirstNumberとして出力する
		System.out.println("整数firstNumberは" + firstNumber + "です。");

		//値の交換ができれば、二番目に小さいほうsecondNumberとして出力する
		System.out.println("整数secondNumberは" + secondNumber + "です。");

		//値の交換ができれば、三番目に小さいほうthirdNumberとして出力する
		System.out.println("整数thirdNumberは" + thirdNumber + "です。");
	}

}
