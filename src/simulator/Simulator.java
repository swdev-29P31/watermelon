package simulator;

public class Simulator {

	public static void main(String[] args) {

		//WFの設計期間を出す
		WaterfallDesign wd = new WaterfallDesign();
		System.out.println("Design Period = " + wd.calcDesignPeriod());

		//WFの実装期間を出す
		WaterfallImplimentation wi = new WaterfallImplimentation();
		System.out.println("Implimentation Period = " + wi.calcImplimentationPeriod());

		//WFのテスト期間を出す
		WaterfallAcceptance wa = new WaterfallAcceptance();
		System.out.println("Acceptance Period = " + wa.calcAcceptancePeriod());

		//WFの合計期間を出す
		System.out.println("Waterfall Period = "
				+ (wd.calcDesignPeriod() + wi.calcImplimentationPeriod() + wa.calcAcceptancePeriod()) +"\n");

		//Scrumの期間を出す
		ScrumTeam st = new ScrumTeam();
		System.out.println("Scurm Period = " + st.calcTotalPeriod());

	}

}
