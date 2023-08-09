package escola;

public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		felipe.setNome("Felipe");
		felipe.setIdade(8);
		felipe.setSexo("Masculino");
		
		System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos e é do sexo " + felipe.getSexo());
		// RESULTADO NO CONSOLE
		// O aluno Felipe tem 8 anos
	}
}
