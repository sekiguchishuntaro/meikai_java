package ensyu3_1;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;
/*
 * クラス名：ensyu3_1
 * 概要：演習3_1クラス
 * 作成者：関口駿太郎
 * 作成日：2023.04.10
 */

public class ensyu3_1 {
	
	/*
	 * 関数名：main
	 * メソッドの説明：整数値を読み込んで、その絶対値を求めて表示するプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.10
	 */
	public static void main(String[] args) {
		
		//キーボードで入力したものを表示させるために促す
		Scanner standardInput = new Scanner(System.in);
		
		//カッコ内の整数値という文字を読み込み、出力する
		System.out.print("整数値:");
		
		//firstNumberにキーボードで打ちこまれた整数値を読み込む
		int firstNumber = standardInput.nextInt();
		
		//firstNumberが0より値が大きければ、実行される
		if (firstNumber > 0)
			
			//firstNumberが０より大きい場合は、（その絶対値は" + firstNumber +"です。）と表示される
			System.out.println("その絶対値は" + firstNumber +"です。");
		//firstNumber>0がfalseだった場合
		else
			
			//firstNumber>0がfalseだった場合は、（その絶対値は" + (- firstNumber) + "です。）と表示される
			System.out.println("その絶対値は" + (- firstNumber) + "です。");
	}

}
