package simulator;

public class ScrumTeam {
	
	private double totalPeriod = 4.5; 
	private double sprintPeriod = 0.5;
	private int velocity = 12;
	
	public double calcTotalPeriod() {
		
		int volume = new Outcome().getVolume(); 
		
		double mustSprint = Math.ceil((double)volume / (double)this.velocity);
		this.totalPeriod = mustSprint * this.sprintPeriod;
		
		return this.totalPeriod;
	}	
	
	public int calcVelocity() {
		
		int volume = new Outcome().getVolume();
		
		double mustSprint = this.totalPeriod / this.sprintPeriod;
		this.velocity = (int)(Math.ceil((double)volume / mustSprint));
		
		return this.velocity;
	}
		
	public double getSprintPeriod() {
		return this.sprintPeriod;
	}

	public void setSprintPeriod(double sprintPeriod) {
		this.sprintPeriod = sprintPeriod;
	}
	
	public double getTotalPeriod() {
		return this.totalPeriod;
	}
	
	public void setTotalPeriod(double totalPeriod) {
		this.totalPeriod = totalPeriod;
	}
}
