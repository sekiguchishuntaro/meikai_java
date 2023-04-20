package ensyu4_26;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：ensyu4_26
* 概要：演習4_26クラス
* 作成者：関口駿太郎
* 作成日：2023.04.20
*/


public class Ensyu4_26 {
	
	/*
	 * 関数名：main
	 * メソッドの説明：読み込んだ整数を加算し平均も求め、負の値は加算しないプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.20
	 */
	public static void main(String[] args) {
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//("整数を加算します。")と出力する
		System.out.println("整数を加算します。");
		//("何個加算しますか:")と出力する
		System.out.print("何個加算しますか:");
		//firstNumberに代入された値を読み込む
		int firstNumber = standardInput.nextInt();
		//sumNumberの値を0で初期化
		int sumNumber = 0;
		//countNumberの値を0で初期化
		int countNumber = 0;		
		/*
		 * secondNumberの値を0で初期化
		 * secondNumberがfirstNumberより小さい場合
		 * secondNumberの値を1ずつ増加させる
		 */
		for (int secondNumber = 0; secondNumber < firstNumber; secondNumber ++) {
			//("整数:")と出力する
			System.out.print ("整数:");
			//thirdNumberに代入された値を読み込む
			int thirdNumber = standardInput.nextInt ();
			//thirdNumberが0より小さい場合
			if (thirdNumber < 0) {
				//("負の数は加算しません。")と出力する
				System.out.println ("負の数は加算しません。");
				//for文の後ろに置かれている文をスキップする
				continue;
			}
			//sumNumberにthirdNumberの値を加える
			sumNumber += thirdNumber;
			//countNumberの値を1ずつ増加させる
			countNumber ++;			
			

		}
		//("合計は" + sumNumber + "です。")と出力する
		System.out.println ("合計は" + sumNumber + "です。");
		//firstNumberの値が0と等しくない場合
		if (firstNumber != 0) {
			//	("平均は" + sumNumber / countNumber +"です。")と出力する
			System.out.println("平均は" + sumNumber / countNumber + "です。");
		}

	}
}
