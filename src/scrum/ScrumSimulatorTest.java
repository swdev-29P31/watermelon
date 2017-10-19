package scrum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ScrumSimulatorTest {
	private int velocity = 8;
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
