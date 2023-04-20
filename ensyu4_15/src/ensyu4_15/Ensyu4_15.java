package ensyu4_15;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
 * クラス名：Ensyu4_15
 * 概要：演習4_15クラス
 * 作成者：関口駿太郎
 * 作成日：2023.04.18
 */

public class Ensyu4_15 {
	
	/*
	 * 関数名：main
	 * メソッドの説明：身長と標準体重の対応表を表示するプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.18
	 */
	public static void main(String[] args) {
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		
		//("何㎝から:")と出力
		System.out.print ("何㎝から:");
		//firstNumberに代入される値を読み込む
		int firstNumber = standardInput.nextInt();
		//("何㎝まで:")と出力
		System.out.print ("何㎝まで:");
		//secondNumberに代入される値を読み込む
		int secondNumber = standardInput.nextInt();
		
			
		//("何㎝ごと: ")と出力する
		System.out.print ("何㎝ごと:");
		//thirdNumberに代入される値を読み込む
		int thirdNumber = standardInput.nextInt();
		//("身長 標準体重")と出力する
		System.out.println ("身長 標準体重");
		//firstnumberの値がsecondNumberの値より大きい場合
		if (firstNumber > secondNumber) {
			//("処理を終了します。")と出力する
			System.out.print ("処理を終了します。");
		}
		//fourNumberでfirstNumberで初期化、fourNumberがsecondnumberより値が小さいか等しい場合、fourNumberにthirdNumberを加える
		for (int fourNumber = firstNumber; fourNumber <= secondNumber; fourNumber += thirdNumber) {
			//secondNumber - firstNumber の値が thirdNumberより小さい場合 
			if (secondNumber - firstNumber < thirdNumber ) {
				//("範囲を超えた値です。")と出力する
				System.out.print ("範囲を超えた値です。");
				//for文を抜け出す
				break;
			}
				
		//(fourNumber + " " + (fourNumber - 100) * 0.9)を出力する
		System.out.println (fourNumber + " " + 0.9 * (fourNumber - 100) ) ;
		
		}
		

		
	}
}
