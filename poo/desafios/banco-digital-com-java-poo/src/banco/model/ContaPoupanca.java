package banco.model;

import banco.model.atores.Cliente;

public class ContaPoupanca extends Conta {

	private double juros;

	public ContaPoupanca(double saldo, Cliente titular, double juros) {
		super(saldo, titular);
		this.juros = juros;
	}

	public double receberJuros() {
		double saldoComJuros = this.juros;
		
		// Lógica responsável por aplicar o juros conforme o tempo da aplicação vai
		// passando. De 5 em 5 segundos aplica tantos % em cima do valor saldo da conta
		// poupança de juros.
		
		return saldoComJuros;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}
	
}
