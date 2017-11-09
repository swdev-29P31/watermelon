package simulator;

import java.math.BigDecimal;

public class WaterfallImplimentation {
	
	private int implimentationVolume = 100;
	private int implimentationPeople = 10;
	private double implimentationPeriod = 1.0;	

	public double calcImplimentationPeriod() {
		
		int da = WaterfallAbility.getImplimentation();
		
		this.implimentationPeriod = (double)this.implimentationVolume / (double)(da * this.implimentationPeople);
				
		return new BigDecimal(String.valueOf(this.implimentationPeriod)).setScale(1, BigDecimal.ROUND_UP).doubleValue();
	}


	public int calcImplimentationPeople() {
		int da = WaterfallAbility.getImplimentation();
		
		this.implimentationPeople = (int)Math.ceil((double)this.implimentationVolume / (double)(da * this.implimentationPeriod));
				
		return this.implimentationPeople;
	}

	public int getImplimentationPeople() {
		return this.implimentationPeople;
	}

	public void setImplimentationPeople(int implimentationPeople) {
		this.implimentationPeople = implimentationPeople;
	}


	public double getImplimentationPeriod() {
		return this.implimentationPeriod;
	}

	public void setImplimentationPeriod(double implimentationPeriod) {
		this.implimentationPeriod = implimentationPeriod;
	}

}
