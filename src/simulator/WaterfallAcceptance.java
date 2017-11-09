package simulator;

import java.math.BigDecimal;

public class WaterfallAcceptance {
	
	private int acceptanceVolume = 100;
	private int acceptancePeople = 6;		
	private double acceptancePeriod = 1.5;

	public double calcAcceptancePeriod() {
		
		int da = WaterfallAbility.getAcceptance();
		this.acceptancePeriod = (double)this.acceptanceVolume / (double)(da * this.acceptancePeople);
				
		return new BigDecimal(String.valueOf(this.acceptancePeriod)).setScale(1, BigDecimal.ROUND_UP).doubleValue();
	}


	public int calcAcceptancePeople() {
		int da = WaterfallAbility.getAcceptance();
		
		this.acceptancePeople = (int)Math.ceil((double)this.acceptanceVolume / (double)(da * this.acceptancePeriod));
				
		return this.acceptancePeople;
	}

	public int getAcceptancePeople() {
		return this.acceptancePeople;
	}

	public void setAcceptancePeople(int acceptancePeople) {
		this.acceptancePeople = acceptancePeople;
	}


	public double getAcceptancePeriod() {
		return this.acceptancePeriod;
	}

	public void setAcceptancePeriod(double acceptancePeriod) {
		this.acceptancePeriod = acceptancePeriod;
	}
	
}
