package ensyu6_3;

/*
* クラス名：Ensyu6_3
* 概要：演習6_3クラス
* 作成者：関口駿太郎
* 作成日：2023.04.21
*/

public class Ensyu6_3 {
	
	/*
	 * 関数名：main
	 * メソッドの説明：要素型がdouble型で要素数が5の配列の要素に対して、先頭から1.1,2.2,3.3,4.4,5.5を代入して表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.21
	 */
	public static void main(String[] args) {
		//配列の宣言
		double[] firstNumber  = new double [5];
		/*
		 * secondNumberの値を0で初期化
		 * secondNumberの値がfirstNumberより小さい場合
		 * secondnumberの値を１ずつ増加させる
		 */
		for (int secondNumber = 0; secondNumber < firstNumber.length; secondNumber ++) {
			//secondNumber + 1の値をthirdNumberに代入
			int thirdNumber = secondNumber + 1;
			//(thirdNumber * 11)の値をfourNumberに代入
			double fourNumber = (thirdNumber * 11);
			//(double)(fourNumber/ 10)の値をfirstNumber[secondNumber]に代入
			firstNumber[secondNumber] = (double)(fourNumber/ 10);
			//("firstNumber[" + secondNumber + "] =" + firstNumber[secondNumber])を出力する
			System.out.println("firstNumber[" + secondNumber + "] =" + firstNumber[secondNumber]);

		 }
	}
}
