package ensyu6_4;

//ランダムで値を生成する準備
import java.util.Random;
//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：Ensyu6_4
* 概要：演習6_4クラス
* 作成者：関口駿太郎
* 作成日：2023.04.24
*/

public class Ensyu6_4 {

	/*
	 * 関数名：main
	 * メソッドの説明：配列の全要素に乱数を代入して縦向きの棒グラフで表示するプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.24
	 */

	public static void main(String[] args) {
		//乱数を扱うための準備
		Random randomNumber = new Random();
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//("要素数：")と出力する
		System.out.print ("要素数：");
		//FIRST_VALUEを1で初期化
		final int FIRST_VALUE = 1;
		//SECOND_VALUEを10で初期化
		final int SECOND_VALUE = 10;
		//firstNumberに代入された値を読み込む
		int firstNumber = standardInput.nextInt ();
		//配列を生成
		int[]secondNumber = new int[firstNumber];
		
		
		/*
		 * thirdNumberの値を0で初期化
		 * thirdNumberの値がfirstNumberの値より小さい場合
		 * thirdNumberの値を1ずつ増加させる
		 */
		for (int thirdNumber = 0; thirdNumber < firstNumber; thirdNumber ++)
			//1 + randomNumber.nextInt (10)で1から10の乱数生成し、secondNumber[thirdNumber]に代入
			secondNumber[thirdNumber] = FIRST_VALUE + randomNumber.nextInt (SECOND_VALUE);
		
		/*
		 * thirdNumberの値を10で初期化
		 * thirdNumberの値が1より大きいか等しい場合
		 * thirdNumberの値を1ずつ減少させる
		 */
		for (int thirdNumber = 10; thirdNumber > 0; thirdNumber --) {
			/*
			 * fourNumberの値を0で初期化
			 * fourNumberの値がfirstNumberより小さい場合
			 * fourNumberの値を1ずつ増加させる
			 */
			for (int fourNumber = 0; fourNumber < firstNumber; fourNumber ++)
				//secondNumber[fourNumber]の値がthirdNumberより大きいか等しい場合
				if (secondNumber[fourNumber] >= thirdNumber) {
					//("*")を出力する
					System.out.print ('*');
				}
				//大きくない場合
				else {
					//(" ")を出力する
					System.out.print (' ');
				}
			//改行して出力する
			System.out.println ();
		}
		
		
		/*
		 * thirdNumberの値を0で初期化
		 * thirdNumberの値が 2 * firstNumberより小さい場合
		 * thirdNumberの値を1ずつ増加させる
		 */
		for (int thirdNumber = 0; thirdNumber < firstNumber * 2; thirdNumber ++) 
			//(" - ")を出力する
			System.out.print ('-');
		//改行し出力する
		System.out.println ();
		
		
		/*
		 * thirdNumberの値を0で初期化
		 * thirdNumberの値がfirstNumberの値より小さい場合
		 * thirdNumberの値を1ずつ増加させる
		 */
		for (int thirdNumber = 0; thirdNumber < firstNumber; thirdNumber ++) 
			//(thirdNumber % 10 + " ")を出力する
			System.out.print (thirdNumber % SECOND_VALUE );
		System.out.print (' ');
		//改行し出力する
		System.out.println ();
		}
		
	}

