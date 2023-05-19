package ensyu6_16;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：Ensyu6_16
* 概要：演習6_16クラス
* 作成者：関口駿太郎
* 作成日：2023.04.26
*/

public class Ensyu6_16 {
	/*
	 * 関数名：main
	 * メソッドの説明：4行3列の行列と3行4列の行列の積を求めるプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.26
	 */
	public static void main(String[] args) {
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//FIRST_VALUEの値を4で初期化
		final int FIRST_VALUE = 4;
		//SECOND_VALUEの値を3で初期化
		final int SECOND_VALUE = 3;
		//4行3列の行列の宣言
		int[][] firstNumber = new int[FIRST_VALUE][SECOND_VALUE];
		//3行4列の行列の宣言
		int[][] secondNumber = new int[SECOND_VALUE][FIRST_VALUE];
		//4行4列の行列の宣言
		int[][] thirdNumber = new int[FIRST_VALUE][FIRST_VALUE];

		//("行列firstNumberの要素の値")を出力する
		System.out.println("行列firstNumberの要素の値");
		/*
		 * fourNumberの値を0で初期化
		 * fourNumberの値がFIRST_VALUEより小さい場合
		 * fourNumberの値を1ずつ増加させる
		 */
		for (int fourNumber = 0; fourNumber < FIRST_VALUE; fourNumber++) {
			/*
			 * fiveNumberの値を０で初期化
			 * fiveNumberの値がSECOND_VALUEより小さい場合
			 * fiveNumberの値を1ずつ増加させる
			 */
			for (int fiveNumber = 0; fiveNumber < SECOND_VALUE; fiveNumber++) {
				//("firstNumber[%d][%d] ;", fourNumber, fiveNumber)を出力する
				System.out.printf("firstNumber[%d][%d] ;", fourNumber, fiveNumber);
				//firstNumber[fourNumber][fiveNumber]に代入された値を読み込む	
				firstNumber[fourNumber][fiveNumber] = standardInput.nextInt();
				
			}
			
		}
		
		//("行列secondNumberの要素の値")を出力する
		System.out.println("行列secondNumberの要素の値");
		/*
		 * fourNumberの値を0で初期化
		 * fourNumberの値がSECOND_VALUEより小さい場合
		 * fourNumberの値を1ずつ増加せる
		 */
		for (int fourNumber = 0; fourNumber < SECOND_VALUE; fourNumber++) {
			/*
			 * fiveNumberの値を0で初期化
			 * fiveNumberの値がFIRST_VALUEより小さい場合
			 * fiveNumberの値を1ずつ増加させる
			 */
			for (int fiveNumber = 0; fiveNumber < FIRST_VALUE; fiveNumber++) {
				//("secondNumber[%d][%d] ;", fourNumber, fiveNumber)を出力する
				System.out.printf("secondNumber[%d][%d] ;", fourNumber, fiveNumber);
				//secondNumber[fourNumber][fiveNumber]を出力する
				secondNumber[fourNumber][fiveNumber] = standardInput.nextInt();
			}

		}
		/*
		 * fourNumberの値を0で初期化
		 * fourNumberの値がFIRST_VALUEより小さい場合
		 * fourNumberの値を1ずつ増加させる
		 */
		for (int fourNumber = 0; fourNumber < FIRST_VALUE; fourNumber++) {
			/*
			 * fiveNumberの値を0で初期化する
			 * fiveNumberの値がFIRST_VALUEより小さい場合
			 * fiveNumberの値を1ずつ増加させる
			 */
			for (int fiveNumber = 0; fiveNumber < FIRST_VALUE; fiveNumber++) {
				//thirdNumber[fourNumber][fiveNumber]の値を0で初期化
				thirdNumber[fourNumber][fiveNumber] = 0;
				/*
				 * sixNumberの値を0で初期化
				 * sixNumberの値がSECOND_VALUEより小さい場合
				 * sixNumberの値を1ずつ増加させる
				 */
				for (int sixNumber = 0; sixNumber < SECOND_VALUE; sixNumber++) {
					/*
					 * hirdNumber[fourNumber][fiveNumber]に firstNumber[fourNumber][sixNumber]
					 * * secondNumber[sixNumber][fiveNumber]を加える
					 */
					thirdNumber[fourNumber][fiveNumber] += firstNumber[fourNumber][sixNumber]
							* secondNumber[sixNumber][fiveNumber];
				}
			}
		}
		//("行列firstNumberとsecondNumberの積")を出力する
		System.out.println("行列firstNumberとsecondNumberの積");
		/*
		 * fourNumberの値を0で初期化
		 * fourNumberの値がFIRST_VALUEより小さい場合
		 * fourNumberの値を1ずつ増加させる
		 */
		for (int fourNumber = 0; fourNumber < FIRST_VALUE; fourNumber++) {
			/*
			 * fiveNumberの値を0で初期化
			 * fiveNumberの値がFIRST_VALUEより小さい場合
			 * fiveNumberの値を1ずつ増加させる
			 */
			for (int fiveNumber = 0; fiveNumber < FIRST_VALUE; fiveNumber++) {
				//("%3d", thirdNumber[fourNumber][fiveNumber])を出力する
				System.out.printf("%3d", thirdNumber[fourNumber][fiveNumber]);
			}
			//改行して出力する
			System.out.println();
			

		}
	}
}
