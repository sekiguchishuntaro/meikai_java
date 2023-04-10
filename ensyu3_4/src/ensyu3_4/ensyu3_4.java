package ensyu3_4;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：ensyu3_3
* 概要：演習3_3クラス
* 作成者：関口駿太郎
* 作成日：2023.04.10
*/

public class ensyu3_4 {
	/*
	 * 関数名：main
	 * メソッドの説明：研修本の例題の最後の部分のelseをelse if(n == 0)に変更した場合のプログラム作成
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.10
	 */
	
	public static void main(String[] args) {
		
		//キーボードで入力したものを表示させるために促す
		Scanner standardInput = new Scanner(System.in);
		
		//変数firstNumberを作成し出力する
		System.out.print("変数firstNumber:");
		
		//firstNumberに入る値を読み込む
		double firstNumber = standardInput.nextDouble();
		
		//変数secondNumberを作成し出力する
		System.out.print("変数secondNumber:");
		
		//secondNumberに入る値を読み込む
		double secondNumber = standardInput.nextDouble();
		
		//firstNumberがsecondNumberより大きい場合
		if(firstNumber > secondNumber)
			
			//firstNumberがsecondNumberより大きい場合は、（firstNumberのほうが大きいです。）と表示される
			System.out.println("firstNumberのほうが大きいです。");
		
		//firstNumberがsecondNumberより小さい場合
		else if(firstNumber < secondNumber)
			
			//firstNumberがsecondNumberより小さい場合は、（secondNumberのほうが大きいです。）と表示される
			System.out.println("secondNumberのほうが大きいです。");
		
		//firstNumberがsecondNumber大きくも小さくもない場合
		else
			
			//firstNumberがsecondNumberより大きくも小さくもない場合は、（firstNumberとsecondNumberは同じ値です。）と表示される
			System.out.println("firstNumberとsecondNumberは同じ値です。");
		
		
		
		

	}
	
}
