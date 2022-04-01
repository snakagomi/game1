package game1;
import java.util.Random;
import java.util.Scanner;
import Math;
public class Game1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		printExplanation();

		int finish = 0;

		do {
			System.out.println("ゲームを開始します。");
			Random RandObj = new Random();
			int target = RandObj.nextInt(100) ;
			System.out.println("ターゲットが設定されました。");
//			System.out.println(target);
			int x = 0;
			while (true) {
				System.out.println("位置は？");
				int searchPlace = scan.nextInt();
				System.out.println("範囲は？");
				int searchRange = scan.nextInt();
				int difference = target - searchPlace;
				int differenceAbsolute = Math.abs(difference);
				if ( differenceAbsolute <= searchRange) {
					System.out.println("ヒットしました。");
				}else {
					System.out.println("はずれました。");
				}
				x ++;
				if (differenceAbsolute == 0) {
					break;
				}
			}
			System.out.println("おめでとう！" + x +"回目で正解です！");
			System.out.println("もう一度やりますか？（1=Yes; 0=No!）");
			finish = scan.nextInt();
		}while(finish == 1);
		if (finish == 0) {
			System.out.println("ありがとうございました");
		}

	}

	public static void printExplanation() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("☆レーダー☆");
		System.out.println("ターゲットとして 0～100 のうち１つの数が設定されます。探索する位置と範囲を入");
		System.out.println("力してターゲットを見つけてください。");
		System.out.println("ターゲットと探索位置の差が探索範囲以下であればヒットです。探索範囲より大きけ");
		System.out.println("れば、はずれです。");
		System.out.println("探索位置とターゲットが一致すれば正解です。");
		System.out.println("----------------------------------------------");
	}

}
