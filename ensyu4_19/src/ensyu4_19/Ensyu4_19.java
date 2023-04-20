package ensyu4_19;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：ensyu4_19
* 概要：演習4_19クラス
* 作成者：関口駿太郎
* 作成日：2023.04.18
*/

public class Ensyu4_19 {
	
	/*
	 * 関数名：main
	 * メソッドの説明：季節を求めるプログラムで、1から12以外の値が入力された場合に再入力させるプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.18
	 */
		public static void main(String[] args) {
			//キーボードで入力したものを表示させるために,新しく取り込む準備
			Scanner standardInput = new Scanner(System.in);
			// retryNumberの値を0で初期化
			int retryNumber = 0;
			//("季節を求めます。")と出力する
			System.out.println ("季節を求めます。");

		//doからwhileまで一度実行する
		do {
			//monthNumberの値を0で初期化する
			int monthNumber = 0;
			//doからwhileまで
			do {
				//("何月ですか:")と出力する
				System.out.print ("何月ですか:");
				//monthNumberの値に代入された値を読み込む
				monthNumber = standardInput.nextInt ();
			//monthNumberの値が1より小さいまたは12より大きい場合に繰り返し行う
			}while (monthNumber < 1 || monthNumber > 12);
			//monthNumberが3以上かつ5以下の場合
			if (monthNumber >= 3 && monthNumber <=5) {
				//("それは春です。")と出力する
				System.out.println ("それは春です。");
			}
			//monthNumberが6以上かつ8以下の場合
			else if (monthNumber >= 6 && monthNumber <=8) {
				//("それは夏です。")と出力する
				System.out.println ("それは夏です。");
			}
			//monthNumberが9以上かつ11以下の場合
			else if (monthNumber >= 9 && monthNumber <=11) {
				//("それは秋です。")と出力する
				System.out.println ("それは秋です。");
			}
			//MonthNumberが12、1、2と等しい場合
			else if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
				//("それは冬です。")と出力する
				System.out.println ("それは冬です。");
			}
			//("もう一度? 1…Yes / 0…No:")と出力する
			System.out.print ("もう一度? 1…Yes / 0…No:");
			//retryNumberの値に代入された値を読み込む
			retryNumber = standardInput.nextInt();
		//	retryNumberの値が1と等しい場合
		}while (retryNumber == 1);
		

	}
}
