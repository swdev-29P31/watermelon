package scrum;

import static org.junit.Assert.*;

import org.junit.Test;

import scrum.Simulator;

public class SimulatorTest {

	@Test
	public void test() {
		double result = 0;
		Simulator sm = new Simulator();
		result = sm.calc(100);
		assertTrue(result == 0.5);
	}

	@Test
	public void test2() {
		double result = 0;
		Simulator sm = new Simulator();
		result = sm.calc(50);
		assertTrue(result == 1);
	}
	
}
