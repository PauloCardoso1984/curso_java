package entities;

public class Calculator {
	
	public static double IOF = 0.06;
		
	public static double valorReal (double amount, double valorDolar) {
		return amount * valorDolar * ( 1 + IOF);
	}

}
