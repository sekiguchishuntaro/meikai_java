package ensyu3_3;

//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
 * クラス名：ensyu3_3
 * 概要：演習3_3クラス
 * 作成者：関口駿太郎
 * 作成日：2023.04.10
 */
public class ensyu3_3 {
	
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
		
		//整数値という文字を出力
		System.out.print("整数値:");
		
		//firstNumberにキーボードで打ちこまれた整数値を読み込む
		int firstNumber = standardInput.nextInt();
		
		//もしもfirstNumberに整数値が代入され、0より大きい場合
		if (firstNumber > 0 )
			
			//firstNumberが0より大きい場合は（その値は正です。）と表示される
			System.out.println("その値は正です。");
		
		//firstNumberに整数値が代入され、0より小さい場合
		else if (firstNumber < 0)
			
			//firstNumberが0より小さい場合は（その値は負です。）と表示される
			System.out.println("その値は負です。");
		
		//firstNumberが0と等しいかどうかを判断する場合
		else if (firstNumber == 0)
			
			//firstNumberが0と等しい場合は、（その値は0です。）と表示される
			System.out.println("その値は0です。");
			
		//最後にelse ifを入れても同じ処理がされているため、結果は変わらない。
	}

}
