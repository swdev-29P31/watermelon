package scrum;

public class Simulator {
		
	private static final int PEANUTS = 100;
	//1�s�[�i�b�c 2�X�g�[���[�|�C���g
	private static final int STORY_POINT = 2;
	private static final double SPRINT_PERIOD = 0.5;
	
	public double calc(int velocity) {
		
		return (PEANUTS / STORY_POINT / velocity) * SPRINT_PERIOD;
	}
		
	public int getStoryPoint(){
		return STORY_POINT;
	}
}
