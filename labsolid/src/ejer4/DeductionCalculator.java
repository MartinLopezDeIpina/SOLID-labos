package ejer4;

public abstract class DeductionCalculator {
	
	protected int deductionPercentage;
	
	protected float totalDeduction;
	
	public abstract float calculateDeduction(float initialAmount);
	
}
