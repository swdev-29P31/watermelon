package scrum;

import static org.junit.Assert.*;

import org.junit.Test;

import scrum.Simulator;

public class SimulatorTest {

	//TODO ピーナッツは固定
	//TODO ピーナッツに対し何スプリント必要かを算出
	//TODO ベロシティを指定したら何スプリント必要かを算出
	//TODO ウォーターフォールが先だよ
	//TODO ウォーターフォールできたよね？
	//TODO 何を渡したら(ベロシティ)何が返ってくるのか(ピーナッツすべてを完了させるのに何スプリント必要か)
	//TODO 何を渡したら(何スプリント必要かと、1スプリントの期間)何が返ってくるのか(期間(month)) → Happy end
	
	@Test
	public void test() {
		double result = 0;
		Simulator sm = new Simulator();
		int velocity = 50;
		result = sm.calc(velocity);
		assertTrue(result == velocity/sm.getStoryPoint());
	}

	@Test
	public void test2() {
		double result = 0;
		Simulator sm = new Simulator();
		int velocity = 25;
		result = sm.calc(velocity);
		assertTrue(result == velocity/sm.getStoryPoint());
	}
	
}
