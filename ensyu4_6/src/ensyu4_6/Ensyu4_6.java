package ensyu4_6;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
 * クラス名：Ensyu4_6
 * 概要：演習4_6クラス
 * 作成者：関口駿太郎
 * 作成日：2023.04.13
 */

public class Ensyu4_6 {

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
		//firstNumberの値を0で初期化
		int firstNumber = 0;
		//doからwhileまで一度実行
		do {
			//（何個表示*を表示しますか）と出力
			System.out.print("何個*を表示しますか:");
			//firstNumberに入った値を取り込む
			firstNumber = standardInput.nextInt();	
		//firstNumberが0より小さい場合、繰り返し行わない
		}while (firstNumber <= 0);
		
		
		
		//secondNumberの値を0で初期化
		int secondNumber = 0;
		//secondNumberがfirstNumberより小さい場合
		while (secondNumber < firstNumber) {
			
			//*を出力する
			System.out.print("*");
			
			//secondNumberの値を+1ずつ増やしていく
			secondNumber++;
		}//firstNumberが0より大きい場合
		if (firstNumber >= 1) {
		//改行し出力する
		System.out.println ();

		}

	}		

}

