public class Usuario {

    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv(); // Essa é a forma de criar uma classe

        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volumne);

        smartTv.ligar();
        System.out.println("TV ligada: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV ligada: " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volumne);

        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volumne);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(26);
        System.out.println("Canal atual: " + smartTv.canal);
    }

}
