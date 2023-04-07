package ensyu2_3;

import java.util.Scanner;
/*
 * クラス名：ensyu2_3
 * 概要：演習2_3クラス
 * 作成者：関口駿太郎
 * 作成日：2023.04.06
 */
public class ensyu2_3 {
	/*
	 * 関数名：main
	 * メソッドの説明：キーボードから読み込んだ整数値をそのまま反復して表示するプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.06
	 */
	public static void main(String[]args) {
		//キーボードで入力したものを取り込む準備
		Scanner stansardInput = new Scanner(System.in);
		
		//整数値が入力されると取り込む
		System.out.print("整数値:");
		
		//firstNumberに整数値を読み込む
		int firstNumber = stansardInput.nextInt();
		
		//カッコ内で処理されたものの結果がコンソール画面に出力される
		System.out.println(firstNumber + "と入力しましたね。");
	   
	   
	   
	}
	

}
