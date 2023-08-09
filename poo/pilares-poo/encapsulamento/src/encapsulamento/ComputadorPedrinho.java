package encapsulamento;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		// abrindo MSN Messenger
		MSNMessenger msn = new MSNMessenger();
		
		msn.enviarMensagem();
		
		msn.receberMensagem();
	}
	
	// Encapsular é somente esconder, os métodos ainda terão de ser chamados em outro método.
	// Proporciona boas práticas de implementação, promove o reaproveitamento de código.
}
