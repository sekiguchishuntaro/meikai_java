package ensyu6_6;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：Ensyu6_6
* 概要：演習6_6クラス
* 作成者：関口駿太郎
* 作成日：2023.04.24
*/

public class Ensyu6_6 {
	/*
	 * 関数名：main
	 * メソッドの説明：テストの合計点・最高点・最低点を表示するプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.24
	 */
	public static void main(String[] args) {
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//firstNumberの値を0で初期化
		int firstNumber = 0;
		//doからwhileまで一度実行
		do {

			//("人数：")を出力する
			System.out.print("人数：");
			//firstNumberに代入された値を読み込む
			firstNumber = standardInput.nextInt();
		//firstNumberの値が0より小さいか等しい場合	
		}while (firstNumber <= 0);
		//配列を生成
		int[] scoreNumber = new int[firstNumber];

		//("点数を入力")を出力する
		System.out.println("点数を入力");
		//sumNumberの値を0で初期化
		int sumNumber = 0;
		/*
		 * secondNumberの値を0で初期化
		 * secondNumberの値がfirstNumberの値より小さい場合
		 * secondNumberの値を1ずつ増加させる
		 */
		for (int secondNumber = 0; secondNumber < firstNumber; secondNumber++) {
			//doからwhileまで一度実行
			do {
			//((secondNumber + 1) + "番の点数：")を出力する
			System.out.print((secondNumber + 1) + "番の点数：");
			
			//scoreNumber[secondNumber]の値を読み込む
			scoreNumber[secondNumber] = standardInput.nextInt();
			//scoreNumber[secondNumber]の値が0より小さい場合
			}while (scoreNumber[secondNumber] < 0);
			// scoreNumber[secondNumber]の値をsumNumberに加える
			sumNumber += scoreNumber[secondNumber];

		}
		//scoreNumber[0]をmaxNumberに代入
		int maxNumber = scoreNumber[0];
		//scoreNumber[0]をminimumNumberに代入
		int minimumNumber = scoreNumber[0];
		/*
		 * secondNumberの値を1で初期化
		 * secondNumberの値がfirstNumberの値より小さい場合
		 * secondNumberの値を1ずつ増加させる
		 */
		for (int secondNumber = 1; secondNumber < firstNumber; secondNumber++) {
			//scoreNumber[secondNumber]の値がmaxNumberより大きい場合、scoreNumber[secondNumber]をmaxNumberに代入
			if (scoreNumber[secondNumber] > maxNumber)
				maxNumber = scoreNumber[secondNumber];
			//scoreNumber[secondNumber]の値がminimumNumberより小さい場合、 scoreNumber[secondNumber]をminimumNumberに代入
			if (scoreNumber[secondNumber] < minimumNumber)
				minimumNumber = scoreNumber[secondNumber];

		}
		//("合計点は" + sumNumber + "点です。")を出力する
		System.out.println("合計点は" + sumNumber + "点です。");
		//("平均点は" + (double) sumNumber / firstNumber + "点です。")を出力する
		System.out.println("平均点は" + (double) sumNumber / firstNumber + "点です。");
		//("最高点は" + maxNumber + "点です。")を出力する
		System.out.println("最高点は" + maxNumber + "点です。");
		//("最小点は" + minimumNumber + "点です。")を出力する
		System.out.println("最小点は" + minimumNumber + "点です。");

	}
}
