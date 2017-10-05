package scrum;

public class Simulator {
	
	private static int storyPoint = 100;
	
	public int calc(int velocity) {
		
		return storyPoint / velocity;
	}
}
