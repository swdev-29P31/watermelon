package waterfall;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WaterfallSimulatorTest {
	private int designPeanuts = 10;
	private int makePeanuts = 10;
	private int testPeanuts = 10;
	private int designPeople = 2;
	private int makePeople = 2;
	private int testPeople = 2;

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
		assertEquals(5.0, result, 0);
	}

	@Test
	public void 設計フェーズの計算ロジックテスト_最終結果() {
		double result = 0;
		DesignPhase design = new DesignPhase();

		result = design.calc(this.designPeanuts, this.designPeople);
		assertEquals(2.025, result, 0.0001);
	}

	@Test
	public void 製造フェーズの計算ロジックテスト_最終結果() {
		double result = 0;
		MakePhase make = new MakePhase();

		result = make.calc(this.makePeanuts, this.makePeople);
		assertEquals(1.305, result, 0.0001);
	}

	@Test
	public void テストフェーズの計算ロジックテスト_最終結果() {
		double result = 0;
		TestPhase test = new TestPhase();

		result = test.calc(this.testPeanuts, this.testPeople);
		assertEquals(1.67, result, 0);
	}
}
