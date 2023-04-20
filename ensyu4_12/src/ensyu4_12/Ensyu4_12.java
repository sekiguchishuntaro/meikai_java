package ensyu4_12;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
 * クラス名：Ensyu4_12
 * 概要：演習4_12クラス
 * 作成者：関口駿太郎
 * 作成日：2023.04.17
 */


public class Ensyu4_12 {
	/*
	 * 関数名：main
	 * メソッドの説明：0から整数値をカウントアップするプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.17
	 */
	public static void main(String[] args) {
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//（カウントアップします。）と出力する
		System.out.println ("カウントアップします。");
		//firstNumberを0で初期化する
		int firstNumber = 0;
		//doからwhileまで一度実行する
		do {
			//（正の整数値：）を出力する
			System.out.print ("正の整数値：");
			//firstNumberに入る値を読み込む
			firstNumber = standardInput.nextInt ();
			
		}//firstNumberが0より小さいか等しい場合
		while (firstNumber <= 0);
			//secondNumberを0で初期化。secondNumberがfirstNumberより小さいか等しい場合。secondNumberの値が1ずつ増加する
			for (int secondNumber = 0;secondNumber <= firstNumber;secondNumber ++)
				//(SecondNumber)を出力する
				System.out.println (secondNumber);
			
				
		
	}
}
