package background;

/*game_startメソッドを呼び出してテストするためのクラス*/
public class Driver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		KeyboardInput input = new KeyboardInput();
		int level;
		while (true) {
			try {
				System.out.println("レベルを入力して下さい(0～7)");
				level = Integer.parseInt(input.inputKeyboard());
				if (0 > level || 7 < level) {
					System.out.println("*0～7で入力して下さい");
					continue;
				}
			} catch (Exception e) {
				System.out.println("*数字を入力して下さい");
				continue;
			}
			break;
		}
		GameMain inst = new GameMain(level);
		inst.game_start();
	}
}
