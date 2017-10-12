package waterfall;

public class Design extends WaterfallSimulator{
	
	public double calc(int designPeanuts, int people){
		return (PEANUTS * DESIGN_PEANUTS_RATE) / (designPeanuts * people);
	}
}
