package ensyu2_8;

//java.util.Randomパッケージ内のクラスを読み込み、Random関数を利用できるようにしている
import java.util.Random;
//import java.util.Scannerパッケージ内のクラスを読みこみ、Scannerを利用できるようにしている
import java.util.Scanner;
/*
 * クラス名：ensyu2_8
 * 概要：演習2_8クラス
 * 作成者：関口駿太郎
 * 作成日：2023.04.07
 */
public class ensyu2_8 {
	
	/*
	 * 関数名：main
	 * メソッドの説明:キーボードから読み込んだ整数値をプラスマイナス5の範囲の整数値をランダム生成して表示するプログラム
	 * 引数：
	 * 戻り値：
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.07
	 */
	
	public static void main(String[] args) {
		
		//キーボードで入力したものを表示させるために促す
		Scanner standardInput = new Scanner(System.in);
		
		//乱数を生み出すための生成器が新規に作られる
		Random rand = new Random();
		
		//カッコ内の整数値という文字を表示させる
		System.out.print("整数値:");
		
		//firstNumberにキーボードで打ちこまれた整数を読み込む
		int firstNumber = standardInput.nextInt();
		
		//secondNumberに0.1.2.3.4.5.6.7.8.9.10の乱数を読み込む
		int secondNumber = rand.nextInt(11);
		//secondNumber先ほどの乱数の範囲を-5.-4.-3.-2.-1.0.1.2.3.4.5の乱数に変える
		int thirdNumber;
		thirdNumber  = secondNumber - 5;
		
		//"カッコ内の結果をコンソール画面に出力する
		System.out.println("その値の±５の乱数を生成しました。それは" + (firstNumber + thirdNumber) + "です。" );
		
	
	
	}
	
	}
