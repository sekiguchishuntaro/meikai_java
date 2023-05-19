package ensyu6_13;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;
/*
* クラス名：Ensyu6_13
* 概要：演習6_13クラス
* 作成者：関口駿太郎
* 作成日：2023.04.25
*/

public class Ensyu6_13 {
	/*
	 * 関数名：main
	 * メソッドの説明：配列secondNumberの全要素を配列thirdNUmberに対し逆順にコピーするプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.25
	 */
	public static void main(String[] args) {
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//firstNumberの値を0で初期化する
		int firstNumber = 0;
		//doからwhileまで一度実行
		do {
		//("要素数:")を出力する	
		System.out.print("要素数:");
		//firstNumberに代入された値を読み込む
		firstNumber = standardInput.nextInt();
		//firstNumberの値が0より小さいか等しい場合に繰り返し行う
		}while (firstNumber <= 0);
		//配列secondNumberを生成
		int [] secondNumber = new int[firstNumber];
		//配列thirdNumberを生成
		int [] thirdNumber = new int[firstNumber];
		/*
		 * fourNumberの値を0で初期化
		 * fourNumberの値がfirstNumberの値より小さい場合
		 * fourNumberの値を1ずつ増加させる
		 */
		for (int fourNumber = 0; fourNumber < firstNumber; fourNumber ++) {
			//("secondNumber[" + fourNumber + "] =")を出力する
			System.out.print ("secondNumber[" + fourNumber + "] =");
			//secondNumber[fourNumber]に代入された値を読み込む
			secondNumber[fourNumber] = standardInput.nextInt();
			
		}
		/*
		 * fourNumberの値を0で初期化
		 * fourNumberの値がfirstNumberの値より小さい場合
		 * fourNumberの値を1ずつ増加させる
		 */
		for (int fourNumber = 0; fourNumber < firstNumber; fourNumber ++)
			//thirdNumber[fourNumber]にsecondNumber[firstNumber - fourNumber - 1]の値を代入
			thirdNumber[fourNumber] = secondNumber[firstNumber - fourNumber - 1];
		
		//("secondNumberの全要素を逆順でthirdNumberにコピーしました。")を出力する
		System.out.println ("secondNumberの全要素を逆順でthirdNumberにコピーしました。");
		
		/*
		 * fourNumberの値を0で初期化
		 * fourNumberの値がfirstNumberの値より小さい場合
		 * fourNumberの値を1ずつ増加させる
		 */
		for (int fourNumber = 0; fourNumber < firstNumber; fourNumber ++)
			//("thirdNumber[" + fourNumber + "] = " + thirdNumber[fourNumber])を出力する
			System.out.println ("thirdNumber[" + fourNumber + "] = " + thirdNumber[fourNumber]);



	}
}
