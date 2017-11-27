package simulator;

import java.math.BigDecimal;

public class WaterfallDesign {

	private int designVolume = 100;
	private int designPeople = 3;
	private double designPeriod = 1.9;

	public double calcDesignPeriod() {

		int da = WaterfallAbility.getDesign();
		this.designPeriod = (double)this.designVolume / (double)(da * this.designPeople);

		return new BigDecimal(String.valueOf(this.designPeriod)).setScale(1, BigDecimal.ROUND_UP).doubleValue();
	}


	public int calcDesignPeople() {
		int da = WaterfallAbility.getDesign();

		this.designPeople = (int)Math.ceil((double)this.designVolume / (double)(da * this.designPeriod));

		return this.designPeople;
	}

	public int getDesignPeople() {
		return this.designPeople;
	}

	public void setDesignPeople(int designPeople) {
		this.designPeople = designPeople;
	}


	public double getDesignPeriod() {
		return this.designPeriod;
	}

	public void setDesignPeriod(double designPeriod) {
		this.designPeriod = designPeriod;
	}

}
