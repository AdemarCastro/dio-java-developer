package heranca;

import heranca.model.FacebookMessenger;
import heranca.model.MSNMessenger;
import heranca.model.Telegram;

public class Main {
	public static void main(String[] args) {
		// FACEBOOK
		// Criando um objeto da Subclasse FacebookMessenger
		FacebookMessenger usuarioFacebook = new FacebookMessenger();
		
		// Retornando os métodos da subclasse herdados pela superclasse Messenger
		usuarioFacebook.validarConectadoInternet();
		usuarioFacebook.conectarAoFacebook();
		usuarioFacebook.enviarMensagem();
		usuarioFacebook.receberMensagem();
		
		// MSNMESSENGER
		MSNMessenger usuarioMSNMessenger = new MSNMessenger();
		
		System.out.println("\n");
		
		usuarioMSNMessenger.validarConectadoInternet();
		usuarioMSNMessenger.conectarAoMSNMessenger();
		usuarioMSNMessenger.enviarMensagem();
		usuarioMSNMessenger.receberMensagem();
		
		// MSNMESSENGER
		Telegram usuarioTelegram = new Telegram();
		
		System.out.println("\n");
		
		usuarioTelegram.validarConectadoInternet();
		usuarioTelegram.conectarAoTelegram();
		usuarioTelegram.enviarMensagem();
		usuarioTelegram.receberMensagem();
	
	}
}
