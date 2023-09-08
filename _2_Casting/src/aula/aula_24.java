package aula;

public class aula_24 {

	public static void main(String[] args) {
		
	int x, y;
	x = 5;
	y = 2 * x;
	
	System.out.println("Valor de x:	" + x);
	System.out.println("Valor de y:	" + y);
	System.out.println("");
	
	// calculo de trapézio
	System.out.println("Calculo de trapézio");
	System.out.println("a= 6, b= 8 e c= 5");
	double a, b, c;
	a = 6;
	b = 8;
	c = 5;
	
	double area = ((a + b) / 2) * c;
	System.out.println("Area do trapézio: " + area);
	System.out.println("");
	
	// divisão somente com inteiros
	System.out.println("Divisão somente com inteiros");
	System.out.println("d= 5 e e= 2");
	int d, e;
	d = 5;
	e = 2;
	
	int res = d / e;
	System.out.println("Divisão somente com inteiros: " + res);
	System.out.println();
	
	// divisão correta
	System.out.println("Divisão correta");
	System.out.println("f= 5 e g= 2");
	double f, g;
	f = 5;
	g = 2;
	
	double resp = f / g;
	System.out.println("Valor da divisão de forma correta: " + resp);
	System.out.println("");
	
	// processamento de informações
	System.out.println("Processamento de informações");
	double h;
	int i;
	h = 5.0;
	i = (int) h;  //para dar certo tem que colocar o int antes da variavél.
	System.out.println("Imprimir número inteiro: " + i);
	
	}
}

