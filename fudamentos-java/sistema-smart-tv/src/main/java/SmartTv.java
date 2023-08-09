public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volumne = 25;

    public void aumentarCanal() {
        canal++;
        System.out.println("Aumentar canal para: " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Diminuir canal para: " + canal);
    }

    public void mudarCanal(int canalEscolhido) {
        canal = canalEscolhido;
        System.out.println("Mudou para o canal: " + canal);
    }

    public void aumentarVolume() {
        volumne++;
        System.out.println("Aumentar volume para: " + volumne);
    }

    public void diminuirVolume() {
        volumne--;
        System.out.println("Diminuir volume para: " + volumne);
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    /*
    *
    * Como documentar um projeto Java:
    *
    * Usar o código abaixo
    *
    * javadoc -endecoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/*.java
    *
    * */

}
