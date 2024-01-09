package sugoroku;

public class temp {
	public static void main(String[] args) {
//		System.out.println("|  START　|");
//		System.out.println("|    ★ 　 |");
//		System.out.println("|    橋   |");
//		System.out.println("|       　|");
//		System.out.println("|       　|");
//		System.out.println("|    ●  　|");
//		System.out.println("|       　|");
//		System.out.println("|       　|");
//		System.out.println("|    蛇   |");
//		System.out.println("|       　|");
//		System.out.println("|   GOAL　|");
		
		for (int i = 0; i <= 10; i++) {
			switch (i) {
			case 0: {
				System.out.println("|  START　|");
				break;
			}
			case 2: {
				System.out.println("|    橋   |");
				break;
			}
			case 5: {
				System.out.println("|    穴   |");
				break;
			}
			case 8: {
				System.out.println("|    蛇   |");
				break;
			}
			case 10: {
				System.out.println("|   GOAL　|");
				break;
			}

			default:
				System.out.println("|       　|");
			}
			}
		}
	}
