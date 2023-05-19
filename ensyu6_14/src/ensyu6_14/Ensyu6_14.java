package ensyu6_14;

//ランダムで値を生成する準備
import java.util.Random;
//キーボードから値や文字を入力するための準備
import java.util.Scanner;
/*
* クラス名：Ensyu6_14
* 概要：演習6_14クラス
* 作成者：関口駿太郎
* 作成日：2023.04.25
*/

public class Ensyu6_14 {
	/*
	 * 関数名：main
	 * メソッドの説明：月を1～12の数値として表示して、その英語表現を入力させる英単語学習プログラム
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
		//FIRST_VALUEの値を12で初期化
		final int FIRST_VALUE = 12;
		//SECOND_VALUEの値を1で初期化
		final int SECOND_VALUE = 1;
		//英語の月名を表す
		String[] monthString = {

				"January", "February", "March", "April", "May", "June", "July",

				"August", "September", "October", "November", "December"

		};
		//("英語の月名を入力してください。")を出力する
		System.out.println("英語の月名を入力してください。");
		//("なお、先頭は大文字で、2文字目以降は小文字とします。")を出力する
		System.out.println("なお、先頭は大文字で、2文字目以降は小文字とします。");
		//retryNumberの値を0で初期化
		int retryNumber = 0;
		//lastMonthの値を－1で初期化
		int lastMonth = -1;
		//monthNumberの値を0で初期化
		int monthNumber = 0;
		//doからwhileまで一度実行
		do {
			//0から11の乱数を生成
			monthNumber = randomNumber.nextInt(FIRST_VALUE);
			//monthNumberの値がlastMonthの値と等しい場合
			while (monthNumber == lastMonth);
			//lastMonthにmonthNumberを代入する
			lastMonth = monthNumber;
			//trueであった場合
			while (true) {
				//((monthNumber + SECOND_VALUE) + "月：")を出力する
				System.out.print((monthNumber + SECOND_VALUE) + "月：");
				//firstNumberに代入される値を読み込む
				String firstNumber = standardInput.next();
				//文字列がmonthString[monthNumber]と等しい場合
				if (firstNumber.equals(monthString[monthNumber]))
					//for文を抜け出す
					break;
				//("違います。")と出力する
				System.out.println("違います。");

			}
			//("正解です。もう一度？ 1…Yes / 0…No:")と出力する
			System.out.print("正解です。もう一度？ 1…Yes / 0…No:");
			//retryNumberに代入された値を読み込む
			retryNumber = standardInput.nextInt();
		//retryNumberの値が1と等しい場合、繰り返し行う
		}while (retryNumber == 1);

	}
}
