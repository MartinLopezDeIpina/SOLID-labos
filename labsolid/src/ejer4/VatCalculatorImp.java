package ejer4;

public class VatCalculatorImp extends VatCalculator{
	
	@Override
	public float calculateVat(float initialAmount) {
		return (float) (initialAmount * 0.16);
	}
}
