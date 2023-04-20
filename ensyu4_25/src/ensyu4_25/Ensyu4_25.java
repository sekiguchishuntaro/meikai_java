package ensyu4_25;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：ensyu4_25
* 概要：演習4_25クラス
* 作成者：関口駿太郎
* 作成日：2023.04.20
*/
public class Ensyu4_25 {

	/*
	 * 関数名：main
	 * メソッドの説明：読み込んだ整数を加算するプログラムで合計だけでなく平均も求めるプログラム
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
		/*
		 * secondNumberの値を0で初期化
		 * secondNumberの値がfirstNumberの値より小さい場合
		 * secondNumberの値を1ずつ増加させる
		 */
		for (int secondNumber = 0; secondNumber < firstNumber; secondNumber++) {
			//("整数 (0で終了) : ")と出力する
			System.out.print("整数 (0で終了) : ");
			//thirdNumberに代入される値を読み込む
			int thirdNumber = standardInput.nextInt();
			//thirdNumberの値が0と等しい場合
			if (thirdNumber == 0)
				//for文を抜け出す
				break;
			//sumNumberにthirdNumberの値を加える
			sumNumber += thirdNumber;

		} 
		//("合計は" + sumNumber +"です。")と出力する
		System.out.println("合計は" + sumNumber + "です。");
		//firstNumberの値が0と等しくない場合
		if (firstNumber != 0) {
			//	("平均は" + sumNumber / firstNumber +"です。")と出力する
			System.out.println("平均は" + sumNumber / firstNumber + "です。");
		}
	}
}
