package abstracao;

import abstracao.model.FacebookMessenger;
import abstracao.model.MSNMessenger;
import abstracao.model.Telegram;

public class Main {
	public static void main(String[] args) {
		// FACEBOOK
		// Criando um objeto da Subclasse FacebookMessenger
		FacebookMessenger usuarioFacebook = new FacebookMessenger();
		
		// Retornando os métodos da subclasse herdados pela superclasse Messenger
		usuarioFacebook.validarUsuario();
		usuarioFacebook.validarConectadoInternet();
		usuarioFacebook.conectarAoFacebook();
		usuarioFacebook.enviarMensagem();
		usuarioFacebook.receberMensagem();
		
		// MSNMESSENGER
		MSNMessenger usuarioMSNMessenger = new MSNMessenger();
		
		System.out.println("\n");
		
		usuarioMSNMessenger.validarUsuario();
		usuarioMSNMessenger.validarConectadoInternet();
		usuarioMSNMessenger.conectarAoMSNMessenger();
		usuarioMSNMessenger.enviarMensagem();
		usuarioMSNMessenger.receberMensagem();
		
		// MSNMESSENGER
		Telegram usuarioTelegram = new Telegram();
		
		System.out.println("\n");
		
		usuarioTelegram.validarUsuario();
		usuarioTelegram.validarConectadoInternet();
		usuarioTelegram.conectarAoTelegram();
		usuarioTelegram.enviarMensagem();
		usuarioTelegram.receberMensagem();
	
	}
}
