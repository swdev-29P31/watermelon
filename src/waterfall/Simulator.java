package waterfall;

public class Simulator {
	

	
	private static final int PEANUTS = 100;
	//1ピーナッツ 2人月
	private static final int MAN_MONTH = 2;

	public int calc(int man) {
			
		return  PEANUTS / MAN_MONTH / man;
	}
	
	

}
