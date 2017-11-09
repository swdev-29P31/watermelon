package test;

import static org.junit.Assert.*;

import org.junit.Test;

import simulator.WaterfallImplimentation;

public class WaterfallImplimentationTest {

	@Test
	public void getImplimentationPeriodTest() {
		WaterfallImplimentation wd = new WaterfallImplimentation();
		
		double period = wd.calcImplimentationPeriod();
		assertEquals(1.0, period, 0.0);
	}

	@Test
	public void getImplimentationPeriodTestAndSetPeople() {
		WaterfallImplimentation wd = new WaterfallImplimentation();
		
		wd.setImplimentationPeople(8);
		
		double period = wd.calcImplimentationPeriod();
		assertEquals(1.3, period, 0.0);
	}
	
	@Test
	public void getImplimentationPeopleTest() {
		WaterfallImplimentation wd = new WaterfallImplimentation();
		
		int people = wd.calcImplimentationPeople();
		assertEquals(10, people);
	}

	@Test
	public void getImplimentationPeopleTestAndSetPeriod() {
		WaterfallImplimentation wd = new WaterfallImplimentation();
		
		wd.setImplimentationPeriod(2.0);
		
		int people = wd.calcImplimentationPeople();
		assertEquals(5, people);
	}
	
}
