package ensyu3_8;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
* クラス名：ensyu3_8
* 概要：演習3_8クラス
* 作成者：関口駿太郎
* 作成日：2023.04.10
*/

public class ensyu3_8 {
	
	/*
	 * 関数名：main
	 * メソッドの説明：3で割れた場合と割れなかった場合と正ではない値の場合
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.10
	 */
	
	public static void main(String[] args) {

		//キーボードで入力したものを表示させるために促す
		Scanner standardInput = new Scanner(System.in);
		
		//点数という文字を出力する
		System.out.print ("点数:");
		
		//pointNameに入る値を読み込む
		int pointName = standardInput.nextInt();
		
		//値を入力したときに0以上59以下の値であるか判断
		if (pointName >= 0 && pointName <= 59)
			
			//0以上59以下の値である場合、不可と出力する
			System.out.println("不可");
		
		//値を入力したときに60以上69以下の値であるか判断
		else if (pointName >= 60 && pointName <= 69)
			
			//60以上69以下の値である場合、可と出力する
			System.out.println("可");
		
		//値を入力したときに70以上79以下の値であるか判断
		else if (pointName >= 70 && pointName <= 79)
			
			//70以上79以下の値である場合、良と出力する
			System.out.println("良");
			
			//値を入力したときに80以上100以下の値であるか判断
		else if (pointName >= 80 && pointName <= 100)
			
			//80以上100以下の値である場合、優と出力する
			System.out.println("優");
		
		//0以上100以下ではない値の場合
		else
			
			//0以上100以下の値ではない場合は、（不正な点数です。）と出力される
			System.out.println("不正な点数です。");
		
		
		

	}
}
