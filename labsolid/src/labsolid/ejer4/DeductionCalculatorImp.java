package ejer4;

public class DeductionCalculatorImp extends DeductionCalculator{

	@Override
	public float calculateDeduction(float initialAmount) {
		return (initialAmount * deductionPercentage) / 100;
	}
}
