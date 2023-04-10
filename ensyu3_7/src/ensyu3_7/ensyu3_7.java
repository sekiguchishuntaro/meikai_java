package ensyu3_7;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：ensyu3_7
* 概要：演習3_7クラス
* 作成者：関口駿太郎
* 作成日：2023.04.10
*/

public class ensyu3_7 {

	/*
	 * 関数名：main
	 * メソッドの説明：3で割れた場合と割れなかった場合と正ではない値の場合
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.10
	 */

	public static void main(String[] args) {

		//キーボードで入力したものを表示させるために促す
		Scanner standardInput = new Scanner(System.in);

		//整数値を出力する
		System.out.print("整数値:");

		//キーボードで打ちこんだ整数をfirstNumberに読み込む
		int firstNumber = standardInput.nextInt();

		//firstNumberの値が0より大きい場合
		if (firstNumber > 0)

			//firstNumberを3で割った場合割り切れるか
			if (firstNumber % 3 == 0)

				//割り切れた場合は（その値は3で割り切れます。）と出力する
				System.out.println("その値は3で割り切れます。");

			//firstNumberを3で割った場合余りが1になるか判断
			else if (firstNumber % 3 == 1)

				//余りが1になった場合（その値を3で割った余りは1です。）と出力する
				System.out.println("その値を3で割った余りは1です。");

			//firstNumberを3で割った場合余りが2になるか判断
			else

				//余りが2になった場合（その値を3で割った余りは2です。）と出力する
				System.out.println("その値を3で割った余りは2です。");

		//正でない値を読み込んだ場合
		else

			//正でない値を読み込んだ場合（正でない値が入力されました。）と出力する
			System.out.println("正でない値が入力されました。");

	}

}
