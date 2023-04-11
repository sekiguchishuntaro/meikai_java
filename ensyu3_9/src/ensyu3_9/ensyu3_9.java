package ensyu3_9;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：ensyu3_9
* 概要：演習3_9クラス
* 作成者：関口駿太郎
* 作成日：2023.04.10
*/


public class ensyu3_9 {
	
	/*
	 * 関数名：main
	 * メソッドの説明：二つの実数値を読み込んで、大きいほうの値を表示するプログラム
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.10
	 */
	
	public static void main(String[] args) {

		//キーボードで入力したものを表示させるために促す
		Scanner standardInput = new Scanner(System.in);
		
		//実数firstNumberをコンソール画面に出力する
		System.out.print("実数firstNumber:");
		
		//実数のためdouble型で、firstNumberに入った値を取り込む
		double firstNumber = standardInput.nextDouble();
		
		//実数secondNumberをコンソール画面に出力
		System.out.print("実数secondNumber:");
		
		//実数のためdouble型で、secondNumberに入った値を取り込む
		double secondNumber = standardInput.nextDouble();
		
		//大きい値を出力させるため宣言
		double bigNumber ;
		
		//firstNumberがsecondNumberより大きい場合
		if (firstNumber > secondNumber)
			
			//firstNumberのほうが大きい場合、bigNumberとして読み込まれる
			bigNumber = firstNumber;
		
		//secondNumberがfirstNumberより大きい場合
		else
			
			//secondNumberのほうが大きい場合、bigNumberとして読み込まれる
			bigNumber = secondNumber;
		
		//firstNumberとsecondNumberのどちらかが大きい場合、(大きいほうの値は" + bigNumber + "です。)と出力される
		
		System.out.println ("大きいほうの値は" + bigNumber + "です。");
			

	}
}
