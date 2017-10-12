package waterfall;

import static org.junit.Assert.*;

import org.junit.Test;

public class WaterfallSimulatorTest {
	
	@Test
	public void 計算ロジックテスト_最終結果() {
		double result = 0;
		WaterfallSimulator ws = new WaterfallSimulator();
		
		ws.setDesignPeanuts(10);
		ws.setDesignPeople(2);
		
		ws.setMakePeanuts(10);
		ws.setMakePeople(2);
		
		ws.setTestPeanuts(10);
		ws.setTestPeople(2);
				
		result = ws.calc();		
		assertEquals(5.0, result, 0);
	}
	
	@Test
	public void 設計フェーズの計算ロジックテスト_最終結果() {
		double result = 0;
		Design design = new Design();
		
		int designPeanuts = 10;
		int people = 2;
		
		result = design.calc(designPeanuts, people);
		assertTrue(result == 1.5);
	}

	@Test
	public void 製造フェーズの計算ロジックテスト_最終結果() {
		double result = 0;
		Make make = new Make();
		
		int makePeanuts = 10;
		int people = 2;
		
		result = make.calc(makePeanuts, people);
		assertEquals(2.0, result, 0);
	}
	
	@Test
	public void テストフェーズの計算ロジックテスト_最終結果() {
		double result = 0;
		waterfall.Test test = new waterfall.Test();
		
		int testPeanuts = 10;
		int people = 2;
		
		result = test.calc(testPeanuts, people);
		assertEquals(1.5, result, 0);
	}
}
