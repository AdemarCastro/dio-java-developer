import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

  public static void main(String[] args) {
    /* String nome = args [0];
    String sobrenome = args[1];
    int idade = Integer.valueOf(args[2]);
    double altura = Double.valueOf(args[3]);

    System.out.println("Olá, me chamo " + nome + " " + sobrenome);
    System.out.println("Tenho " + idade + " anos ");
    System.out.println("Minha altura é " + altura + "cm "); */

    /* SCANNER */

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.printf("Digite seu nome: ");
    String nome = scanner.nextLine();

    System.out.printf("Digite seu sobrenome: ");
    String sobrenome = scanner.nextLine();

    System.out.printf("Digite sua idade: ");
    String idade = scanner.nextLine();

    System.out.printf("Digite sua altura: ");
    String altura = scanner.nextLine();

    System.out.println("Olá, me chamo " + nome + " " + sobrenome);
    System.out.println("Tenho " + idade + " anos ");
    System.out.println("Minha altura é " + altura + "cm ");
    
  }
  
}
