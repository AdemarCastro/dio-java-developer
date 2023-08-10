package banco;

import banco.model.Banco;
import banco.model.ContaCorrente;
import banco.model.ContaPoupanca;
import banco.model.atores.Cliente;
import banco.model.atores.GerenciadorDeClientes;
import banco.model.atores.GerenciadorDeContas;

public class Main {
	public static void main(String[] args) {
		
		// Teste do Sistema BancÃ¡rio Digital
		
		// Criando o Banco Padrão no Sistema
		Banco banco = new Banco();
		
		System.out.println("Criando Banco no Sistema:");
		System.out.println("*Por falta de definição, o banco padrão foi criado.");
		System.out.println("  Código: " + banco.getCodigo());
		System.out.println("  Nome: " + banco.getNome());
		System.out.println("  Cep: " + banco.getEndereco().getCep());
		System.out.println("  Número: " + banco.getEndereco().getNumero());
		
		// Criando um Gerenciador de Clientes
		GerenciadorDeClientes gerClientes = new GerenciadorDeClientes("02500088822", "Eduardo", "Ger. de Clientes JR", 3600.0);
		System.out.println("\nUm Gerenciador de Clientes foi criado:");
		System.out.println("  Nome: " + gerClientes.getNome());
		System.out.println("  CPF: " + gerClientes.getCpf());
		System.out.println("  Cargo: " + gerClientes.getCargo());
		// Criando um Gerenciador de Contas
		GerenciadorDeContas gerContas = new GerenciadorDeContas("02500077799", "Jorge", "Ger. de Contas PL", 4200.0);
		System.out.println("\nUm Gerenciador de Contas foi criado:");
		System.out.println("  Nome: " + gerContas.getNome());
		System.out.println("  CPF: " + gerContas.getCpf());
		System.out.println("  Cargo: " + gerContas.getCargo());
		
		// Criando um Cliente com o GerClientes
		Cliente cliente1 = gerClientes.adicionarCliente("02500022266", "Ademar");
		System.out.println("\nUm novo Cliente foi criado: ");
		
		// Exibir o Cliente1
		System.out.println("  CPF: " + cliente1.getCpf());
		System.out.println("  Nome: " + cliente1.getNome());
		
		// Criando uma Conta Poupança para o Cliente1
		ContaPoupanca poupanca = gerContas.criarContaPoupanca(1200.0, cliente1, 0);
		System.out.println("\nConta Poupança Criada: ");
		
		// Exibir informações da Conta Poupança do Cliente1
		System.out.println("  Número da Conta: " + poupanca.getNumero());
		System.out.println("  Saldo atual: " + poupanca.getSaldo());
		System.out.println("  Júros: " + poupanca.getJuros());
		System.out.println("  CPF do Titular: " + poupanca.getTitular().getCpf());
		System.out.println("  Nome do Titular: " + poupanca.getTitular().getNome());
		
		// Criando uma Conta Corrente para o Cliente1
		ContaCorrente corrente =  gerContas.criarContaCorrente(0, cliente1, 600.0);
		System.out.println("\nConta Corrente Criada: ");
		
		// Exibir informações da Conta Corrente do Cliente1
		System.out.println("  Número da Conta: " + corrente.getNumero());
		System.out.println("  Saldo atual: " + corrente.getSaldo());
		System.out.println("  Limite: " + corrente.getLimite());
		System.out.println("  CPF do Titular: " + corrente.getTitular().getCpf());
		System.out.println("  Nome do Titular: " + corrente.getTitular().getNome());
		
	}
}
