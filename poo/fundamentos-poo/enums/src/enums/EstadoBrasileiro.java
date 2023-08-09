package enums;

// Criando o Enum EstadoBrasileiro para ser usado em toda a aplicação.
public enum EstadoBrasileiro {
	SAO_PAULO ("SP", "São Paulo", "001"),
    RIO_JANEIRO ("RJ", "Rio de Janeiro", "002"),
    PIAUI ("PI", "Piauí", "003"),
    MARANHAO ("MA", "Maranhão", "004"),
    AMAZONAS ("AM", "Amazonas", "005");
	
	private String nome;
	private String sigla;
	private String ibge;
	
	private EstadoBrasileiro(String nome, String sigla, String ibge) {
		this.nome = nome;
		this.sigla = sigla;
		this.ibge = ibge;
	}
	public String getIbge() {
		return ibge;
	}
	public String getNome() {
		return nome;
	}
	public String getNomeMaisculo() {
		return nome.toUpperCase();
	}
	public String getSigla() {
		return sigla;
	}
	
	
}
