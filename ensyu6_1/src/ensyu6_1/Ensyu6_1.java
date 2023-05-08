package ensyu6_1;

/*
* クラス名：Ensyu6_1
* 概要：演習6_1クラス
* 作成者：関口駿太郎
* 作成日：2023.04.21
*/

public class Ensyu6_1 {
	
	/*
	 * 関数名：main
	 * メソッドの説明：要素型double型で要素数が5の配列を生成し、その全要素の値を表示するプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.21
	 */
	public static void main(String[] args) {
		//配列の宣言
		double[] firstNumber = new double [5];
		//firstNumber[0]に0.0を代入
		firstNumber[0] = 0.0;
		//firstNumber[1]に0.1を代入
		firstNumber[1] = 0.1;
		//firstNumber[2]に0.2を代入
		firstNumber[2] = 0.2;
		//firstNumber[3]に0.3を代入
		firstNumber[3] = 0.3;
		//firstNumber[4]に0.4を代入
		firstNumber[4] = 0.4;
		
		//("firstNumber["+ 0 + "] =" + firstNumber[0])と出力する
		System.out.println ("firstNumber["+ 0 + "] =" + firstNumber[0]);
		//("firstNumber["+ 1 + "] =" + firstNumber[1])と出力する
		System.out.println ("firstNumber["+ 1 + "] =" + firstNumber[1]);
		//("firstNumber["+ 2 + "] =" + firstNumber[2])と出力する
		System.out.println ("firstNumber["+ 2 + "] =" + firstNumber[2]);
		//("firstNumber["+ 3 + "] =" + firstNumber[3])と出力する
		System.out.println ("firstNumber["+ 3 + "] =" + firstNumber[3]);
		//("firstNumber["+ 4 + "] =" + firstNumber[4])と出力する
		System.out.println ("firstNumber["+ 4 + "] =" + firstNumber[4]);

	}


}
