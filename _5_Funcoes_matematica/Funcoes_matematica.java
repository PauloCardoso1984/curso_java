package aula;

public class Funcoes_matematica {

	public static void main(String[] args) {
		// A = Math.sqrt(x) 	-isso é igual a raiz quadrada;
		// A = Math.pow(x, y) 	-variavel A recebe de x elevado a y;
		// A = Math.abs(x) 		-variavel A recebe o valor absoluto de x;
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A,B,C; 
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.println("RAIZ QUADADRA DE " + x + " = " + A);
		System.out.println("RAIZ QUADADRA DE " + y + " = " + B);
		System.out.println("RAIZ QUADADRA DE 25 = " + C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println(5 + " elevado ao quadrado = " + C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);

	}
}
