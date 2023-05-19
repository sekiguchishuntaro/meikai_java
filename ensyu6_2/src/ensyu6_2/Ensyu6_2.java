package ensyu6_2;

/*
* クラス名：Ensyu6_2
* 概要：演習6_2クラス
* 作成者：関口駿太郎
* 作成日：2023.04.21
*/

public class Ensyu6_2 {
	
	/*
	 * 関数名：main
	 * メソッドの説明：要素型がint型で要素数が5の配列の要素に対して、先頭から5.4.3.2.1を代入して表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.21
	 */
	public static void main(String[] args) {
		//ORIGINAL_NUMBERに5を代入	
		final int ORIGINAL_NUMBER = 5;
		//配列の宣言
		int[] firstNumber = new int [5];
		/*
		 * secondNumberの値を0で初期化
		 * secondNumberの値がfirstNumberの値より小さいか等しい場合
		 * secondNumberの値を1ずつ増加させる
		 */
		for (int secondNumber = 0; secondNumber < firstNumber.length; secondNumber ++)
			//firstNumber[secondNumber]にORIGINAL_NUMBER - secondNumberの値を代入
			firstNumber[secondNumber] = ORIGINAL_NUMBER - secondNumber;
		/*
		 * secondNumberの値を0で初期化
		 * secondnumberの値がfirstNumberより小さいか等しい場合
		 * secondnumberの値を1ずつ増加させる
		 */
		for (int secondNumber = 0; secondNumber < firstNumber.length; secondNumber ++)
			//("firstNumber[" + secondNumber + "] = "+ firstNumber[secondNumber])と出力する
			System.out.println ("firstNumber[" + secondNumber + "] = "+ firstNumber[secondNumber]);

	}
}
