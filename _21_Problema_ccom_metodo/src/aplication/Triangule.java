package aplication;

public class Triangule {
	
	public double a;
	public double b;
	public double c;
	
	// METODO / FUNCÇÃO
	
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a)* (p - b) * (p - c));	
	}
}


