package ensyu2_4;
//キーボードから値や文字を入力するための準備
import java.util.Scanner;
/*
 * クラス名：essyu2_4
 * 概要：演習2_4クラス
 * 作成者：関口駿太郎
 * 作成日：2023.04.06
 */

public class ensyu2_4 {
	/*
	 * 関数名：main
	 * メソッドの説明：キーボードから読み込んだ整数値に１０を加えた値と１０を減じた値を出力するプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.06
	 */
	public static void main(String[] args) {

		//キーボードで入力したものを促す
		Scanner standardInput = new Scanner(System.in);

		//整数値の入力を促す
		System.out.print("整数値:");

		//firstNumberに整数値を読み込む
		int firstNumber = standardInput.nextInt();

		//10を加えた値が出力される
		System.out.println("10を加えた値は" + (firstNumber + 10) + "です。");
		//10を減じた値が出力される
		System.out.println("10を減じた値は" + (firstNumber - 10) + "です。");
	}
		}
