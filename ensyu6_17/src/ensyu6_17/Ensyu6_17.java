package ensyu6_17;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：Ensyu6_17
* 概要：演習6_17クラス
* 作成者：関口駿太郎
* 作成日：2023.04.26
*/

public class Ensyu6_17 {
	/*
	 * 関数名：main
	 * メソッドの説明：6人の2科目の点数を読み込んで、科目ごとと学生ごとの平均点を求めるプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.26
	 */
	public static void main(String[] args) {
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//STUDENT_NUMBERの値を6で初期化
		final int STUDENT_NUMBER = 6;
		//FIRST_NUMBERの値を2で初期化
		final int FIRST_NUMBER = 2;
		//SECOND_NUMBERの値を1で初期化
		final int SECOND_NUMBER = 1;
		//THIRD_NUMBERの値を0で初期化
		final int THIRD_NUMBER = 0;
		//点数の配列の生成
		int[][] pointNumber = new int[STUDENT_NUMBER][FIRST_NUMBER];
		//学生の配列を生成
		int[] sumStudent = new int[STUDENT_NUMBER];
		//科目の配列を生成		
		int[] sumSubject = new int[FIRST_NUMBER];
		//(STUDENT_NUMBER +"人の国語・数学の点数を入力。")を出力する
		System.out.println(STUDENT_NUMBER + "人の国語・数学の点数を入力。");
		/*
		 * firstNumberの値を0で初期化
		 * firstNumberの値がSTUDENT_NUMBERの値より小さい場合
		 * firstNumberの値を1ずつ増加させる。
		 */
		for (int firstNumber = 0; firstNumber < STUDENT_NUMBER; firstNumber++) {
			//doからwhileまで一度実行
			do {
			//((firstNumber + 1) + "人目の国語;")を出力する
			System.out.print((firstNumber + 1) + "人目の国語;");
			//pointNumber [firstNumber][THIRD_NUMBER]に代入された値を読み込む
			pointNumber[firstNumber][THIRD_NUMBER] = standardInput.nextInt();
			//("       数学:")を出力する
			System.out.print("       数学:");
			//pointNumber[firstNumber][SECOND_NUMBER]に代入された値を読み込む
			pointNumber[firstNumber][SECOND_NUMBER] = standardInput.nextInt();
			/*
			 * pointNumber[firstNumber][THIRD_NUMBER]の値が0より小さい場合
			 * またはpointNumber[firstNumber][SECOND_NUMBER]の値が0より小さい場合、繰り返し行う
			 */
			}while (pointNumber[firstNumber][THIRD_NUMBER] < 0 || pointNumber[firstNumber][SECOND_NUMBER] < 0);
			//sumStudent [firstNumber]にpointNumber[firstNumber][THIRD_NUMBER] + pointNumber[firstNumber][SECOND_NUMBER]を代入
			sumStudent[firstNumber] = pointNumber[firstNumber][THIRD_NUMBER] + pointNumber[firstNumber][SECOND_NUMBER];
			//sumSubject[THIRD_NUMBER]にpointNumber[firstNumber][THIRD_NUMBER]を加える
			sumSubject[THIRD_NUMBER] += pointNumber[firstNumber][THIRD_NUMBER];
			//sumSubject[SECOND_NUMBER]にpointNumber[firstNumber][SECOND_NUMBER]を加える
			sumSubject[SECOND_NUMBER] += pointNumber[firstNumber][SECOND_NUMBER];

		}
		//("----科目ごとの平均点。----\n")を出力する
		System.out.printf("----科目ごとの平均点----\n");
		//("国語の平均点は" + (double)sumSubject[THIRD_NUMBER]/STUDENT_NUMBER + "です。")を出力する
		System.out.println("国語の平均点は" + (double) sumSubject[THIRD_NUMBER] / STUDENT_NUMBER + "です。");
		//("数学の平均点は" + (double)sumSubject[SECOND_NUMBER]/STUDENT_NUMBER + "です。")を出力する
		System.out.println("数学の平均点は" + (double) sumSubject[SECOND_NUMBER] / STUDENT_NUMBER + "です。");
		//("\n----生徒ごとの合計点----\n\n")を出力する
		System.out.printf("\n----生徒ごとの平均点----\n");
		/*
		 * firstNumberの値を0で初期化
		 * firstNumberの値がSTUDENT_NUMBERの値より小さい場合
		 * firstNumberの値を1ずつ増加させる
		 */
		for (int firstNumber = 0; firstNumber < STUDENT_NUMBER; firstNumber++)
			//(firstNumber +"の生徒の平均点：%.1f\n\n", ((double)sumStudent[firstNumber]) / FIRST_NUMBER)を出力する
			System.out.printf(firstNumber  + "の生徒の平均点：%.1f\n", ((double) sumStudent[firstNumber]) / FIRST_NUMBER);
	}

}
