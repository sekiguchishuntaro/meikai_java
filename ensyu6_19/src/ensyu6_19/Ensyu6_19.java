package ensyu6_19;
//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：Ensyu6_19
* 概要：演習6_19クラス
* 作成者：関口駿太郎
* 作成日：2023.04.27
*/


public class Ensyu6_19 {
	/*
	 * 関数名：main
	 * メソッドの説明：クラス数・各クラスの人数・全員の点数を読み込んで、合計点と平均点を求めるプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.27
	 */
	public static void main(String[] args) {
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//FIRST_VALUEの値を1で初期化
		final int FIRST_VALUE = 1;
		//classNumberの値を0で初期化
		int classNumber = 0;
		//doからwhileまで一度実行
		do {
		//("クラス数:")を出力
		System.out.print ("クラス数:");
		//classNumberに代入された値を読み込む
		classNumber = standardInput.nextInt();
		//classNumberの値が0より小さいか等しい場合、繰り返し行う
		}while (classNumber <= 0);
		//firstNumberの値を0で初期化
		int firstNumber = 0;
		//配列の生成
		int [][]pointNumber = new int [classNumber][];
		/*
		 * secondNumberの値を0で初期化
		 * secondNumberの値がpointNumber.lengthの値より小さい場合
		 * secondnumberの値を1ずつ増加させる
		 */
		for (int secondNumber = 0; secondNumber < pointNumber.length; secondNumber ++) {
			//numNumberの値を0で初期化
			int numNumber = 0;
			//doからwhileまで一度実行
			do {
			//("\n%d組の人数：",secondNumber + FIRST_VALUE)を出力する
			System.out.printf ("\n%d組の人数：",secondNumber + FIRST_VALUE);
			//numNumberに代入された値を読み込む
			numNumber = standardInput.nextInt();
			//numNumberの値が0より小さいか等しい場合、繰り返し行う
			}while (numNumber <= 0);
			//配列の生成
			pointNumber[secondNumber] = new int[numNumber];
			//firstNumberにnumNumberの値を加える
			firstNumber += numNumber;
			;
			/*
			 * thirdNumberの値を0で初期化
			 * thirdNumberの値がpointNumber[secondNumber].lengthの値より小さい場合
			 * thirdNumberの値を1ずつ増加させる
			 */
			for (int thirdNumber = 0; thirdNumber < pointNumber[secondNumber].length; thirdNumber ++) {
				//doからwhileまで一度実行
				do {
				//("%d組%d番の点数；",secondNumber + FIRST_VALUE,thirdNumber + FIRST_VALUE)を出力する
				System.out.printf ("%d組%d番の点数；",secondNumber + FIRST_VALUE,thirdNumber + FIRST_VALUE);
				//pointNumber[secondNumber][thirdNumber]に代入された値を読み込む
				pointNumber[secondNumber][thirdNumber] = standardInput.nextInt();
				//pointNumber[secondNumber][thirdNumber]の値が0より小さいか等しい場合、繰り返し行う
				}while (pointNumber[secondNumber][thirdNumber] <= 0);
			}
			//改行して出力する
			System.out.println ();
		}
		//int型の配列の生成
		int[] sumNumber = new int [pointNumber.length];
		//double型の配列の生成
		double[] averageNumber = new double [pointNumber.length];
		//(" 組 | 合計 平均")を出力する
		System.out.println (" 組 |       合計 平均");
		//("----+-------------")を出力する
		System.out.println ("----+--------------------");
		/*
		 * secondNumberの値を0で初期化
		 * secondNumberの値がpointNumber.lengthの値より小さい場合
		 * secondNumberの値を1ずつ増加させる
		 */
		for (int secondNumber = 0; secondNumber < pointNumber.length; secondNumber ++) {
			/*
			 * thirdNumberの値を0で初期化
			 * thirdNumberの値がpointNumber[secondNumber].lengthの値より小さい場合
			 * thirdNumberの値を1ずつ増加させる
			 */

			for (int thirdNumber = 0; thirdNumber < pointNumber[secondNumber].length; thirdNumber ++)
				//sumNumber[secondNumber]に pointNumber[secondNumber][thirdNumber]の値を加える
				sumNumber[secondNumber] += pointNumber[secondNumber][thirdNumber];
			//averageNumber[secondNumber]にsumNumber[secondNumber] / (double)pointNumber[secondNumber].lengthの値を加える
			averageNumber[secondNumber] += sumNumber[secondNumber] / (double)pointNumber[secondNumber].length;
			//("%d組 | %7d%7.1f\n", secondNumber + 1,sumNumber [secondNumber], averageNumber[secondNumber])を出力する
			System.out.printf ("%d組 | %7d%7.1f\n", secondNumber + 1,sumNumber [secondNumber], averageNumber[secondNumber]);
		}	
		//totalNumberの値を0で初期化
		int totalNumber = 0;
		/*
		 * 拡張for文によりint型の要素を表す
		 * sumNumberという配列
		 */
		for (int secondNumber : sumNumber) {
			//totalNumberにsecondNumberの値を加える
			totalNumber += secondNumber;
		}
		//averageNumber1に(double)totalNumber / firstNumberの値を加える
		double averageNumber1 = (double)totalNumber / firstNumber;
		//("----+--------------")を出力する
		System.out.println ("----+---------------------");
		//(" 計 | %7d%7.1f\n",totalNumber,averageNumber1)を出力する
		System.out.printf (" 計 | %7d%7.1f\n",totalNumber,averageNumber1);
	

	}
}
