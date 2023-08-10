package banco.model;

import java.util.Random;

import banco.model.atores.Cliente;

public class Conta {
	
	private String numero;
	private double saldo;
	private Cliente titular;
	
	public Conta(double saldo, Cliente titular) {
		this.numero = geraNumeroConta();
		this.saldo = saldo;
		this.titular = titular;
	}
	
	private String geraNumeroConta() {
		Random random = new Random();
        int numeroAleatorio = random.nextInt(100000000); // Gera um número aleatório de 0 a 99999999

        String numeroString = String.format("%08d", numeroAleatorio);
        
        return numeroString;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
}
