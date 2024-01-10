package constraints;

public interface MessageConstraints {
	final static String MESSAGE_SUGOROKU_START_STRING = "◆◆すごろく開始◆◆ ぴたり10マス目にゴールを目指しましょう！";
	final static String MESSAGE_PRESS_ENTER = "Press Enter";
	final static String MESSAGE_DICE_RESULT = "が出ました。";
	final static String MESSAGE_FORWARD = "マス目に進みました。";
	final static String MESSAGE_BRIDGE = "橋に止まりました。1マス進みます。";
	final static String MESSAGE_HOLE = "穴に止まりました。スタート地点に戻ります。";
	final static String MESSAGE_SNAKE = "蛇に遭遇しました。2マス戻ります。";
	final static String MESSAGE_GOAL = "ぴたりゴールしました！";
	final static String MESSAGE_GOAL_FAIL_STRING = "ぴたり10マス目にゴールできませんでした。";
	final static String MESSAGE_END = "◆◆終了します◆◆";

	final static String MASU_ME = "|    ⭐︎ 　 |";
	final static String MASU_START_START = "|  START　|";
	final static String MASU_BRIDGE = "|    橋   |";
	final static String MASU_HOLE = "|    穴   |";
	final static String MASU_SNAKE = "|    蛇   |";
	final static String MASU_GOAL = "|   GOAL　|";
	final static String MASU_DEFAULT = "|       　|";

}
