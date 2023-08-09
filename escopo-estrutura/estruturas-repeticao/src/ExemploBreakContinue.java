public class ExemploBreakContinue {
  
  public static void main(String[] args) {
    
    for (int numero = 1; numero <= 5; numero++) {

      if (numero == 3) {
        // break; para no 2
        // continue; unico que não será impresso é o no 3
      }
      
      System.out.println(numero);
    }

  }

}
