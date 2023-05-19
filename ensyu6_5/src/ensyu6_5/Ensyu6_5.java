package ensyu6_5;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：Ensyu6_5
* 概要：演習6_5クラス
* 作成者：関口駿太郎
* 作成日：2023.04.24
*/

public class Ensyu6_5 {
	/*
	 * 関数名：main
	 * メソッドの説明：配列の要素数と、個々の要素の値を読み込んで、各要素の値を表示するプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.21
	 */
	public static void main(String[] args) {
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//("要素数:")を出力する
		System.out.print("要素数:");
		//firstNumberに代入された値を読み込む
		int firstNumber = standardInput.nextInt();
		//配列を生成
		int[] secondNumber = new int[firstNumber];
		/*
		 * thirdNumberの値を0で初期化
		 * thirdNumberの値がfirstNumberの値より小さい場合
		 * thirdNumberの値を1ずつ増加させる
		 */
		for (int thirdNumber = 0; thirdNumber < firstNumber; thirdNumber++) {
			//("secondNumber[" + thirdNumber + "] = ")を出力する
			System.out.print("secondNumber[" + thirdNumber + "] = ");
			//secondNumber[thirdNumber]の値を読み込む
			secondNumber[thirdNumber] = standardInput.nextInt();
		}
		//("secondNumber = {")を出力する
		System.out.print("secondNumber = {");

		//もしfirstNumberの値が 2より大きいか等しい場合
		if (firstNumber >= 2) {
			/*
			 * thirdNumberの値を0で初期化
			 * thirdNumberの値がfirstNumber - 1の値より小さい場合
			 * thirdNumberの値を1ずつ増加させる
			 */
			for (int thirdNumber = 0; thirdNumber < firstNumber - 1; thirdNumber++)
				//(secondNumber[thirdNumber] + ",")を出力する
				System.out.print(secondNumber[thirdNumber] + ",");
		}
		//firstNumberの値が1より大きいか等しい場合
		if (firstNumber >= 1) {
			//(secondNumber[firstNumber - 1])を出力する
			System.out.print(secondNumber[firstNumber - 1]);
			//("}")を出力する
			System.out.print("}");
		}

	}
}
