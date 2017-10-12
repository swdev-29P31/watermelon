package waterfall;

public class WaterfallSimulator {
	

	protected static final int PEANUTS = 100;
	
	protected static final double DESIGN_PEANUTS_RATE = 0.3;
	protected static final double MAKE_PEANUTS_RATE = 0.4;
	protected static final double TEST_PEANUTS_RATE = 0.3;		
	
	private int designPeanuts = 0;
	private int designPeople = 0;
	
	private int makePeanuts = 0;
	private int makePeople = 0;
	
	private int testPeanuts = 0;
	private int testPeople = 0;
	
	public double calc() {
		Design design = new Design();
		Make make = new Make();
		Test test = new Test();
		
		return design.calc(this.designPeanuts, this.designPeople) + 
				make.calc(this.makePeanuts, this.makePeople) + 
				test.calc(this.testPeanuts, this.testPeople);
	}
	
	
	public int getDesignPeanuts() {
		return designPeanuts;
	}

	public void setDesignPeanuts(int designPeanuts) {
		this.designPeanuts = designPeanuts;
	}

	public int getDesignPeople() {
		return designPeople;
	}

	public void setDesignPeople(int designPeople) {
		this.designPeople = designPeople;
	}


	public int getMakePeanuts() {
		return makePeanuts;
	}


	public void setMakePeanuts(int makePeanuts) {
		this.makePeanuts = makePeanuts;
	}


	public int getMakePeople() {
		return makePeople;
	}


	public void setMakePeople(int makePeople) {
		this.makePeople = makePeople;
	}


	public int getTestPeanuts() {
		return testPeanuts;
	}


	public void setTestPeanuts(int testPeanuts) {
		this.testPeanuts = testPeanuts;
	}


	public int getTestPeople() {
		return testPeople;
	}


	public void setTestPeople(int testPeople) {
		this.testPeople = testPeople;
	}

}
