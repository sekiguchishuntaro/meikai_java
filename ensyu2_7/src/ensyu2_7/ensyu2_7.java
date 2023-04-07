package ensyu2_7;

//java.util.Randomパッケージを読み込み、Random関数を利用できるようにしている
import java.util.Random;
/*
 * クラス名：ensyu2_7
 * 概要：演習2_7クラス
 * 作成者：関口駿太郎
 * 作成日：2023/04/06
 */

public class ensyu2_7 {
	/*
	 * 関数名：main
	 * メソッドの説明：①1桁の正の整数値（1以上9以下の値）をランダム生成
	 * ②１桁の負の整数値（-9以上-1以下の値）をランダム生成
	 * ③２桁の正の整数値（10以上99以下の値）をランダム生成
	 * 引数：
	 * 戻り値：
	 * 作成者：関口駿太郎
	 * 作成日：2023.04.06
	 */
	
	
	public static void main(String[] args) {
		
		//乱数を生み出すための生成器が新規に作られる。
		
		Random rand = new Random();
		
		//１以上９以下の1桁の整数値をランダムで生成
		int firstluckyNumber = rand.nextInt(9)+1;
		
		//-9以上-1以下の1桁の負の整数値をランダムで生成
		int secondLuckyNumber = rand.nextInt(9)-9;
		
		//10以上99以下の2桁の整数値をランダム生成
		int sihrdLuckyNumber = rand.nextInt(100)-10;
		
		//上記でランダム生成された1以上9以下の値を出力する
		System.out.println(firstluckyNumber);
		
		//上記でランダム生成された-9以上-1以下の値を出力する
		System.out.println(secondLuckyNumber);
		
		//上記でランダム生成された10以上99以下の値を出力する
		System.out.println(sihrdLuckyNumber);
		
				
		
	}

}
