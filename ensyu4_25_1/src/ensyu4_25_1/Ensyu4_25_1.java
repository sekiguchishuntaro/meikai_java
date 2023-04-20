package ensyu4_25_1;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：ensyu4_25_1
* 概要：演習4_25_1クラス
* 作成者：関口駿太郎
* 作成日：2023.04.20
*/

public class Ensyu4_25_1 {

	/*
	 * 関数名：main
	 * メソッドの説明：読み込んだ整数を加算するプログラムで平均も求めるプログラム(合計が1000を超えない範囲)
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
		//secondNumberの値を0で初期化
		int secondNumber = 0;
		/*
		 * secondNumberの値を0で初期化
		 * secondNumberの値がfirstNumberの値より小さい場合
		 * secondNumberの値を1ずつ増加させる
		 */
		for ( secondNumber = 0; secondNumber < firstNumber; secondNumber++) {
			//("整数:")と出力する
			System.out.print("整数: ");
			//thirdNumberに代入される値を読み込む
			int thirdNumber = standardInput.nextInt();
			//sumNumber + thirdNumberの値が1000より大きい場合
			if (sumNumber + thirdNumber > 1000) {
				//("合計が1000を超えました。")と出力する
				System.out.println ("合計が1000を超えました。");
				//("次からの数値は無視します。")と出力する
				System.out.println ("次からの数値は無視します。");
				//for文を抜け出す
				break;

			}
			//sumNumberの値にthirdNumberの値を加える
			sumNumber += thirdNumber;
			
		}
		//("合計は" + sumNumber + "です。")と出力する
		System.out.println ("合計は" + sumNumber + "です。");
		
		//firstNumberの値が0と等しくない場合
		if (secondNumber != 0) {
			//("平均は" + sumNumber / firstNumber +"です。")と出力する
			System.out.println("平均は" + sumNumber / secondNumber + "です。");
		}
	}
}
