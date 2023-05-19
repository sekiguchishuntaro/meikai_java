package ensyu7_3;
//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：Ensyu7_3
* 概要：演習7_3クラス
* 作成者：関口駿太郎
* 作成日：2023.04.27
*/


public class Ensyu7_3 {
	/*
	 * 関数名：med
	 * メソッドの説明：三つのint型引数a,b,cの中央値を求めるメソッドmedを作成
	 * 引数：a,b,c
	 * 返り値：a.b.c
	 * パラメーターの説明：関数内で定義したa,b,cという仮引数、値を受け取る
	 * 概要；教本の指示に従い、仮引数をa,b,cのまま行った
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.27
	 */

	static int med (int a, int b, int c) {
		//aの値がbの値より大きいか等しい場合
		if (a >= b)
			//bの値がcの値より大きいか等しい場合
			if (b >= c)
				//bの値を返す
				return b;
			//aの値がcより小さいか等しい場合
			else if (a <= c)
				//aの値を返す
				return a;
			//上記以外の場合
			else
				//cの値を返す
				return c;
		//aの値がcより大きい場合
		else if (a > c)
			//aの値を返す
			return a;
		//bの値がcの値より大きい場合
		else if (b > c)
			//cの値を返す
			return c;
		//上記以外の場合
		else
			//bの値を返す
			return b;
		
	}
	/*
	 * 関数名：main
	 * メソッドの説明：三つのint型引数a,b,cの中央値を求めるメソッドmedを作成
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
		//("最小値は" + min (a,b,c) + "です。")と出力する
		System.out.println ("中央値は" + med (firstNumber,secondNumber,thirdNumber) + "です。");

	}
}
