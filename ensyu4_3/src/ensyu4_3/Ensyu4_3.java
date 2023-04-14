package ensyu4_3;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
 * クラス名：Ensyu4_3
 * 概要：演習4_3クラス
 * 作成者：関口駿太郎
 * 作成日：2023.04.12
 */

public class Ensyu4_3 {

	/*
	 * 関数名：main
	 * メソッドの説明：二つ整数値を読み込んで、小さい数以上大きい数以下の全整数を小さい順から表示するプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.12
	 */

	public static void main(String[] args) {
		//キーボードで打ちこんだ値を出力するために値を取り込む
		Scanner standardInput = new Scanner(System.in);
		//整数firstNumberを出力する
		System.out.print("整数firstNumber:");
		//firstNumberに代入する値を取り込む
		int firstNumber = standardInput.nextInt();
		//整数secondNumberを出力する
		System.out.print("整数secondNumber:");
		//secondNumberに代入する値を取り込む
		int secondNumber = standardInput.nextInt();

		//firstNumberの値がsecondNumberの値より小さい場合
		if (firstNumber > secondNumber) {
			//firstNumberの値をthirdNumberに保存する
			int thirdNumber = firstNumber;
			//secondNumberの値をfirstNumberに代入する
			firstNumber = secondNumber;
			//thirdNumberに保存していた値をsecondnumberに代入する
			secondNumber = thirdNumber;
		}
		//doからwhileまでを一度実行
		do {
			//firstNumberを出力する
			System.out.print(firstNumber + " ");
			//繰り返すごとにfirstNumberの値が＋1される
			firstNumber = firstNumber + 1;
		}
		//firstNumber <= secondNumberとなった場合に繰り返される
		while (firstNumber <= secondNumber);
		//繰り返し行ったことででた値が出力される
		System.out.println ();

	}

}
