package waterfall;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimulatorTest {

	//TODO まずはシミュレートするためのものをつくろう！
	//TODO 工程で分ける（各工程の人月と人数をパラメータ化）
	//TODO 最後に足し合わせる
	//TODO 設計、製造、テストの3フェーズをそれぞれ作る
	//TODO ウォーターフォール→スクラムの順で、2017.10.12に設計から作る
	//TODO　設計に何を渡したら(1人月当たり何ピーナッツ設計できる＋人数)何が返ってくるのか(期間（month）)
	//TODO　製造に何を渡したら(1人月当たり何ピーナッツ製造できる＋人数)何が返ってくるのか(期間（month）)
	//TODO　テストに何を渡したら(1人月当たり何ピーナッツテストできる＋人数)何が返ってくるのか(期間（month）)
	//TODO すべて足し合わせる → Happy end
	//TODO 次スクラム
	
	@Test
	public void testMain() {
		int result = 0;
		Simulator sm = new Simulator();
		result = sm.calc(50);
		assertTrue(result == 1);
	}
	
	@Test
	public void testMain2() {
		int result = 0;
		Simulator sm = new Simulator();
		result = sm.calc(25);
		assertTrue(result == 2);
	}

}
