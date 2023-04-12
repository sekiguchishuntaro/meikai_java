package ensyu3_18;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
 * クラス名：Ensyu3_18
 * 概要：演習3_18クラス
 * 作成者：関口駿太郎
 * 作成日：2023.04.11
 */

public class Ensyu3_18 {

	/*
	 * 関数名：main
	 * メソッドの説明：月を1～12の整数値として読み込んで、それに対応する季節を表示するプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.11
	 */
	public static void main(String[] args) {

		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);

		//何月であるかを入力する準備および（何月ですか）と出力する
		System.out.print("何月ですか:");

		//monthNumberという変数に値を入力し取り込む
		int monthNumber = standardInput.nextInt();

		//monthNumberに代入された値をそれぞれ決められた値と季節に分岐させる
		switch (monthNumber) {
		//1が入力されるとそれに対応した季節のラベルが出力する
		case 1:
			System.out.println("冬");
			//switch文を抜け出す
			break;
		//2が入力されるとそれに対応した季節のラベルが出力する
		case 2:
			System.out.println("冬");
			//switch文を抜け出す
			break;
		//3が入力されるとそれに対応した季節のラベルが出力する
		case 3:
			System.out.println("春");
			//switch文を抜け出す
			break;
		//4が入力されるとそれに対応した季節のラベルが出力する
		case 4:
			System.out.println("春");
			//switch文を抜け出す
			break;
		//5が入力されるとそれに対応した季節のラベルが出力する
		case 5:
			System.out.println("春");
			//switch文を抜け出す
			break;
		//6が入力されるとそれに対応した季節のラベルが出力する
		case 6:
			System.out.println("夏");
			//switch文を抜け出す
			break;
		//7が入力されるとそれに対応した季節のラベルが出力する
		case 7:
			System.out.println("夏");
			//switch文を抜け出す
			break;
		//8が入力されるとそれに対応した季節のラベルが出力する
		case 8:
			System.out.println("夏");
			//switch文を抜け出す
			break;
		//9が入力されるとそれに対応した季節のラベルが出力する
		case 9:
			System.out.println("秋");
			//switch文を抜け出す
			break;
		//10が入力されるとそれに対応した季節のラベルが出力する
		case 10:
			System.out.println("秋");
			//switch文を抜け出す
			break;
		//11が入力されるとそれに対応した季節のラベルが出力する
		case 11:
			System.out.println("秋");
			//switch文を抜け出す
			break;
		//12が入力されるとそれに対応した季節のラベルが出力する
		case 12:
			System.out.println("冬");
			//switch文を抜け出す
			break;
		//上記に当てはまらない値を入力した場合に（そんな月はありません。）と出力する
		default:
			System.out.println("そんな月はありません。");
			//switch文を抜け出す
			break;

		}

	}
}
