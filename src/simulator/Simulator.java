package simulator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Simulator {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double inputDesignPeriod = 0.0;
		double inputImplimentationPeriod = 0.0;
		double inputAcceptancePeriod = 0.0;
		try {
			System.out.print("Waterfallでの設計期間を入れてください: ");
			String input = br.readLine();
			inputDesignPeriod = Double.parseDouble(input);

			System.out.print("Waterfallでの製造期間を入れてください: ");
			input = br.readLine();
			inputImplimentationPeriod = Double.parseDouble(input);

			System.out.print("Waterfallでのテスト期間を入れてください: ");
			input = br.readLine();
			inputAcceptancePeriod = Double.parseDouble(input);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("失敗しました。");
			e.printStackTrace();
		}

		// WF
		WaterfallDesign wd = new WaterfallDesign();
		wd.setDesignPeriod(inputDesignPeriod);
		System.out.println("Design People: " + wd.calcDesignPeople());

		WaterfallImplimentation wi = new WaterfallImplimentation();
		wi.setImplimentationPeriod(inputImplimentationPeriod);
		System.out.println("Implimentation People: " + wi.calcImplimentationPeople());

		WaterfallAcceptance wa = new WaterfallAcceptance();
		wa.setAcceptancePeriod(inputAcceptancePeriod);
		System.out.println("Acceptance People: " + wa.calcAcceptancePeople() + "\n");

		// WFの合計期間を出す
		// System.out.println("Waterfall Period: "
		// + (wd.calcDesignPeriod() + wi.calcImplimentationPeriod() +
		// wa.calcAcceptancePeriod()) + "\n");

		// Scrum
		double totalPeriod = inputDesignPeriod + inputImplimentationPeriod + inputAcceptancePeriod;
		System.out.println("Scrumチームに与えられた期間: " + totalPeriod + "ヶ月");
		ScrumTeam st = new ScrumTeam();
		st.setTotalPeriod(totalPeriod);
		System.out.println("今回必要なVelocity: " + st.calcVelocity());
	}

}
