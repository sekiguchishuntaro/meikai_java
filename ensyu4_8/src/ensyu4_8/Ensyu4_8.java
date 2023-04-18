package ensyu4_8;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
 * クラス名：Ensyu4_8
 * 概要：演習4_8クラス
 * 作成者：関口駿太郎
 * 作成日：2023.04.14
 */
public class Ensyu4_8 {

	/*
	 * 関数名：main
	 * メソッドの説明：正の整数値を読み込んで、その桁数を出力するプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.14
	 */
	public static void main(String[] args) {
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//（正の整数値の桁数を求めます。）と出力する
		System.out.println ("正の整数値の桁数を求めます。");
		//firstNumberを0で初期化
		int firstNumber = 0;
		//doからwhileまで一度実行する
		do {
			//（正の整数値）を出力する
			System.out.print("正の整数値：");
			//firstNumberに入る値を読み込む
			firstNumber = standardInput.nextInt ();
			//firstNumberが0より小さいか等しい
			}while (firstNumber <= 0);
		
		//digitsNumberを0で初期化
		int digitsNumber = 0;
		//firstNumberが0より大きい場合
		while (firstNumber > 0) {
			//digitsNumberの値を一つずつ増加させる
			digitsNumber ++;
			//firstNumberの値を10で割る
			firstNumber /= 10;
			}
		//（その値はdigitsNumber桁です。）と出力する
		System.out.println ("その値は" + digitsNumber + "桁です。");
			
	}
	
}
	


