package ensyu2_10;
//キーボードから値や文字を入力するための準備
import java.util.Scanner;

/*
 * クラス名：ensyu2_10
 * 概要：演習2_10クラス
 * 作成者：関口駿太郎
 * 作成日：2023.04.07
 */

public class ensyu2_10 {
	
	/*
	 * 関数名：main
	 * メソッドの説明：名前と性と名とを個別にキーボード読みこんで、挨拶を行うプログラムを作成
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.07
	 */
	public static void main(String[] args) {
		
		//キーボードで入力したものを表示させるために促す
		Scanner standardInput = new Scanner(System.in);
		
		//カッコ内の"性"をコンソール画面に出力させる
		System.out.print("性:");
		
		//キーボードで打ちこんだ文字がfirstNumberへと代入される
		String firstNumber = standardInput.next();
		
		//カッコ内の"名"をコンソール画面に出力させる
		System.out.print("名:");
		
		//キーボードで打ちこんだ文字がsecondNumberへと代入される
		String secondNumber = standardInput.next();
		
		//"こんにちは" + firstNumber + secondNumber + "さん。"という文字を出力させ、キーボードで打ちこんだ性と名が並ぶ
		System.out.println("こんにちは" + firstNumber + secondNumber + "さん。");
		
		
	}

}
