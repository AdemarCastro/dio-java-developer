package banco.model.atores;

import banco.model.Conta;
import banco.model.ContaCorrente;
import banco.model.ContaPoupanca;

public class GerenciadorDeContas extends Funcionario{
	
	public GerenciadorDeContas(String cpf, String nome, String cargo, double salario) {
		super(cpf, nome, cargo, salario);
	}

	public ContaPoupanca criarContaPoupanca(double saldo, Cliente titular, double juros) {
		ContaPoupanca poupanca = new ContaPoupanca(saldo, titular, juros);
		
		return poupanca;
	}
	
	public ContaCorrente criarContaCorrente(double saldo, Cliente titular, double limite) {
		ContaCorrente corrente = new ContaCorrente(saldo, titular, limite);
		
		return corrente;
	}
	
	public void removerConta(Conta conta) {
		
		if (conta instanceof ContaPoupanca) {
			// Verificação de requisitos para excluir a conta poupança
			// L�gica para remover conta poupan�a; 
		} else if (conta instanceof ContaCorrente) {
			// Verificação de requisitos para excluir a conta corrente
			// L�gica para remover conta corrente; 
		}
		
	}
	
	public void atualizarConta(String valor, String tipo, Conta conta) {
		// Lógica para transformar os dados do valor em algo válido para o tipo de dado que deve ser atualizado
		
		// return conta Atualizada
	}
}
