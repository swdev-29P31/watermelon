package waterfall;

public class TestPhase extends WaterfallSimulator{
	public double calc(int testPeanuts, int people) {
		return (PEANUTS * TEST_PEANUTS_RATE) / (testPeanuts * people);
	}
}
