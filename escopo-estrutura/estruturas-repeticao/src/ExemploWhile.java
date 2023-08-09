import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
  
  public static void main(String[] args) {
    double mesada = 50.0;

    System.out.println("Saldo inicial: " + mesada);

    while (mesada > 0) {
      double valorDoce = valorAleatorio();

      mesada = mesada - valorDoce;

      System.out.println("Doce do valor: " + String.format("%.2f", valorDoce) + " adicionado no carrinho.\n Seu saldo atual é: " + String.format("%.2f", mesada));
    }

    System.out.println("Joãozinho gastou toda a sua mesada em doces.");

  }

  private static double valorAleatorio() {
    // Me retorna um valor de 2 a 8
    return ThreadLocalRandom.current().nextDouble(2, 15);
  }

}
