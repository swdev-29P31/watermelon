package waterfall;

public class MakePhase extends WaterfallSimulator{
	public double calc(int makePeanuts, int people) {
		return (PEANUTS * MAKE_PEANUTS_RATE) / (makePeanuts * people);
	}
}