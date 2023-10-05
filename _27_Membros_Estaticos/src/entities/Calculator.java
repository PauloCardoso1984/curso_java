package entities;

public class Calculator {

	double raio;
	
	public static final double PI = 3.14159;
	
	
	//  MÉTODOS
	public static double circunferencia (double raio) {
		return (2 * PI * raio);
	}
	
	public static double volume (double raio) {
		return 4 * PI * (raio * raio * raio) / 3;
	}
} 