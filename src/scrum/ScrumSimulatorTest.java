package scrum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

// 前提: 100円ショップで売れるような電卓が完成するには100 PEANUTS 必要
// 前提: WFとScrum共に2ヶ月で終わるシミュレータを作る
//　			人数は考えない（1人で電卓を作る）
// TODO: WFとScrumで同じ期間が返ってくるシミュレータを作る
// 			今の計算ロジックを更新する（設計から考える, 議事録を見なさい）
//			WFの計算が割合を加味しているが、加味しないロジックに変更する
//			100に対してどれ程の設計, 実装, テストが必要かをだすロジックにする
// TODO: Scrumは1monthに100をどれくらい減らせるかをだすロジックにする（設計から考える, 議事録を見なさい）
//			50減らせるようにするので2ヶ月になるようにする
// TODO が終わったらやりたいこと
// 		main関数が欲しい
// 		ロジックが固まったらテストは値を変えない

public class ScrumSimulatorTest {
	private int velocity = 14;
	private double sprintTerm = 0.5;

	@Test
	public void 計算ロジックテスト_最終結果() {
		double result = 0;
		ScrumSimulator ss = new ScrumSimulator();
		double expectedTerm = 6.5;

		result = ss.calcTerm(this.velocity, this.sprintTerm);
		assertEquals(expectedTerm, result, 0);
	}

	@Test
	public void スプリントを計算するテスト_最終結果() {
		int result = 0;
		ScrumSimulator ss = new ScrumSimulator();
		int expextedSprintTime = 13;

		result = ss.calcSprint(this.velocity);
		assertEquals(expextedSprintTime, result);
	}

}
