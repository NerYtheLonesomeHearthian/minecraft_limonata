package limonata.procedures;

public class LemonCropBoneMealSuccessConditionProcedure {
	public static boolean execute() {
		if (Math.random() < 0.75) {
			return true;
		}
		return false;
	}
}