package ensyu3_13;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：Ensyu3_13
* 概要：演習3_13クラス
* 作成者：関口駿太郎
* 作成日：2023.04.11
*/

public class Ensyu3_13 {

	/*
	 * 関数名：main
	 * メソッドの説明：キーボードから読み込んだ三つの整数値の中央値を求めて表示するプログラム
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

		//中央値を指すmedianNumberを作成および宣言
		int medianNumber =0;

		//中央値を出すためfirstNumberがsecondNumberより大きい、もしくは等しいことを示す
		if (firstNumber >= secondNumber)

			//中央値を出すためsecondNumberがthirdNumberより大きい、もしくは等しいことを示す
			if (secondNumber >= thirdNumber)

				//結果この場合の中央値はsecondNumberとなる
				medianNumber = secondNumber;

			//中央値を出すためfirstNumberがthirdNumberより小さい、もしくは等しいことを示す
			else if (firstNumber <= thirdNumber)

				//結果この場合中央値はfirstNumberとなる
				medianNumber = firstNumber;

			//firstNumberとsecondNumberが中央値以外の場合
			else

				//firstNumberとsecondNumberが中央値以外の場合はthirdNumberが中央値となる
				medianNumber = thirdNumber;

		//firstNumberがthirdNumberより大きい場合を示す
		else if (firstNumber > thirdNumber)

			//firstNumberがthirdNumberより大きい場合、順番に並べるとfirstNumberが中央値となる
			medianNumber = firstNumber;

		//secondNumberがthirdNumberより大きい場合を示す
		else if (secondNumber > thirdNumber)

			//secondNumberがthirdNumberより大きい場合、順番に並べるとthirdNumberが中央値となる
			medianNumber = thirdNumber;

		//firstNumberとthirdNumberが中央値ではない場合
		else

			//firstNumberとthirdNumberが中央値ではない場合、残ったthirdNumberが中央値となる
			medianNumber = secondNumber;

		//値を入力したときに6つの結果と照らし合わせ中央値をだし、（中央値は" + medianNumber + です。）と出力する
		System.out.println("中央値は" + medianNumber + "です。");

	}
}
