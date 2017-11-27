package test;

import static org.junit.Assert.*;

import org.junit.Test;

import simulator.WaterfallAcceptance;

public class WaterfallAcceptanceTest {

	@Test
	public void getAcceptancePeriodTest() {
		WaterfallAcceptance wd = new WaterfallAcceptance();

		double period = wd.calcAcceptancePeriod();
		assertEquals(1.6, period, 0.0);
	}

	@Test
	public void getAcceptancePeriodTestAndSetPeople() {
		WaterfallAcceptance wd = new WaterfallAcceptance();

		wd.setAcceptancePeople(10);

		double period = wd.calcAcceptancePeriod();
		assertEquals(1.0, period, 0.0);
	}

	@Test
	public void getAcceptancePeopleTest() {
		WaterfallAcceptance wd = new WaterfallAcceptance();

		int people = wd.calcAcceptancePeople();
		assertEquals(6, people);
	}

	@Test
	public void getAcceptancePeopleTestAndSetPeriod() {
		WaterfallAcceptance wd = new WaterfallAcceptance();

		wd.setAcceptancePeriod(4.0);

		int people = wd.calcAcceptancePeople();
		assertEquals(3, people);
	}

}
