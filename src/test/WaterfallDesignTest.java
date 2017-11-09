package test;

import static org.junit.Assert.*;

import org.junit.Test;

import simulator.WaterfallDesign;

public class WaterfallDesignTest {

	@Test
	public void getDesignPeriodTest() {
		WaterfallDesign wd = new WaterfallDesign();
		
		double period = wd.calcDesignPeriod();
		assertEquals(2.0, period, 0.0);
	}

	@Test
	public void getDesignPeriodTestAndSetPeople() {
		WaterfallDesign wd = new WaterfallDesign();
		
		wd.setDesignPeople(6);
		
		double period = wd.calcDesignPeriod();
		assertEquals(1.0, period, 0.0);
	}
	
	@Test
	public void getDesignPeopleTest() {
		WaterfallDesign wd = new WaterfallDesign();
		
		int people = wd.calcDesignPeople();
		assertEquals(3, people);
	}

	@Test
	public void getDesignPeopleTestAndSetPeriod() {
		WaterfallDesign wd = new WaterfallDesign();
		
		wd.setDesignPeriod(4.0);
		
		int people = wd.calcDesignPeople();
		assertEquals(2, people);
	}
	
}
