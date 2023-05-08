package ensyu5_6;

/*
* クラス名：Ensyu5_6
* 概要：演習5_6クラス
* 作成者：関口駿太郎
* 作成日：2023.04.21
*/

public class Ensyu5_6 {

	/*
	 * 関数名：main
	 * メソッドの説明：0.0から1.0まで0.001単位で増やしていく様子をfloat型とint型で横に並べて表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.21
	 */
	public static void main(String[] args) {
		//("float     int")と出力する
		System.out.println("float     int");
		//("-------------")と出力する
		System.out.println("-------------");
		//sumNumberの値に0.0Fを代入する
		float firstNumber = 0.0F;
		/*
		 * secondNumberの値を0で初期化
		 * secondNumberの値が1000より小さいか等しい場合
		 * secondNumberの値を1ずつ増加させる
		 * firstNumberに0.001Fを加える
		 */
		for (int secondNumber = 0; secondNumber <= 1000; secondNumber++, firstNumber += 0.001F) {
			//("%9.7f %9.7f\n", firstNumber,(float) secondNumber / 1000)と出力する
			System.out.printf("%9.7f %9.7f\n", firstNumber, (float) secondNumber / 1000);
		}

	}

}
