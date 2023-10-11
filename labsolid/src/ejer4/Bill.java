package ejer4;

import java.util.Date;

public class Bill {
	
	private String code; // Representa un número de 5 dígitos
	private Date date;
	
	private float InitialAmount;
	
	private float billTotal;
	
	private DeductionCalculator deductionCalculator;
	private VatCalculator vatCalculator;
	
	// Método que calcula el total de la factura
	public void billTotalCalc() {
		float deduction = deductionCalculator.calculateDeduction(InitialAmount);
		float vat = vatCalculator.calculateVat(InitialAmount);
		
		billTotal = (InitialAmount - deduction) + vat;
	}
}
