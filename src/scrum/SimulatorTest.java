package scrum;

import static org.junit.Assert.*;

import org.junit.Test;

import scrum.Simulator;

public class SimulatorTest {

	@Test
	public void test() {
		int result = 0;
		Simulator sm = new Simulator();
		result = sm.calc(100);
		assertTrue(result == 1);
	}

	@Test
	public void test2() {
		int result = 0;
		Simulator sm = new Simulator();
		result = sm.calc(50);
		assertTrue(result == 2);
	}
	
}
