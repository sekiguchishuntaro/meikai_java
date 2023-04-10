package ensyu3_2;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;
/*
 * クラス名：ensyu3_2
 * 概要：演習3_2クラス
 * 作成者：関口駿太郎
 * 作成日：2023.04.10
 */
public class ensyu3_2 {
	/*
	 * 関数名：main
	 * メソッドの説明：二つの正の整数値を読み込んで、後者が前者の約数である場合とそうでない場合を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.10
	 */
	
	public static void main(String[] args) {
		
		//キーボードで入力したものを表示させるために促す
		Scanner standardInput = new Scanner(System.in);
		
		//キーボードで打ちこんだ整数firstNumberを出力する
		System.out.print("整数firstNumber:");
		
		//キーボードから打ちこんだ整数をfirstNumberを取り込む
		int firstNumber = standardInput.nextInt();
		
		//キーボードで打ちこんだ整数secondNumberを出力する
		System.out.print("整数secondNumber:");
		
		//キーボードから打ちこんだ整数をsecondNumberを取り込む
		int secondNumber = standardInput.nextInt();
		
		//firstNumberをsecondNumberで割った時に余りがでるか、出ないかを計算する
		if (firstNumber % secondNumber == 0 )
			
			//計算結果によって、余りが出なかった場合(secondNumberはfirstNumberの約数です。)と表示される
			System.out.println("secondNumberはfirstNumberの約数です。");
		//そうじゃなければという意味
		else
			//計算結果によって、余りが出てしまった場合(secondNumberはfirstNumberの約数ではありません。)と表示される
			System.out.println("secondNumberはfirstNumberの約数ではありません。");
	}
	

}
