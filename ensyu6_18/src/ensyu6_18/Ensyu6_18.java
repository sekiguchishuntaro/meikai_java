package ensyu6_18;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：Ensyu6_18
* 概要：演習6_18クラス
* 作成者：関口駿太郎
* 作成日：2023.04.26
*/

public class Ensyu6_18 {
	/*
	 * 関数名：main
	 * メソッドの説明：凹凸な二次元配列で行数・各行の列数・各要素の値をキーボードから読み込むプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.26
	 */
	public static void main(String[] args) {
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//rowsNumberの値を0で初期化
		int rowsNumber = 0;
		//doからwhileまで一度実行
		do {
		//("行数:")を出力する
		System.out.print("行数:");
		//rowsNumberに代入された値を読み込む
		 rowsNumber = standardInput.nextInt();
		 //rowsNumberの値が0より小さいか等しい場合に繰り返し行う
		}while (rowsNumber <= 0);
		//配列の生成
		int[][] firstNumber = new int[rowsNumber][];
		/*
		 * secondNumberの値を0で初期化
		 * secondNumberの値がfirstNumber.lengthの値より小さい場合
		 * secondNumberの値を1ずつ増加させる
		 */
		for (int secondNumber = 0; secondNumber < firstNumber.length; secondNumber++) {
			//lineNumberの値を0で初期化
			int lineNumber = 0;
			//doからwhileまで一度実行
			do {
			//(secondNumber + "行目の列数;")を出力する
			System.out.print(secondNumber + "行目の列数;");
			//lineNumberに代入された値を読み込む
			lineNumber = standardInput.nextInt();
			//lineNumberの値が0より小さいか等しい場合に繰り返し行う
			}while (lineNumber <= 0);
			//firstNumber[secondNumber]に[lineNumber]を代入
			firstNumber[secondNumber] = new int[lineNumber];
			
		}
		//("各要素の値を入力")を出力する
		System.out.println("各要素の値を入力");
		/*
		 * secondNumberの値を0で初期化
		 * secondNumberの値がfirstNumber.lengthの値より小さい場合
		 * secondNumberの値を1ずつ増加させる
		 */

		for (int secondNumber = 0; secondNumber < firstNumber.length; secondNumber++) {
			/*
			 * thirdNumberの値を0で初期化
			 * thirdNumberの値がfirstNumber[secondNumber].lengthの値より小さい場合
			 * thirdNumberの値を1ずつ増加させる
			 */
			for (int thirdNumber = 0; thirdNumber < firstNumber[secondNumber].length; thirdNumber++) {
				//doからwhileまで一度実行
				do {
				//("firstNumber[%d][%d];", secondNumber,thirdNumber)を出力する
				System.out.printf("firstNumber[%d][%d];", secondNumber, thirdNumber);
				//firstNumber[secondNumber][thirdNumber]に代入された値を読み込む
				firstNumber[secondNumber][thirdNumber] = standardInput.nextInt();
				//firstNumber[secondNumber][thirdNumber]の値が0より小さいか等しい場合に繰り返し行う
				}while (firstNumber[secondNumber][thirdNumber] <= 0);

			}
		}
		//("配列firstNumberの各要素の値")を出力する
		System.out.println("配列firstNumberの各要素の値");
		/*
		 * secondNumberの値を0で初期化
		 * secondNumberの値がfirstNumber.lengthの値より小さい場合
		 * secondNumberの値を1ずつ増加させる
		 */
		for (int secondNumber = 0; secondNumber < firstNumber.length; secondNumber++) {
			/*
			 * thirdNumberの値を0で初期化
			 * thirdNumberの値がfirstNumber[secondNumber].lengthの値より小さい場合
			 * thirdNumberの値を1ずつ増加させる
			 */
			for (int thirdNumber = 0; thirdNumber < firstNumber[secondNumber].length; thirdNumber++)
				//("%3d", firstNumber[secondNumber][thirdNumber])を出力する
				System.out.printf("%3d", firstNumber[secondNumber][thirdNumber]);
			//改行して出力する
			System.out.println();
		
		}
	}
}
