package labsolid.ejer2;

import java.util.Date;

public class Bill {
	
	private String code; // Representa un número de 5 dígitos
	private Date date;
	
	private float InitialAmount;
	
	
	private float totalDeduction;
	private float billTotal;
	
	// Método que calcula el total de la factura
	public void billTotalCalc() {
		float deduction = DeductionCalculator.calculateDeduction(InitialAmount);
		float vat = VatCalculator.calculateVAT(InitialAmount);
		
		billTotal = (InitialAmount - deduction) + vat;
	}
}
