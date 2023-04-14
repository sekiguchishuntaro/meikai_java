package ensyu4_5;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
 * クラス名：Ensyu4_5
 * 概要：演習4_5
 * 作成者：関口駿太郎
 * 作成日：2023.04.13
 */

public class Ensyu4_5 {

	/*
	 * 関数名：main
	 * メソッドの説明：正の整数値を0までカウントダウンするプログラムの最後--xに変更した場合
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.13
	 */

	public static void main(String[] args) {

		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//カウントダウンしますと出力する
		System.out.println("カウントダウンします。");
		//firstNumberの初期化
		int firstNumber = 0;
		//do以降を実行する
		do {
			//正の整数値を出力する
			System.out.print("正の整数値:");
			//firstNumberに入る値を取り込む
			firstNumber = standardInput.nextInt();
			//firstnumberが0より小さいか等しい場合
			} while (firstNumber <= 0);
		
		//firstNumberが0より大きいか等しい場合
		while(firstNumber>=0) {
			//firstNumberの値を一つずつ減少させる
			System.out.println(--firstNumber);
			}
	

	//変数の前に置くことで、カウントダウンのスタートが-1された状態からスタートし、-1まで表示される
		}
	}
