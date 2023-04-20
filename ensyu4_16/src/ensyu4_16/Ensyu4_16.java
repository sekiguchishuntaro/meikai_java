package ensyu4_16;
//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：ensyu4_16
* 概要：演習4_16クラス
* 作成者：関口駿太郎
* 作成日：2023.04.18
*/


public class Ensyu4_16 {
	
	/*
	 * 関数名：main
	 * メソッドの説明：読み込んだ個数だけ*を表示し、5個表示するごとに改行
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.18
	 */
	public static void main(String[] args) {
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//("何個*を表示しますか：")と出力する
		System.out.print ("何個*を表示しますか：");
		//firstNumberに代入された値を読み込む
		int firstNumber = standardInput.nextInt ();
		//firstNumberの値が0より小さいか等しい場合
		if (firstNumber <= 0)
			//("範囲外の値")と出力する
			System.out.print ("範囲外の値");
		//secondNumberの値を0で初期化、secondNumberがfirstNumberの値より小さい場合、secondNumberの値を1ずつ増加させる
		for (int secondNumber = 0; secondNumber < firstNumber; secondNumber ++) {
			//("*")を出力する
			System.out.print ("*");
		//secondNumberを5で割った時に余りが４になるたびに改行
		if (secondNumber % 5 == 4) 
			//改行して出力する
			System.out.println ();
		}
	}
}
