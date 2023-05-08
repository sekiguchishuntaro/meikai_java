package ensyu5_2;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：Ensyu5_2
* 概要：演習5_2クラス
* 作成者：関口駿太郎
* 作成日：2023.04.20
*/

public class Ensyu5_2 {
	
	/*
	 * 関数名：main
	 * メソッドの説明：float型の変数とdouble型の変数に値を読み込んで表示するプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.20
	 */
	public static void main(String[] args) {
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//("変数firstNumberはfloat型で、変数secondNumberはdouble型です。")と出力する
		System.out.println ("変数firstNumberはfloat型で、変数secondNumberはdouble型です。");
		//("firstNumber:")と出力する
		System.out.print ("firstNumber:");
		//firstNumberに代入された値を読み込む
		float firstNumber = standardInput.nextFloat ();
		//("secondNumber:")と出力する
		System.out.print ("secondNumber:");
		//secondNumberに代入された値を読み込む
		double secondNumber = standardInput.nextDouble ();
		//("firstNumber =" + firstNumber)と出力する
		System.out.println ("firstNumber =" + firstNumber);
		//("secondNumber =" + secondNumber)と出力する
		System.out.println ("secondNumber =" + secondNumber);

		
		

	}
}
