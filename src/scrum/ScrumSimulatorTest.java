package scrum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ScrumSimulatorTest {

	@Test
	public void 計算ロジックテスト_最終結果() {
		double result = 0;
		ScrumSimulator ss = new ScrumSimulator();

		int velocity = 8;
		double sprintTerm = 0.5;
		double expectedTerm = 6.5;

		result = ss.calcTerm(velocity, sprintTerm);
		assertEquals(expectedTerm, result, 0);
	}

	@Test
	public void スプリントを計算するテスト_最終結果() {
		int result = 0;
		ScrumSimulator ss = new ScrumSimulator();

		int velocity = 8;
		int expextedSprintTime = 13;

		result = ss.calcSprint(velocity);
		assertEquals(expextedSprintTime, result);
	}

}
