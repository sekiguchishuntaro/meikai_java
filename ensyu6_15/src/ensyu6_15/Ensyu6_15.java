package ensyu6_15;

//ランダムで値を生成する準備
import java.util.Random;
//キーボードから値や文字を入力するための準備
import java.util.Scanner;
/*
* クラス名：Ensyu6_15
* 概要：演習6_15クラス
* 作成者：関口駿太郎
* 作成日：2023.04.26
*/


public class Ensyu6_15 {
	/*
	 * 関数名：main
	 * メソッドの説明：曜日を表示して、その英語表現を入力させるプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.25
	 */
	public static void main(String[] args) {
		//乱数を扱うための準備
		Random randomNumber = new Random();
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//FIRST_VALUEの値を7で初期化
		final int FIRST_VALUE = 7;
		
		//日本語の曜日名を表す
		String[]dayJapanese = {
				//"日","月","火","水","木","金","土"を表す
				"日","月","火","水","木","金","土"
				
		};
		//英語の曜日名を表す
		String[] dayEnglish = {
				//"sunday", "monday", "tuesday", "wendnesday",を表す
				"sunday", "monday", "tuesday", "wendnesday", 
				//"thursday", "friday", "saturday"を表す
				"thursday", "friday", "saturday"
		};
		//("英語の曜日名を小文字で入力してください。")と出力する
		System.out.println("英語の曜日名を小文字で入力してください。");
		//retryNumberの値を0で初期化
		int retryNumber = 0;
		//lastMonthの値を－1で初期化
		int lastDay = -1;
		//monthNumberの値を0で初期化
		int dayNumber = 0;
		//doからwhileまで一度実行
		do {
			//0から6の乱数を生成
			dayNumber = randomNumber.nextInt(FIRST_VALUE);
			//monthNumberの値がlastMonthの値と等しい場合
			while (dayNumber == lastDay);
			//lastMonthにmonthNumberを代入する
			lastDay = dayNumber;
			//trueであった場合
			while (true) {
				//(dayJapanese[dayNumber] + "曜日：")を出力する
				System.out.print(dayJapanese[dayNumber] + "曜日：");
				//firstNumberに代入される値を読み込む
				String firstNumber = standardInput.next();
				/*
				 * 文字列がdayEnglish[dayNumber]と等しいかどうか判断
				 * breakはfor文を抜け出す
				 */
				if (firstNumber.equals(dayEnglish[dayNumber]))break;
					
				//("違います。")と出力する
				System.out.println("違います。");

			}
			//("正解です。もう一度？ 1…Yes / 0…No:")と出力する
			System.out.print("正解です。もう一度？ 1…Yes / 0…No:");
			//retryNumberに代入された値を読み込む
			retryNumber = standardInput.nextInt();
		//retryNumberの値が1と等しい場合、繰り返し行う
		}while (retryNumber == 1);



	}
}
