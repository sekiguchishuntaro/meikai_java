package ensyu4_4;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
 * クラス名：Ensyu4_4
 * 概要：演習4_4クラス
 * 作成者：関口駿太郎
 * 作成日：2023.04.13
 */
public class Ensyu4_4 {

	/*
	 * 関数：main
	 * メソッドの説明：while文終了時にxの値が-1になることを確認するプログラム
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
		//do以降を一度実行する
		do {
			//正の整数値を出力する
			System.out.print("正の整数値:");
			//firstNumberに入る値を取り込む
			firstNumber = standardInput.nextInt();
		} 
		//firstnumberが0より小さいか等しい場合
		while (firstNumber <= 0);
		//firstNumberが0より大きいか等しい場合
		while (firstNumber >= 0) {
			//firstNumberの値を出力する
			System.out.println(firstNumber);
			//firstNumberの値を一つずつ減らす
			firstNumber--;

		}
		//firstNumberの値が0から-1なった時点でwhile文が終わり、出力する
		System.out.print("firstNumberの値は" + firstNumber + "になりました。");
	}
}
