package entities;

public class Student {
	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double notaFinal() {
		return grade1 + grade2 + grade3;
	}
	public double notaRestante () {
		if (notaFinal() < 60) {
			return 60 - notaFinal();
		}
		else {
			return 0;
		}
	}
}
