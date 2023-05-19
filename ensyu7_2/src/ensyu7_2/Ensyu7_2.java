package ensyu7_2;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：Ensyu7_2
* 概要：演習7_2クラス
* 作成者：関口駿太郎
* 作成日：2023.04.27
*/

public class Ensyu7_2 {
	/*
	 * 関数名：min
	 * メソッドの説明：三つのint型引数a,b,cの最小値を求めるメソッドminを作成
	 * 引数：a,b,c
	 * 返り値：minimumNumber
	 * パラメーターの説明：関数内で定義したa,b,cという仮引数、値を受け取る
	 * 概要：教本の指示に従い、仮引数をa,b,cのまま行った
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.27
	 */

	static int min (int a, int b, int c) {
		//minimumNumberの値をaで初期化
		int minimumNumber = a;
		//bの値がminimumNumberの値より小さい場合
		if (b < minimumNumber) {
			//minimumNumberの値にbを代入
			minimumNumber = b;
		}
		//cの値がminimumNumberの値より小さい場合
		if (c < minimumNumber) {
			//minimumNumberの値にcを代入
			minimumNumber = c;
		}
		//minimumNumberの値を返す
		return minimumNumber;
	

	}
	/*
	 * 関数名：main
	 * メソッドの説明：三つのint型引数a,b,cの最小値を求めるメソッドminを作成
	 * 引数：args
	 * 返り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.27
	 */

	public static void main(String[] args) {
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//("整数a:")を出力する
		System.out.print ("整数 a:");
		//firstNumberに代入された値を読み込む
		int firstNumber =  standardInput.nextInt ();
		//("整数 b:")を出力する
		System.out.print ("整数 b:");
		//secondNumberに代入された値を読み込む
		int secondNumber =  standardInput.nextInt ();
		//("整数 c:")を出力する
		System.out.print ("整数 c:");
		//thirdNumberに代入された値を読み込む
		int thirdNumber =  standardInput.nextInt ();
		//("最小値は" + min (firstNumber,secondNumber,thirdNumber) + "です。")と出力する
		System.out.println ("最小値は" + min (firstNumber,secondNumber,thirdNumber) + "です。");
	}
}
