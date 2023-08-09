package construtores;

public class SistemaCadastro {

	public static void main(String[] args) {
		// Criamos uma pessoa no sistema
		// Criando construtores com valores requiridos no momento da criação
		Pessoa marcos = new Pessoa("Marcos", "000.000.152-22");

		// Definimos o endereço de Marcos
		marcos.setEndereco("RUA DAS MARIAS");

		// E como definir o Nome e Cpf de Marcos?

		// Imprimindo o Marcos sem o Nome e Cpf
		System.out.println(marcos.getNome() + " - " + marcos.getCpf() + " - " + marcos.getEndereco());
	}

	// Não devo abusar dos Construtores!
	// Por exemplo, quais são os dados imprecendíveis para a matrícula de uma Aluno?
	// Nome e CPF. Os outros dados podem ser inseridos em outro momento.
	// IMPORTANTE: Ao criar um construtor com inserção de atributos, é necessário
	// criar um construtor sem nenhuma inserção de atributo também. A menos que não
	// seja necessário para a aplicação. O normal é um construtor padrão, sem nenhum
	// atributo e outro com os atributos que você ache imprecendíveis para a
	// inserção do objeto.
}
