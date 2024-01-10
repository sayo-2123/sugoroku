package sugoroku;

import java.util.Random;
import java.util.Scanner;

import constraints.MessageConstraints;
import constraints.NumberConstraints;

public class Sugoroku implements NumberConstraints, MessageConstraints {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		int diceNumber = LOCATION_START;
		int location = LOCATION_START;

		//すごろく開始
		System.out.println(MESSAGE_SUGOROKU_START_STRING);

		while (location < MATH_LENGTH) {
			System.out.println(MESSAGE_PRESS_ENTER);

			// enterを押すのを待つ
			scanner.nextLine();

			//ダイスの目を出し、表示する
			diceNumber = rand.nextInt(DICE_EYE_MAX) + 1;
			System.out.println(diceNumber + MESSAGE_DICE_RESULT);

			//進んだ位置を表示する
			location += diceNumber;
			System.out.println(location + MESSAGE_FORWARD);
			//すごろく盤を表示する
			showSugorokuBorad(location);

			//2,5,8マス目でイベント
			switch (location) {
			case LOCATION_BRIDGE: {
				System.out.println(MESSAGE_BRIDGE);
				location += BRIDGE_FORWARD;
				showSugorokuBorad(location);
				break;
			}
			case LOCATION_HOLE: {
				System.out.println(MESSAGE_HOLE);
				location = LOCATION_START;
				showSugorokuBorad(location);
				break;
			}
			case LOCATION_SNAKE: {
				System.out.println(MESSAGE_SNAKE);
				location -= SNAKE_BACK;
				showSugorokuBorad(location);
				break;
			}
			}

		}
		//着地点判定
		if (location == 10) {
			System.out.println(MESSAGE_GOAL);
		} else {
			System.out.println(MESSAGE_GOAL_FAIL_STRING);
		}
		//終了
		System.out.println(MESSAGE_END);
		scanner.close();
	}

	private static void showSugorokuBorad(int location) {
		for (int i = 0; i <= MATH_LENGTH; i++) {
			if (i == location) {
				System.out.println(MASU_ME);
			} else {
				switch (i) {
				case LOCATION_START: {
					System.out.println(MASU_START_START);
					break;
				}
				case LOCATION_BRIDGE: {
					System.out.println(MASU_BRIDGE);
					break;
				}
				case LOCATION_HOLE: {
					System.out.println(MASU_HOLE);
					break;
				}
				case LOCATION_SNAKE: {
					System.out.println(MASU_SNAKE);
					break;
				}
				case MATH_LENGTH: {
					System.out.println(MASU_GOAL);
					break;
				}

				default:
					System.out.println(MASU_DEFAULT);
				}
			}
		}
	}
}
