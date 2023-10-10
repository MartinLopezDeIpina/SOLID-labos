package labsolid.ejer2;

public class DeductionCalculator {
	
	private static int deductionPercentage;
	
	public static float calculateDeduction(float initialAmount) {
		return (initialAmount * deductionPercentage) / 100;
	}
}
