package escola;

public class Aluno {
	private String nome;
	private int idade;
	private String sexo;

	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		// Verificação do atributo Sexo inserido
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		// Verificação do atributo Nome inserido
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		// Verificação do atributo Idade inserido
		this.idade = idade;
	}

	/*
	 * PORQUE EXISTE ESSA CONVENÇÃO JAVA BEANS?
	 * 
	 * Antigamente as aplicaçãoes não estavam tão protegidas a níveis de camada, api
	 * e etc. Então, além dos modificadores de acesso, também era necessário
	 * realizar algumas verificações ou modificações no que é inserido nos objetos.
	 * 
	 */
}
