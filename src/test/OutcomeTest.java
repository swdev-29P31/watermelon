package test;

import static org.junit.Assert.*;

import org.junit.Test;

import simulator.Outcome;
import simulator.Simulator;

public class OutcomeTest {

	@Test
	public void getVolumeTest() {
		
		int volume = new Outcome().getVolume();		
	    assertEquals(100, volume);

	}

}
