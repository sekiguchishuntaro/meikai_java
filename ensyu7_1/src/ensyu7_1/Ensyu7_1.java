package ensyu7_1;
//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：Ensyu7_1
* 概要：演習7_1クラス
* 作成者：関口駿太郎
* 作成日：2023.04.27
*/

public class Ensyu7_1 {
	/*
	 * 関数名：sign0f
	 * メソッドの説明：受け取ったint型の引数の値が負の場合－1、0の場合0、正の場合1を返却するメソッド
	 * 引数：n
	 * 返り値：signNumber
	 * パラメーターの説明：関数内で定義したnという仮引数、値を受け取る
	 * 概要：教本の指示に従い、仮引数をnのまま行った
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.27
	 */

	static int sign0f (int n) {
		//signNumberの値を0で初期化
		int signNumber = 0;
		//firstNumberの値が0より大きい場合
		if (n > 0) {
			//signNumberの値が1とする
			signNumber = 1;
		}
		//firstNumberの値が0より小さい場合
		if (n < 0) {
			//signNumberの値が-1とする
			signNumber = -1;
		}
		//signNumberの値を返す
		return signNumber;
		
			
	}
	/*
	 * 関数名：main
	 * メソッドの説明：受け取ったint型の引数の値が負の場合－1、0の場合0、正の場合1を返却するメソッド
	 * 引数：args
	 * 返り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.27
	 */

	public static void main(String[] args) {
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//("整数secondNumber:")を出力する
		System.out.print ("整数secondNumber:");
		//secondNumberに代入された値を読み込む
		int secondNumber = standardInput.nextInt ();
		//thirdNumberにsign0f(secondNumber)を代入
		int thirdNumber = sign0f(secondNumber);
		//("sign0f(secondNumber)は" + thirdNumber + "です。")と出力する
		System.out.println ("sign0f(secondNumber)は" + thirdNumber + "です。");

	}
}
