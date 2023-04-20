package ensyu4_13;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：ensyu4_13
* 概要：演習4_13クラス
* 作成者：関口駿太郎
* 作成日：2023.04.17
*/

public class Ensyu4_13 {
	/*
	 * 関数名：main
	 * メソッドの説明：1からfirstNumberまでの和を求めるプログラムをfor文で行う
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
		//firstnumberの値を0で初期化
		int firstNumber = 0;
		//doからwhileまで一度実行する
		do {
			//（firstNumberの値：）と出力する
			System.out.print ("firstNumberの値：");
			//firstnumberに入る値を取り込む
			firstNumber = standardInput.nextInt();
		//firstNumberが0より小さいか等しい場合
		}while (firstNumber <= 0);
		
		//secondNumberに入る値を0で初期化
		int secondNumber = 0;
		//thirdNumberの値を1で初期化、thirdNumberがfirstNumberより小さいか等しい場合、thirdNumberの値が1ずつ増加する
		for (int thirdNumber = 1;thirdNumber <= firstNumber;thirdNumber ++)
		//secondNumberにthirdNumberを加える。
		secondNumber += thirdNumber;
		//結果（1から" + firstNumber +"までの和は" + secondNumber + "です。）と出力する
		System.out.println ("1から" + firstNumber +"までの和は" + secondNumber + "です。");
	
		
		
		

	}
}
