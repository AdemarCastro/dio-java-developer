package enums;

public class SistemaIbge {

	public static void main(String[] args) {
		
		for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
			System.out.println(e.getSigla() + " - " + e.getNome() + " - " + e.getIbge());
		}
		
		EstadoBrasileiro eb = EstadoBrasileiro.AMAZONAS;
		
		System.out.println("\n" + eb.getSigla() + " - " + eb.getNome() + " - " + eb.getIbge());
	}
}
