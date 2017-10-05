package waterfall;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimulatorTest {

	@Test
	public void testMain() {
		int result = 0;
		Simulator sm = new Simulator();
		result = sm.calc(50);
		assertTrue(result == 1);
	}
	
	@Test
	public void testMain2() {
		int result = 0;
		Simulator sm = new Simulator();
		result = sm.calc(25);
		assertTrue(result == 2);
	}

}
