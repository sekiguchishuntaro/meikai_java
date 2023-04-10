package ensyu3_5;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：ensyu3_5
* 概要：演習3_5クラス
* 作成者：関口駿太郎
* 作成日：2023.04.10
*/

public class ensyu3_5 {
	/*
	 * 関数名：main
	 * メソッドの説明：5で割った時（その値は5で割り切れます。）、（その値は5で割り切れません。）と表示、正でない場合（正でない値が入力されました。）と表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.10
	 */
	
	public static void main(String[] args) {
		
		//キーボードで入力したものを表示させるために促す
		Scanner standardInput = new Scanner(System.in);
		
		//整数値を出力する
		System.out.print("整数値:");
		
		//firstNumberに入る値を読み込む
		int firstNumber = standardInput.nextInt();
		
		//firstNumberが0より大きい場合
		if (firstNumber > 0)
			
			//firstNumberを５で割った時に割り切れるか、割り切れず余りが出るかを判断
			if (firstNumber % 5 == 0)
				
				//割り切れた場合、（その値は5で割り切れます。）と出力する
				System.out.println ("その値は5で割り切れます。");
			//割り切れなかった場合
			else
				
				//割り切れなかった場合、（その値は5で割り切れません。）と出力する
				System.out.println ("その値は5で割り切れません。");
		//正以外の値が入力された場合
		else
			
			//正以外の値が入力された場合、（正でない値が入力されました。）と出力する
			System.out.println ("正でない値が入力されました。");
				
		
				
	}

}
