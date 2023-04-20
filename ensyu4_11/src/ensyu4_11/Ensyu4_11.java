package ensyu4_11;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
 * クラス名：Ensyu4_11
 * 概要：演習4_11クラス
 * 作成者：関口駿太郎
 * 作成日：2023.04.17
 */

public class Ensyu4_11 {
	
	/*
	 * 関数名：main
	 * メソッドの説明：正の整数値を0までカウントダウンするプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.17
	 */
	public static void main(String[] args) {
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//（カウントダウンします。）と出力する
		System.out.println ("カウントダウンします。");
		//firstNumberを0で初期化する
		int firstNumber = 0;
		//doからwhileまで一度実行
		do {
			//（正の整数値：）を出力する
			System.out.print ("正の整数値：");
			//firstNumberに入る値を取り込む
			firstNumber = standardInput.nextInt();
			}
			//firstnumberの値が0より大きいか等しい場合
			while (firstNumber <= 0);
			//firstNumberが0より大きいか等しい場合。繰り返されるたびfirstNumberの値が1ずつ減少する
			for ( ;firstNumber >= 0;firstNumber --)
				//(firNumber)を出力する
				System.out.println (firstNumber);
			
		
	}

}
