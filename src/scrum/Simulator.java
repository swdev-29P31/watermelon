package scrum;

public class Simulator {
	
	private static final int STORY_POINT = 100;
	private static final double SPRINT_PERIOD = 0.5;
	
	public double calc(int velocity) {
		
		return (STORY_POINT / velocity) * SPRINT_PERIOD;
	}
}
