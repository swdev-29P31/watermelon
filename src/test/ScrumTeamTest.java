package test;

import static org.junit.Assert.*;

import org.junit.Test;

import simulator.ScrumTeam;

public class ScrumTeamTest {

	//TODO getPeriodメソッドが復活したら、コメントを外す
	//@Test
	//public void getPeriodTest() {
		
		//double period = new ScrumTeam().getPeriod();		
	    //assertEquals(4.5, period, 0.0);
	//}
	
	@Test
	public void CalcTotalPreiodTest() {
		
		ScrumTeam st = new ScrumTeam();
		double period = st.calcTotalPeriod();
		
	    assertEquals(4.5, period, 0.0);
	}
	
	@Test
	public void CalcTotalPreiodAndSetSprintPeriodTest() {
		
		ScrumTeam st = new ScrumTeam();
		
		st.setSprintPeriod(1.0);
		
		double period = st.calcTotalPeriod();
		
	    assertEquals(9.0, period, 0.0);
	}
	
	@Test
	public void CalcVerocityTest(){
		
		ScrumTeam st = new ScrumTeam();
		int velocity = st.calcVelocity();
		
		assertEquals(12, velocity);		
	}	

	@Test
	public void CalcVerocityAndSetTotalPeriodTest(){
		
		ScrumTeam st = new ScrumTeam();
		
		st.setTotalPeriod(6.0);
		
		int velocity = st.calcVelocity();
		
		assertEquals(9, velocity);		
	}	
}
