package ensyu4_10;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
 * クラス名：ensyu4_10
 * 概要：演習4_10クラス
 * 作成者：関口駿太郎
 * 作成日：2023.04.17
 */
public class Ensyu4_10 {

	/*
	 * 関数名：main
	 * メソッドの説明：読み込んだ値が1未満であれば改行文字を出力しないようにするプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.17
	 */
	public static void main(String[] args) {
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//（何個を表示しますか）と出力する
		System.out.print ("何個を表示しますか：");
		//firstNumberに入る値を読み込む
		int firstNumber = standardInput.nextInt ();
		//firstNumberの値が0より小さいか等しい場合
		if (firstNumber <= 0) {
			//（範囲外の値です。）と出力する
			System.out.print("範囲外の値です。");
			}

		//secondNumberを1で初期化する。secondNumberがfirstNumberより小さいか等しい場合。secondNumberが繰り返されるたび1ずつ増加する。
		for (int secondNumber = 1; secondNumber <= firstNumber; secondNumber ++)
			//＊を出力する
			System.out.print ("*");
		//firstNumberが1より大きく等しい場合
		if (firstNumber >= 1) {
		//改行し出力する
		System.out.println ();
		}
	}
}
