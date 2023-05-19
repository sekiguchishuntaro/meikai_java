package ensyu6_8;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：Ensyu6_8
* 概要：演習6_8クラス
* 作成者：関口駿太郎
* 作成日：2023.04.24
*/

public class Ensyu6_8 {
	
	/*
	 * 関数名：main
	 * メソッドの説明：double型の配列の全要素の合計値と平均値を求めるプログラム
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
		//("要素数:")を出力する
		System.out.print("要素数:");
		//firstNumberに代入された値を読み込む
		 firstNumber = standardInput.nextInt();
		 //firstNumberの値が0より小さいか等しい場合、繰り返し行う
		}while (firstNumber <= 0);
		//配列を宣言
		double[]secondNumber = new double[firstNumber];
		/*
		 * thirdNumberの値を0で初期化
		 * thirdNumberの値がfirstNumberの値より小さい場合
		 * thirdNumberの値を1ずつ増加させる
		 */
		 for (int thirdNumber = 0; thirdNumber < firstNumber; thirdNumber ++) {
			 //("secondNumber[" + thirdNumber +"] =")を出力する
			 System.out.print ("secondNumber[" + thirdNumber +"] =");
			 //secondNumber[thirdNumber]の値を読み込む
			 secondNumber[thirdNumber] = standardInput.nextDouble ();
		 }
		 //sumNumberの値を0で初期化
		double sumNumber = 0;
		//走査し要素を表す
		for (double thirdNumber : secondNumber) 
			//thirdNumberの値をsumNumberの値に加える
			sumNumber += thirdNumber;
		//("全要素の合計は" + sumNumber + "です。")と出力する
		System.out.println ("全要素の合計は" + sumNumber + "です。");
		//("全要素の平均は" + sumNumber / firstNumber + "です。")と出力する
		System.out.println ("全要素の平均は" + sumNumber / firstNumber + "です。");
		

	}


}
