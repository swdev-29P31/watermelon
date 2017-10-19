package waterfall;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WaterfallSimulatorTest {
	// 相対大変さ
	private int designPeanuts = 200;
	private int makePeanuts = 10;
	private int testPeanuts = 18;

	// 3人の感覚 最多は実装,
	private int designPeople = 1;
	private int makePeople = 1;
	private int testPeople = 1;

	@Test
	public void 計算ロジックテスト_最終結果() {
		double result = 0;
		WaterfallSimulator ws = new WaterfallSimulator();

		ws.setDesignPeanuts(this.designPeanuts);
		ws.setDesignPeople(this.designPeople);

		ws.setMakePeanuts(this.makePeanuts);
		ws.setMakePeople(this.makePeople);

		ws.setTestPeanuts(this.testPeanuts);
		ws.setTestPeople(this.testPeople);

		result = ws.calc();
		assertEquals(2.167, result, 0.001);
	}

	@Test
	public void 設計フェーズの計算ロジックテスト_最終結果() {
		double result = 0;
		DesignPhase design = new DesignPhase();

		result = design.calc(this.designPeanuts, this.designPeople);
		assertEquals(0.5, result, 0.001);
	}

	@Test
	public void 製造フェーズの計算ロジックテスト_最終結果() {
		double result = 0;
		MakePhase make = new MakePhase();

		result = make.calc(this.makePeanuts, this.makePeople);
		assertEquals(0.261, result, 0.001);
	}

	@Test
	public void テストフェーズの計算ロジックテスト_最終結果() {
		double result = 0;
		TestPhase test = new TestPhase();

		result = test.calc(this.testPeanuts, this.testPeople);
		assertEquals(0.556, result, 0.001);
	}
}
