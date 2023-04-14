package ensyu4_1;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;
/*
 * クラス名：Ensyu4_1 
 * 概要：演習4_1クラス
 * 作成者：関口駿太郎
 * 作成日：2023.04.12
 */

public class Ensyu4_1 {

	/*
	 * 関数名：main
	 * メソッドの説明：読み込んだ整数値の符号を判定するプログラムを好きなだけ何度でも繰り返して入力・表示できるプログラム
	 * 引数：なし
	 * 返り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.12
	 */

	public static void main(String[] args) {

		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);

		//retryNumberを0で初期化
		int retryNumber = 0;

		//doからwhileまでのmainメソッドを一度実行する
		do {
			//キーボードで打ちこんだ値を読み込むための準備段階であり、整数値を出力する
			System.out.print("整数値:");

			//キーボードで打ちこんだ整数firstNumberを出力するため、値を取り込む
			int firstNumber = standardInput.nextInt();

			//firstNumberが0より大きい場合の判断
			if (firstNumber > 0) {

				//firstNumberの値が0より大きい場合は（その値は正です。）と出力する
				System.out.println("その値は正です。");
			//firstNumberの値が0より小さい場合の判断
			} else if (firstNumber < 0) {
				//firstNumberの値が0より小さい場合は（その値は負です）と出力する
				System.out.println("その値は負です。");
			//firstNumberの値が0より大きくも小さくもない場合
			} else {
				//firstNumberの値が0より大きくも小さくもない場合は（その値は0です）と出力する
				System.out.println("その値は0です。");
			}//繰り返し入力・表示するか、しないかを判断させる
			System.out.print("もう一度？ 1…Yes/ 0…No:");
			//retryNumberに入る値を読み込む
			retryNumber = standardInput.nextInt();
			//retryNumberが1以上0未満の場合
			if (retryNumber > 1 || retryNumber < 0) {
				//retryNumberが1以上0未満の場合は（範囲以外の値と出力する
				System.out.println("範囲外の値");
				}
			
			//1が入力されtrueなら繰り返し行われる
			} while (retryNumber == 1);
			

	}
}
