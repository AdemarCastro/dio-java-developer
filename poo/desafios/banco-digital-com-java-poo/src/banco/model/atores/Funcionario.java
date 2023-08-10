package banco.model.atores;

public class Funcionario extends Pessoa{
	
	private String cargo;
	private double salario;
	
	public Funcionario(String cpf, String nome, String cargo, double salario) { // Atributos obrigatórios no momento da criação do objeto
		super(cpf, nome);
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
