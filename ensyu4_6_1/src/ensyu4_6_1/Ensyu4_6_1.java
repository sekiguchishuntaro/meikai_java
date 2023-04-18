package ensyu4_6_1;
//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：Ensyu4_6_1
* 概要：演習4_6_1クラス
* 作成者：関口駿太郎
* 作成日：2023.04.13
*/

public class Ensyu4_6_1 {
	
	/*
	 * 関数名：main
	 * メソッドの説明：読み込んだ値が1未満であれば改行文字を出力しないプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.13
	 */
	public static void main(String[] args) {
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//（何個表示*を表示しますか）と出力
		System.out.print("何個*を表示しますか:");
		//キーボードで打ちこんだ整数firstNumberを出力するため、値を取り込む
		int firstNumber = standardInput.nextInt();
		//secondNumberの値を1で初期化
		int secondNumber = 1;
		//firstNumberが0より小さいか等しい場合
		if (firstNumber <= 0) {
			//("範囲外の値です")と出力する
			System.out.print("範囲外の値です");
		}
		//secondNumberがfirstNumberより小さいか等しい場合
		while (secondNumber <= firstNumber) {
			
			//*を出力する
			System.out.print("*");
			//secondNumberの値を+1ずつ増やしていく
			secondNumber++;
			
			}
		//firstNumberが0より大きい場合
		if (firstNumber >= 1) {
		//結果を出力する
		System.out.println ();
		}
	}
}
