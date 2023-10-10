package labsolid.ejer2;

public class VatCalculator {
	private static float totalVAT;
	
	public static float calculateVAT(float initialAmount) {
		return (float) (initialAmount * 0.16);
	}
}
