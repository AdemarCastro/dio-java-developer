
public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.setChassi("218912");
		jeep.ligar();
		
		Moto z1000 = new Moto();
		z1000.setChassi("8213821");
		z1000.ligar();
		
		System.out.println("Chassi Moto: " + z1000.getChassi());
		System.out.println("Chassi Carro: " + jeep.getChassi());
		
		Veiculo coringa = z1000; // Polimorfismo
		coringa.ligar();
		
	}
}
