package ensyu7_4;
//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：Ensyu7_4
* 概要：演習7_4クラス
* 作成者：関口駿太郎
* 作成日：2023.04.27
*/


public class Ensyu7_4 {
	/*
	 * 関数名：sumUp
	 * メソッドの説明：1からnまでの全整数の和を求めて返却するメソッド
	 * 引数：n
	 * 返り値：sumNumber
	 * パラメーターの説明：関数内で定義したnという仮引数、値を受け取る
	 * 概要；教本の指示に従い、仮引数をnのまま行った
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.27
	 */
	static int sumUp (int n) {
		//sumNumberの値を0で初期化
		int sumNumber = 0;
		/*
		 * firstNumberの値を1で初期化
		 * firstNumberの値がsumNumberの値より小さいか等しい場合
		 * firstNumberの値を1ずつ増加させる
		 */
		for (int firstNumber = 1; firstNumber <= n; firstNumber ++) 
			//sumNumberの値にfirstNumberの値を加える
			sumNumber += firstNumber;
		//sumNumberの値を返す
		return sumNumber;

	}
	/*
	 * 関数名：main
	 * メソッドの説明：1からnまでの全整数の和を求めるプログラム
	 * 引数：args
	 * 返り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.27
	 */

	public static void main(String[] args) {
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//("1からnまでの和を求めます。")と出力する
		System.out.println ("1からnまでの和を求めます。");
		//secondNumberの値を0で初期化
		int secondNumber = 0;
		//doからwhileまで一度実行
		do {
			//("secondNumberの値:")と出力する
			System.out.print ("secondNumberの値:");
			//secondNumberに代入された値を読み込む
			secondNumber = standardInput.nextInt ();
		//secondNumberの値が0より小さいか等しい場合に繰り返し行う
		}while (secondNumber <= 0);
		//("1から" + secondNumber + "までの和は" + sumUp (secondNumber) + "です。")と出力する
		System.out.println ("1から" + secondNumber + "までの和は" + sumUp (secondNumber) + "です。");
	
	}
}
