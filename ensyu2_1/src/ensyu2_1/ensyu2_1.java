package ensyu2_1;
/*
 * クラス名：ensyu2_1
 * 概要：演習2_1クラス
 * 作成者：関口駿太郎
 * 作成日：2023.04.06
 */
public class ensyu2_1 {
	/*
	 * 関数名：main
	 * メソッドの説明：小数部をもつ実数値をxとyに代入するように変更したときの結果
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.06
	 */
	public static void main(String[] args) {
		//firstNumberはint型の変数
		int firstNumber;
		//secondNumberはint型の変数
		int secondNumber;
		//firstNumberの値は本来変数を入れるが、今回は小数部をもつ実数値
		firstNumber = 6.3;
		//secondNumberの値は本来変数を入れるが、今回は小数部をもつ実数値
		secondNumber = 1.8;
		
		//firstNumberの値を表示する
		System.out.println("firstNumberの値は"+ firstNumber +"です。");
		//secondNumberの値を表示する
		System.out.println("secondNumberの値は" + secondNumber +"です。");
		//カッコ内のfirstNumberとsecondNumberの合計を出力する
		System.out.println("合計は" +(firstNumber + secondNumber) +"です。");
		//カッコ内のfirstNumberとsecondNumberの平均を出力する
		System.out.println("平均は" +(firstNumber + secondNumber)/2+"です。");
	}

}
