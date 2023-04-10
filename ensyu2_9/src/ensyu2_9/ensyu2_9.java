package ensyu2_9;
//キーボードから値や文字を入力するための準備
import java.util.Random;
/*
 * クラス名：ensyu2_9
 * 概要：演習2_9クラス
 * 作成者：関口駿太郎
 * 作成日：2023.04.07
 */

public class ensyu2_9 {
	/*
	 * 関数名：main
	 * メソッドの説明：①0.0以上1.0未満の実数値をランダムに生成して表示
	 * ②0.0以上10.0未満の実数値をランダムに生成して表示
	 * ③-1.0以上1.0未満の実数値をランダムに生成して表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.07
	 */
	public static void main(String[] args) {
		
		
		//乱数を生み出すための生成器が新規に作られる
		Random randomNumber = new Random();
	
		// firstNumberに0.0以上1.0未満の実数値を読み込む
		double firstNumber = randomNumber.nextDouble();
		
		//luckyNumberに0から9までの乱数を生成し、読み込む
		int luckyNumber = randomNumber.nextInt(10);
		//secondNumberに0.0以上1.0未満の実数値を読み込む
		double secondNumber = randomNumber.nextDouble();
		
		//unluckyNumberに0か1の乱数を生成し、読み込む
		int unluckyNumber = randomNumber.nextInt(2);
		//tihrdNumberに0.0以上1.0未満の実数値を読み込む
		double tihrdNumber = randomNumber.nextDouble();
		
		//firstNumberに0.0以上1.0未満の実数値が読み込まれ、結果を表示
		System.out.println("0.0以上1.0未満の実数値は" + firstNumber);
		//luckyNumber + secondNumberに実数値が読み込まれ、結果を表示
		System.out.println("0.0以上10.0未満の実数値は" + (luckyNumber + secondNumber));
		//unluckyNumber + tihrdNumberに実数値が読み込まれ、結果を表示
		System.out.println("-1.0以上1.0未満の実数値は" + (unluckyNumber - tihrdNumber));
		
		
		
	}

}
