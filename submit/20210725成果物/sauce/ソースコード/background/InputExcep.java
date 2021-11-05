package background;

/*例外発生を通知するクラス*/
public class InputExcep extends Exception {

	/*コンストラクタ*/
	InputExcep(int teban) {
		if (teban == 1) {//GUI化したらこれが出ることはないはず
			System.out.println("規定値外の値が入力されました");
			System.out.println("↑GUI化したらこれは出ないと思う");
		} else {//CPU部分がちゃんと動かなかったときに出る
			System.out.println("CPU部分が正常に動作しませんでした");
			System.out.println("ゲーム続行不能");
			System.exit(1);
		}
	}

}
