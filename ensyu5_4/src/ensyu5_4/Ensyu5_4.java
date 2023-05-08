package ensyu5_4;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：Ensyu5_4
* 概要：演習5_4クラス
* 作成者：関口駿太郎
* 作成日：2023.04.21
*/

public class Ensyu5_4 {
	
	/*
	 * 関数名：main
	 * メソッドの説明：三つの整数値を読み込んで、その合計と平均を表示するプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.21
	 */
	public static void main(String[] args) {
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//("整数値firstNumberとsecondNumberとthirdNumberの合計と平均値を求めます。")と出力する
		System.out.println ("整数値firstNumberとsecondNumberとthirdNumberの合計と平均値を求めます。");
		
		//("firstNumberの値:")と出力する
		System.out.print ("firstNumberの値:");
		//firstNumberに代入された値を読み込む
		int firstNumber = standardInput.nextInt ();
		//("secondNumberの値:")と出力する
		System.out.print ("secondNumberの値:");
		//secondNumberに代入された値を読み込む
		int secondNumber = standardInput.nextInt ();
		//("thirdNumberの値:")と出力する
		System.out.print ("thirdNumberの値:");
		//secondNumberに代入された値を読み込む
		int thirdNumber = standardInput.nextInt ();
		//firstNumber + secondNumber + thirdNumberの値をsumNumberに代入
		int sumNumber = firstNumber + secondNumber + thirdNumber;
		//(firstNumber + secondNumber + thirdNumber) / 3.0の値をaverageValueに代入
		double averageValue = (firstNumber + secondNumber + thirdNumber) / 3.0;
		//("firstNumberとsecondNumberとthirdNumberの合計は" + sumNumber + "です。")と出力する
		System.out.println ("firstNumberとsecondNumberとthirdNumberの合計は" + sumNumber + "です。");
		//("firstNumberとsecondNumberとthirdNumberの平均は" + averageValue + "です。")と出力する
		System.out.println ("firstNumberとsecondNumberとthirdNumberの平均は" + averageValue + "です。");
		

	}
}
