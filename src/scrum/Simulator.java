package scrum;

public class Simulator {
	
	private static final int PEANUTS = 100;
	private static final double SPRINT_PERIOD = 0.5;
	
	public double calc(int velocity) {
		
		return (PEANUTS / velocity) * SPRINT_PERIOD;
	}
}
