package banco.model.dados;

public class Contato {
	
	private String celular;
	private String telefone;
	private String email;
	private String contaFacebook;
	
	public Contato(String celular, String email) { // Atributos obrigatórios no momento da criação do objeto
		this.celular = celular;
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContaFacebook() {
		return contaFacebook;
	}

	public void setContaFacebook(String contaFacebook) {
		this.contaFacebook = contaFacebook;
	}
	
}
