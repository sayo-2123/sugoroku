package sugoroku;

import java.util.Random;
import java.util.Scanner;

public class Sugoroku {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		int diceNumber = 0;
		int location = 0;

		//すごろく開始
		System.out.println("◆◆すごろく開始◆◆");

		while (location < 10) {
			System.out.println("Press Enter");

			// enterを押すのを待つ
			scanner.nextLine();

			//ダイスの目を出し、表示する
			diceNumber = rand.nextInt(6) + 1;
			System.out.println(diceNumber + "が出ました。");

			//進んだ位置を表示する
			location += diceNumber;
			System.out.println(location + "マス目に進みました。");
			
			//2,5,8マス目でイベント
			switch (location) {
			case 2: {
				System.out.println("橋に止まりました。1マス戻ります。");
				location--;
				break;
			}
			case 5: {
				System.out.println("穴に止まりました。スタート地点に戻ります。");
				location = 0;
				break;
			}
			case 8: {
				System.out.println("蛇に遭遇しました。2マス戻ります。");
				location -= 2;
				break;
			}
			}

		}
		//着地点判定
		if (location == 10) {
			System.out.println("ぴたりゴールしました！");
		} else {
			System.out.println("10マス目ゴールできませんでした。orz");
		}
		//終了
		System.out.println("◆◆終了します◆◆");
		scanner.close();
	}
}
