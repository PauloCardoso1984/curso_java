package aula;

import java.util.Scanner;

public class aula_57 {

	public static void main(String[] args) {
		
		// & → Operação "E" biy a bit
		// | → Operação "OU" bit a bit
		// ^ → Operação "OU-exclusivo" bit a bit
		
		int n1 = 89;
		int n2 = 60;
		System.out.println("Valores de n1 = 89 e n2 = 60");
		
		System.out.printf("Operação E bit a bit n1 & n2 \n",  n1 & n2);
		System.out.printf("Operação OU bit a bit \n", n1 | n2);
		System.out.printf("Operação OU-exclusivo bit a bit \n", n1 ^ n2);
		
		System.out.println("");
		
		System.out.println("Testar se o 6º bitem o valor 0.");
		System.out.print("Digite o número: ");
		Scanner sc = new Scanner(System.in);
		int mask = 0b100000;
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit é thrue");
		}
		else {
			System.out.println("6th bit é false");
		}
		sc.close();
	}
}