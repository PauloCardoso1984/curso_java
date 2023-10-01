package aula;

public class aula_58 {

	public static void main(String[] args) {
		/* Formatar: toLowerCase() - minusculo, 
		  		ToUpperCase() maiusculo, 
		  		trim() - remover espaço
		   Recortar: substring(inicio), 
		   		substring(inicio, fim)
		   Substituir: Replace(char, char) 
		   		Replace(string, string)
		   Buscar: IndexOF, 
		   		LastIndexOf
		   str.Split("")    
		*/
		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		String s01 = original.toLowerCase();
		
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2,9);
		String s06 = original.replace('a','x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original:             - " + original + "-");
		System.out.println("toLowerCase:          - " + s01 + "-");
		System.out.println("toUpperCase:          - " + s02 + "-");
		System.out.println("trim:                 - " + s03 + "-");
		System.out.println("substring(2)  :       - " + s04 + "-");
		System.out.println("substring(2,9):       - " + s05 + "-");
		System.out.println("replace('a','x'):     - " + s06 + "-");
		System.out.println("replace('abc','xy'):  - " + s07 + "-");
		System.out.println("indexOf(\"bc\")       - " + i + "-");
		System.out.println("lastIndexOf(\"bc\")   - " + j + "-");
		
		System.out.println("----------");
		System.out.println("");
		
		// Operação SPLIT
		String s = "potato apple lemon";
		
		String[] vect = s.split(" ");
		String w1 = vect[0];
		String w2 = vect[1];
		String w3 = vect[2];
		
		System.out.println(w1); // ou
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	}
}
