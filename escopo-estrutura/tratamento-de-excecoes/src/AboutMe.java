import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

  public static void main(String[] args) {

    // TRATAMENTO DE EXCEÇÕES

    try {
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

      System.out.printf("Digite seu nome: ");
      String nome = scanner.nextLine();

      System.out.printf("Digite seu sobrenome: ");
      String sobrenome = scanner.nextLine();

      System.out.printf("Digite seu idade: ");
      int idade = scanner.nextInt();

      System.out.printf("Digite sua altura: ");
      double altura = scanner.nextDouble();

      // Imprimindo os dados obtidos pelo usuario

      System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
      System.out.println("Tenho " + idade + " anos ");
      System.out.println("Minha altura é " + altura + "cm ");

    } catch (InputMismatchException e) {
      System.out.println("O campo idade e altura precisam ser númericos.");
    }

  }
  
}
