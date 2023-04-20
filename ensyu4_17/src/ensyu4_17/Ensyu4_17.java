package ensyu4_17;
//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：ensyu4_17
* 概要：演習4_17クラス
* 作成者：関口駿太郎
* 作成日：2023.04.18
*/

public class Ensyu4_17 {
	
	/*
	 * 関数名：main
	 * メソッドの説明：読み込んだ整数値のすべての約数を表示し、約数の個数も表示するプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.18
	 */
	public static void main(String[] args) {
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//("整数値：")を出力する
		System.out.print ("整数値：");
		//firstNumberに代入された値を取り込む
		int firstNumber = standardInput.nextInt ();
		//firstNumberの値が0より大きい場合
		if (firstNumber > 0) {
			//空白で出力する
			System.out.print ("");
		}
		//firstNumberの値が0より小さいか等しい場合
		else if (firstNumber <= 0) {
			//("範囲外の値です。")と出力する
			System.out.print ("範囲外の値です。");
		}
		//secondnumberの値を0で初期化
		int secondNumber = 0;
		
		//thirdNumberの値を1で初期化、thirdNumberがfirstNumberより小さい場合、thirdNumberの値を1ずつ増加させる
		for (int thirdNumber = 1; thirdNumber <= firstNumber; thirdNumber ++) 
			//firstNumberをthirdNumberで割って余りが出ない場合
			if (firstNumber % thirdNumber == 0) {
				//(thirdNumber + " ")を出力する
				System.out.println (thirdNumber + " ");
				//割り切れるたびにsecondnumberの値を1ずつ増加させる
				secondNumber ++;
			}
		//(firstNumber + "の約数は" + secondNumber + "個です。")と出力する
		System.out.println ( "約数は" + secondNumber + "個です。");
		}
	}

