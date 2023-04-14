package ensyu4_2;

//決められた範囲の値をランダムで生成する準備
import java.util.Random;
//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
 * クラス名：Ensyu4_2
 * 概要：演習4_2クラス
 * 作成者：関口駿太郎
 * 作成日：2023.04.12
 */
public class Ensyu4_2 {

	/*
	 * 関数名：main
	 * メソッドの説明：2桁の整数値（10～99）を当てさせる数当てゲームを作成
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
		//noNameが当てるべき数であり、ランダムに10～99の値を生成しnoNameに代入する
		int noName = randomNumber.nextInt(90) + 10;
		//（数当てゲーム開始）と出力する
		System.out.println("数当てゲーム開始");
		//（10～99の数を当ててください。）と出力する
		System.out.println("10～99の数を当ててください。");
		//firstNumberを0で初期化する
		int firstNumber = 0;
		//doからwhileまで一度実行
		do {
			//（いくつですか）と出力する
			System.out.print("いくつですか：");
			//キーボードで打ちこんだ値を取り込む
			firstNumber = standardInput.nextInt();
			//キーボードで打ちこんだ値が当てるべき値より大きい場合
			if (firstNumber > noName)
				//キーボードで打ちこんだ値が当てるべき値より大きい場合は値が近づくように（もっと小さな数です。）と出力する
				System.out.println("もっと小さな数です。");
			//キーボードで打ちこんだ値が当てるべき値より小さい場合
			else if (firstNumber < noName)
				//キーボードで打ちこんだ値が当てるべき値より小さい場合は値が近づくように（もっと大きな数です。）と出力する
				System.out.println("もっと大きな数です。");

		}
		//キーボードで打ちこんだ値と当てるべき値が等しくない場合にtrueとなって繰り返される。
		while (firstNumber != noName);

		//繰り返し値を入力し当たった場合は（正解です。）と出力する
		System.out.println("正解です。");

	}
}
