package ensyu6_7;

//ランダムで値を生成する準備
import java.util.Random;
//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：Ensyu6_7
* 概要：演習6_7クラス
* 作成者：関口駿太郎
* 作成日：2023.04.24
*/

public class Ensyu6_7 {

	/*
	 * 関数名：main
	 * メソッドの説明：線形探索で、最も末尾側に位置する要素を見つけるプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.24
	 */
	public static void main(String[] args) {

		Random randomNumber = new Random();
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//FIRST_NUMBERの値を12で初期化
		final int FIRST_NUMBER = 12;
		//FIRST_VALUEの値を10で初期化
		final int FIRST_VALUE = 10;
		//secondNumberの配列を宣言
		int[] secondNumber = new int[FIRST_NUMBER];
		/*
		 * thirdNumberの値を0で初期化
		 * thirdNumberの値がFIRST_NUMBERの値より小さい場合
		 * thirdNumberの値を1ずつ増加させる
		 */
		for (int thirdNumber = 0; thirdNumber < FIRST_NUMBER; thirdNumber++) 
			//要素の値を0から9までの乱数を生成し、secondNumber[thirdNumber]に代入
			secondNumber[thirdNumber] = randomNumber.nextInt(FIRST_VALUE);
		//("配列secondNumberの全要素の値\n{ ")を出力する
		System.out.print("配列secondNumberの全要素の値\n{ ");
		/*
		 * thirdNumberの値を0で初期化
		 * thirdNumberの値がFIRST_NUMBERの値より小さい場合
		 * thirdNumberの値を1ずつ増加させる
		 */
		
		for (int thirdNumber = 0; thirdNumber < FIRST_NUMBER; thirdNumber++) 
			//(secondNumber[thirdNumber] + " ")を出力する
			System.out.print (secondNumber[thirdNumber] + " ");
		//("}")を出力する
		System.out.println ("}");
		
		//("探す数値：")を出力する
		System.out.print("探す数値：");
		//keyNumberに代入された値を読み込む
		int keyNumber = standardInput.nextInt();
		//fourNumberの値を0で初期化
		int fourNumber = 0;
		/*
		 * FIRST_NUMBER - 1をfourNumberに代入
		 * fourNumberの値は0より大きいか等しい場合
		 * fourNumberの値を1ずつ減らしていく
		 */
		for (fourNumber = FIRST_NUMBER - 1; fourNumber >= 0; fourNumber--) {
			//(secondNumber[fourNumber]の値とkeyNumberの値が等しい場合
			if (secondNumber[fourNumber] == keyNumber) {
				//for文を抜け出す
				break;
			}
		}
		//fourNumberの値が0より大きいか等しい場合
		if (fourNumber >= 0) {
			//("それはsecondNumber[" + fourNumber + "]にあります。")と出力する
			System.out.println("それはsecondNumber[" + fourNumber + "]にあります。");
		}
		//大きくも等しくもない場合
		else {
			//("それはありません。")と出力する
			System.out.println("それはありません。");
		}
	}
}
