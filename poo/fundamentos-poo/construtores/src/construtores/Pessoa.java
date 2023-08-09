package construtores;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private String endereco;
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome; // This = Este objeto. Está instância da Classe
		this.cpf = cpf;
	}
	public Pessoa() {
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
