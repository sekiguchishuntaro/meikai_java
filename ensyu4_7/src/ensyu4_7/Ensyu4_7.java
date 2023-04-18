package ensyu4_7;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
 * クラス名：Ensyu4_7
 * 概要：演習4_7クラス
 * 作成者：関口駿太郎
 * 作成日：2023.04.14
 */
public class Ensyu4_7 {

	/*
	 * 関数名：main
	 * メソッドの説明：読み込んだ値の個数だけ記号文字を表示するプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.14
	 */
	public static void main(String[] args) {
		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);
		//何個表示しますかと出力
		System.out.print("何個表示しますか:");
		//firstNumberに入る値を取り込む
		int firstNumber = standardInput.nextInt();
		//secondnumberの値を1で初期化
		int secondNumber = 1;
		//firstNumberの値が0より小さいか等しい場合
		if (firstNumber <= 0) {
			//("範囲外の値です")と出力する
			System.out.print ("範囲外の値です。");
		}
		//secondNumberがfirstNumberより小さいか等しい場合
		while (secondNumber <= firstNumber) { 
			//secondNumberの値を2で割った時に余りが0の場合
			if (secondNumber % 2 == 0) {
				//余りが0の場合*を出力
				System.out.print("*");
			}
			//余りが0以外の場合
			else 
				//余りが0以外であれば、+を出力
				System.out.print("+");
			//secondNumberの値を1ずつ増やす
			secondNumber++;
			
			
		}//改行する
		System.out.println ();
		
	}

	}
