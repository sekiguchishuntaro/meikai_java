package ensyu2_6;

import java.util.Scanner;
/*
 * クラス名：ensyu2_6
 * 概要：演習2_6クラス
 * 作成者：関口駿太郎
 * 作成日：2023.04.06
 */

public class ensyu2_6 {
	/*
	 * 関数名main
	 * メソッドの説明：三角形の底辺と高さを読み込んで、その面積を表示するプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.06
	 */
	
	public static void main (String[] args) {
		
		//キーボードで入力したものを促す
		Scanner standardInput = new Scanner(System.in);
		
		//（三角形の面積を求めます）という文字を表示する
		System.out. println("三角形の面積を求めます。");
		
		//底辺の値の入力を促す
		System.out.print("底辺:");
		
		//firstNumberの値を読み込む
		double firstNumber = standardInput.nextDouble();
		
		//高さの値の入力を促す
		System.out.print("高さ:");
		
		//secondNumberの値を読み込む
		double secondNumber = standardInput.nextDouble();
		
		//firstNumberとsecondNumberの面積を表示する
		System.out.println("面積は"+(firstNumber * secondNumber) / 2 +"です。");
		
		
	}

}
