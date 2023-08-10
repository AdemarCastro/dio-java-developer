package banco.model.atores;

public class GerenciadorDeClientes extends Funcionario{
	
	public GerenciadorDeClientes(String cpf, String nome, String cargo, double salario) {
		super(cpf, nome, cargo, salario);
	}

	public Cliente adicionarCliente(String cpf, String nome) {
		// Cria um novo cliente no banco e depois o retorna
		Cliente cliente = new Cliente(cpf, nome);
		
		return cliente;
	}
	
	public void removerCliente(Cliente cliente) {
		// Lógica para remover o cliente de um ArrayList
	}
	
}
