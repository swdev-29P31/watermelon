package simulator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Simulator {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("比較するものはどちらでしょうか？[1. 期間 / 2. 人員]: ");
		String input = "";
		int choice = 0;
		try {
			input = br.readLine();
			choice = Integer.parseInt(input);
		} catch (IOException e1) {
			System.out.println("失敗しました。");
			e1.printStackTrace();
		}

		switch (choice) {
		case 1:
			simulatePeriod();
			break;
		case 2:
			simulatePeople();
			break;
		default:
			System.out.println("終了しました。");
		}
	}

	public static void simulatePeople() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";

		double inputDesignPeriod = 0.0;
		double inputImplimentationPeriod = 0.0;
		double inputAcceptancePeriod = 0.0;
		try {
			System.out.print("Waterfallでの設計期間を入れてください: ");
			input = br.readLine();
			inputDesignPeriod = Double.parseDouble(input);

			System.out.print("Waterfallでの製造期間を入れてください: ");
			input = br.readLine();
			inputImplimentationPeriod = Double.parseDouble(input);

			System.out.print("Waterfallでのテスト期間を入れてください: ");
			input = br.readLine();
			inputAcceptancePeriod = Double.parseDouble(input);

		} catch (IOException e) {
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

		// Scrum
		double totalPeriod = inputDesignPeriod + inputImplimentationPeriod + inputAcceptancePeriod;
		System.out.println("Scrumチームに与えられた期間: " + totalPeriod + "ヶ月");
		ScrumTeam st = new ScrumTeam();
		st.setTotalPeriod(totalPeriod);
		System.out.println("今回必要なVelocity: " + st.calcVelocity());
	}

	public static void simulatePeriod() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";

		int inputDesignPeople = 0;
		int inputImplimentationPeople = 0;
		int inputAcceptancePeople = 0;
		try {
			System.out.print("Waterfallでの設計人数を入れてください: ");
			input = br.readLine();
			inputDesignPeople = Integer.parseInt(input);

			System.out.print("Waterfallでの製造人数を入れてください: ");
			input = br.readLine();
			inputImplimentationPeople = Integer.parseInt(input);

			System.out.print("Waterfallでのテスト人数を入れてください: ");
			input = br.readLine();
			inputAcceptancePeople = Integer.parseInt(input);

		} catch (IOException e) {
			System.out.println("失敗しました。");
			e.printStackTrace();
		}

		// WF
		WaterfallDesign wd = new WaterfallDesign();
		wd.setDesignPeople(inputDesignPeople);
		System.out.println("Design Period: " + wd.calcDesignPeriod());

		WaterfallImplimentation wi = new WaterfallImplimentation();
		wi.setImplimentationPeople(inputImplimentationPeople);
		System.out.println("Implimentation Period: " + wi.calcImplimentationPeriod());

		WaterfallAcceptance wa = new WaterfallAcceptance();
		wa.setAcceptancePeople(inputAcceptancePeople);
		System.out.println("Acceptance Period: " + wa.calcAcceptancePeriod() + "\n");

		double totalPeriod = wd.calcDesignPeriod() + wi.calcImplimentationPeriod() + wa.calcAcceptancePeriod();
		System.out.println("Waterfall Period: " + (totalPeriod) + "\n");

		// Scrum
		ScrumTeam st = new ScrumTeam();
		System.out.print("ScrumチームのVelocity: ");
		int inputVelocity = 0;
		try {
			input = br.readLine();
			inputVelocity = Integer.parseInt(input);
		} catch (IOException e) {
			System.out.println("失敗しました。");
			e.printStackTrace();
		}

		st.setVelocity(inputVelocity);
		System.out.println("Scrum Period: " + st.calcTotalPeriod());
	}

}
