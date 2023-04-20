package ensyu4_9;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
 * クラス名：Ensyu4_9
 * 概要：演習4_9クラス
 * 作成者：関口駿太郎
 * 作成日：2023.04.14
 */

public class Ensyu4_9 {

	/*
	 * 関数名：main
	 * メソッドの説明：正の整数値firstNumberを読み込んで、1からfirstNumberまでの積を求めるプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.14
	 */
	public static void main(String[] args) {
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//firstNumberの値を0で初期化
		int firstNumber = 0;
		//doからwhileまで一度実行
		do {
			//（正の整数値）を出力する
			System.out.print ("正の整数値:");
			//firstNumberに入る値を取り込む
			firstNumber = standardInput.nextInt();
			
		}//firstNumberの値が0以下または13以上の値であるか判断
		while (firstNumber <= 0 || firstNumber >= 13);

			//productNumberを1で初期化
			int productNumber = 1;
			//secoundnumberの値を1で初期化
			int secondNumber = 1;
			//secondNumberがfirstNumberより小さいか等しい場合
			while(secondNumber <= firstNumber) {
			//productNumberにsecondNumberをかける
			productNumber *= secondNumber;
			//secondNumberの値が1ずつ増える
			secondNumber++;
			
		}//（1から"+firstNumber+"までの積は"+productNumber+"です。）と出力する
		System.out.println("1から"+firstNumber+"までの積は"+productNumber+"です。");
	
		
}

}
