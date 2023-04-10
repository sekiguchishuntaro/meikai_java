package ensyu3_6;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：ensyu3_6
* 概要：演習3_6クラス
* 作成者：関口駿太郎
* 作成日：2023.04.10
*/

public class ensyu3_6 {

	/*
	 * 関数名：main
	 * メソッドの説明：10の倍数かどうか、正ではない値を入力した場合
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

		//firstNumberが0より大きい場合
		if (firstNumber > 0)

			//firstNumberを10で割った時、割り切れるか割り切れないかを判断
			if (firstNumber % 10 == 0)

				//割り切れた場合（その値は10の倍数です。）と出力する
				System.out.println("その値は10の倍数です。");
			//割り切れない場合
			else

				//割り切れない場合は、（その値は10の倍数ではありません。）と出力する
				System.out.println("その値は10の倍数ではありません。");

		//正以外の値が入力された場合
		else

			//正以外の値が入力された場合、（正でない値が入力されました。）と出力する
			System.out.println("正でない値が入力されました。");

	}

}
