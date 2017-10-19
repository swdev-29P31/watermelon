package scrum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ScrumSimulatorTest {

	// TODO ピーナッツは固定
	// TODO ピーナッツに対し何スプリント必要かを算出
	// TODO ベロシティを指定したら何スプリント必要かを算出
	// TODO (1) 何を渡したら(ベロシティ)何が返ってくるのか(ピーナッツすべてを完了させるのに何スプリント必要か)
	// TODO (2) 何を渡したら(ベロシティと、1スプリントの期間)何が返ってくるのか(期間(month)) → Happy end

	// TODO 10/12追加 TODO(1)、(2)メソッドを分ける(10/19にこれやる)
	// 10/12時点では、（1）、(2)をまとめてcalcで計算するように設計されている。

	@Test
	public void 計算ロジックテスト_最終結果() {
		double result = 0;
		ScrumSimulator ss = new ScrumSimulator();

		int velocity = 8;
		double sprintTerm = 0.5;

		// TODO 作成途中(メソッドを分けた後に続きをすること！)
		// result = ss.calc(velocity, sprintTerm);
		result = ss.calc();

		// assertEquals(6.5, result, 0);
		assertEquals(0.0, result, 0);

	}
}
