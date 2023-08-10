package banco.model;

import banco.model.atores.Cliente;

public class ContaCorrente extends Conta{
	
	private double limite;
	
	public ContaCorrente(double saldo, Cliente titular, double limite) {
		super(saldo, titular);
		this.limite = limite;
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
}
