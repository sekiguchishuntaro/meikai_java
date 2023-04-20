package ensyu4_27;

//決められた範囲の値をランダムで生成する準備
import java.util.Random;
//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：Ensyu4_27
* 概要：演習4_27クラス
* 作成者：関口駿太郎
* 作成日：2023.04.20
*/

public class Ensyu4_27 {

	/*
	 * 関数名：main
	 * メソッドの説明：数当てゲームに入力回数に制限を設けたプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.12
	 */

	public static void main(String[] args) {
		//コンピューター側が値を決めるために、乱数を生成する準備
		Random randomNumber = new Random();
		//キーボードで打ちこんだ値を出力するために値を取り込む
		Scanner standardInput = new Scanner(System.in);
		//ランダムに0～99の値を生成しnoNameに代入する
		int noName = randomNumber.nextInt(100);
		//("数当てゲームを開始。")と出力する
		System.out.println("数当てゲームを開始。");
		//("0～99の数を当ててください。")と出力する
		System.out.println("0～99の数を当ててください。");
		//firstNumberの値を0で初期化
		int firstNumber = 0;
		//maxNameの値を10で初期化
		int maxNumber = 10;
		//doからwhileまで一度実行
		do {
			//("残り"+ (maxName --) + "回です。いくつでしょう。:")と出力する
			System.out.print("残り" + (maxNumber--) + "回です。いくつでしょう。:");
			//firstNumberに代入された値を読み込む
			firstNumber = standardInput.nextInt();
			//firstNumberの値がnoNameより大きい場合
			if (firstNumber > noName)
				//（もっと小さな数です。）と出力する
				System.out.println("もっと小さな数です。");
			//firstNumberの値がnoNameより小さい場合
			else if (firstNumber < noName)
				//（もっと大きな数です。）と出力する
				System.out.println("もっと大きな数です。");
		//firstNumberの値がnoNameと等しくないかつmaxNumberが0より大きい場合
		} while (firstNumber != noName && maxNumber > 0);
		//firstNumberがnoNameと等しい場合
		if (firstNumber == noName) {
			//("正解です。")と出力する
			System.out.println("正解です。");

		}
		//等しくない場合
		else
			//("正解は" + noName + "でした。")と出力する
			System.out.println("正解は" + noName + "でした。");

	}
}
