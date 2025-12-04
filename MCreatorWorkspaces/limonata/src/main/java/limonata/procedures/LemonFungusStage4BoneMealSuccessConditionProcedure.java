package limonata.procedures;

public class LemonFungusStage4BoneMealSuccessConditionProcedure {
	public static boolean execute() {
		if (Math.random() <= 0.25) {
			return true;
		}
		return false;
	}
}