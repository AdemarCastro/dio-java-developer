public class ExemploForArray {
  
  public static void main(String[] args) {
    
    String alunos [] = {"ADEMAR", "JONAS", "JULIA", "MARCOS"};

    /* for (int i = 0; i < alunos.length; i++) {

      System.out.println("O aluno no indice i = " + i + " é " + alunos[i]);

    } */

    // Forma mais agradável de interar sobre um array ou objeto
    for (String aluno : alunos) {
      System.out.println("Nome do aluno é: " + aluno);
    }
  }

}
