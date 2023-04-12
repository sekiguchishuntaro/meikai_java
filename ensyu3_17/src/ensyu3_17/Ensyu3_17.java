package ensyu3_17;

//キーボードから値や文字を入力するための準備
import java.util.Random;

/*
 * クラス名：Ensyu3_17
 * 概要：演習3_17クラス
 * 作成者：関口駿太郎
 * 作成日：2023.04.11
 */
public class Ensyu3_17 {

	/*
	 * 関数名：main
	 * メソッドの説明：0.1.2のいずれかの乱数を生成し、それぞれグー、チョキ、パーを表示するプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.11
	 */
	public static void main(String[] args) {

		//乱数を生成するための準備
		Random randomNumber = new Random();

		//ランダムで決めた時にわかりやすくするため（選んだ手は）と出力する
		System.out.print("選んだ手は");

		//0.1.2いずれかの値の乱数を決める
		int handName = randomNumber.nextInt(3);

		//handNameに代入された値をそれぞれ決められた値と季節に分岐させる
		switch (handName) {

		//handNameが0のときの飛び先を表すラベル
		case 0:
			//0の場合はグーと出力する
			System.out.println("グー");
			//switch文を抜け出す
			break;

		//handNameが1のときの飛び先を表すラベル
		case 1:
			//1の場合チョキと出力する
			System.out.println("チョキ");
			//switch文を抜け出す
			break;

		//handNameが2のときの飛び先を表すラベル
		case 2:
			//2の場合パーと出力する
			System.out.println("パー");
			//switch文を抜け出す
			break;

		}

	}

}
