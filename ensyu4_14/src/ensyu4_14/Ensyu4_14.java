package ensyu4_14;
//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：ensyu4_14
* 概要：演習4_14クラス
* 作成者：関口駿太郎
* 作成日：2023.04.17
*/

public class Ensyu4_14 {
	/*
	 * 関数名：main
	 * メソッドの説明：1からfirstnumberまでの和を求め、式を表示するプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.17
	 */
	public static void main(String[] args) {
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//（1からfirstnumberまでの和を求めます。）と出力する
		System.out.println ("1からfirstNumberまでの和を求めます。");
		//firstNumberを0で初期化
		int firstNumber = 0;
		//doからwhileまで一度実行する
		do {
			//（firstNumberの値：）を出力
			System.out.print ("firstNumberの値:");
			//firstNumberに入った値を取り込む
			firstNumber = standardInput.nextInt ();
		//firstNumberが0より小さいか等しい場合
		}while (firstNumber <= 0);
		//secondNumberを0で初期化
		int secondNumber = 0;
		//thirdNumberを1で初期化、thirdNumberがfirstNumberより小さい場合、thirdNumberの値を1ずつ増加させる
		for (int thirdNumber = 1;thirdNumber < firstNumber;thirdNumber ++) {
			//(thirdNumber + "+")を出力する
			System.out.print (thirdNumber + "+");
			//secondNumberにthirdNumberを加える
			secondNumber += thirdNumber;
		}
			//(firstNumber + "=")を出力する
			System.out.print (firstNumber + "=");
			//secondNumberにfirstNumberを加える
			secondNumber += firstNumber;
			//（secondNumber）を出力する
			System.out.println (secondNumber);
			
		
		
		

	}
}
