package banco.model.atores;

import banco.model.Conta;
import banco.model.ContaCorrente;
import banco.model.ContaPoupanca;

public class Cliente extends Pessoa {

	public Cliente(String cpf, String nome) { // Essa lógica deve ir para uma classe de Transações ou ficar na classe Conta
		super(cpf, nome);
	}

	public void sacar(double valor, Conta conta) {
		// Lógica para sacar tanto na conta poupanca quanto na corrente

		if (conta instanceof ContaPoupanca) {
			double saldo = conta.getSaldo();
			
			if (valor > saldo)
				System.out.println("Valor maior que o saldo atual. Tente novamente.");
			else
				conta.setSaldo(saldo - valor);
		} else if (conta instanceof ContaCorrente) {
			double saldo = conta.getSaldo();
			double saldoComLimite = ((ContaCorrente) conta).getLimite() + conta.getSaldo();
			
			if (valor > saldoComLimite)
				System.out.println("Valor maior que o saldo atual e o limite disponível. Tente novamente.");
			else if (valor > saldo)
				conta.setSaldo(saldoComLimite - valor);
			else
				conta.setSaldo(saldo - valor);
		}

	}

	public void depositar(double valor, Conta conta) {
		double saldo = conta.getSaldo();
		conta.setSaldo(valor + saldo);
	}

	public void transferir(double valor, Conta origem, Conta destino) {
		sacar(valor, origem);
		depositar(valor, destino);
	}

}
