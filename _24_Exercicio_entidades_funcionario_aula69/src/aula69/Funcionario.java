package aula69;

public class Funcionario {
	
	public String nome;
	public double salario;
	public double taxa;
	
	//  MÉTODOS
	public double taxa(double salario, double taxa) {
		return taxa = salario - taxa; 
	}
	public double AumentoSalario(double porcentagem) {
		return salario += salario * porcentagem / 100;
	}
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + ", taxa=" + taxa + "]";
	}
}