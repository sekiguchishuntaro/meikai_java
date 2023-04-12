package ensyu3_14;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：Ensyu3_14
* 概要：演習3_14クラス
* 作成者：関口駿太郎
* 作成日：2023.04.11
*/

public class Ensyu3_14 {

	/*
	 * 関数名：main
	 * メソッドの説明：二つの整数値を読み込んで、小さいほうと大きいほうの値を表示し、等しい場合も表示するプログラム
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

		//二つの整数値が等しい場合を示す
		if (firstNumber == secondNumber) {

			//二つの整数値を入力したときに値が等しい場合、（二つの値は同じです。）と出力する
			System.out.println("二つの値は同じです。");
		//小さいほうの値と大きいほうの値を両方出すための判断を行う
		} else {
			//minimumNumber, bigNumberの値をそれぞれ求めるため宣言
			int minimumNumber, bigNumber = 0;

			//firstNumberがsecondNumberより値が小さいか判断
			if (firstNumber < secondNumber) {

				//firstNumberの値が小さければ、minimumNumberとなる
				minimumNumber = firstNumber;

				//secondNumberの値が大きいのであれば、bigNumberとなる
				bigNumber = secondNumber;
				}
				 
			//firstNumberの値が大きく、secondNumberの値が小さい場合も判断する
			else {

				//firstNumberの値が大きく、secondNumberの値が小さい場合、secondNumberがminimumNumberとして判断される
				minimumNumber = secondNumber;

				//firstNumberの値が大きく、secondNumberの値が小さい場合、firstNumberがbigNumberとして判断される
				bigNumber = firstNumber;
			}

			//minimumNumberを求めた結果firstNumberかsecondNumberの値が小さいほうの整数値が出力される
			System.out.println("小さいほうの値は" + minimumNumber + "です。");

			//bigNumberを求めた結果firstNumberかsecondNumberの値が大きいほうの整数値が出力される
			System.out.println("大きいほうの値は" + bigNumber + "です。");

		}

	}
}
