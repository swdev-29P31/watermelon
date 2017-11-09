package scrum;

public class ScrumSimulator {

	// 電卓が完成するには100 PEANUTS 必要
	private static final int PEANUTS = 100;

	public double calcTerm(int velocity, double sprintTerm) {
		return calcSprint(velocity) * sprintTerm;
	}

	public int calcSprint(int velocity) {
		return (int) Math.ceil((double) PEANUTS / (double) velocity);
	}
}
