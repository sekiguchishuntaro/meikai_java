package ensyu3_15;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：Ensyu3_15
* 概要：演習3_15クラス
* 作成者：関口駿太郎
* 作成日：2023.04.11
*/

public class Ensyu3_15 {
	
	/*
	 * 関数名：main
	 * メソッドの説明：二つの整数値を読み込んで降順にソートするプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.11
	 */

	
	public static void main(String[] args) {

		//キーボードで入力したものを表示させるために,新しく取り込む準備
		Scanner standardInput = new Scanner(System.in);

		//キーボードで打ちこんだ値を読み込むための準備段階であり、整数firstNumberを出力する
		System.out.print("整数firstNumber:");

		//キーボードで打ちこんだ整数firstNumberを出力するため、値を取り込む
		int firstNumber = standardInput.nextInt();

		//キーボードで打ちこんだ値を読み込むための準備段階であり、整数secondNumberを出力する
		System.out.print("整数secondNumber:");

		//キーボードで打ちこんだ整数secondNumberを出力するため、値を取り込む
		int secondNumber = standardInput.nextInt();
		
		//firstNumberがsecondNumberより小さい場合、二値の交換を行う
		if (firstNumber < secondNumber) {
			
			//firstNumberの値をdescendingOrderに保存しておく
			int descendingOrder = firstNumber;
			
			//secondNumberの値をfirstNumberに代入する
			firstNumber = secondNumber;
			
			//descendingOrderに保存しておいた最初のfirstNumberの値をsecondNumberに代入する
			secondNumber = descendingOrder;
		}
		
		//firstNumberとsecondNumberの値の交換ができたら、（firstNumber ≦　secondNumberとなるようにソートしました。）と出力する
		System.out.println ("firstNumber ≦　secondNumberとなるようにソートしました。");
		
		//値の交換ができれば、大きいほうはfirstNumberとして出力する
		System.out.println ("整数firstNumberは" + firstNumber + "です。");
		
		//値の交換ができれば、小さいほうの値はsecondNumberとして出力する
		System.out.println ("整数secondNumberは" + secondNumber + "です。");
		
		//
	}

}
