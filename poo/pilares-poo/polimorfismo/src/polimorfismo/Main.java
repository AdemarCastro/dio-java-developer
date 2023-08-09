package polimorfismo;

import polimorfismo.model.FacebookMessenger;
import polimorfismo.model.MSNMessenger;
import polimorfismo.model.Telegram;

public class Main {
	public static void main(String[] args) {
		// FACEBOOK
		// Criando um objeto da Subclasse FacebookMessenger
		FacebookMessenger usuarioFacebook = new FacebookMessenger();
		
		// Retornando os métodos da subclasse herdados pela superclasse Messenger
		usuarioFacebook.validarUsuario();
		usuarioFacebook.conectarAoFacebook();
		usuarioFacebook.enviarMensagem();
		usuarioFacebook.receberMensagem();
		
		// MSNMESSENGER
		MSNMessenger usuarioMSNMessenger = new MSNMessenger();
		
		System.out.println("\n");
		
		usuarioMSNMessenger.validarUsuario();
		usuarioMSNMessenger.conectarAoMSNMessenger();
		usuarioMSNMessenger.enviarMensagem();
		usuarioMSNMessenger.receberMensagem();
		
		// MSNMESSENGER
		Telegram usuarioTelegram = new Telegram();
		
		System.out.println("\n");
		
		usuarioTelegram.validarUsuario();
		usuarioTelegram.conectarAoTelegram();
		usuarioTelegram.enviarMensagem();
		usuarioTelegram.receberMensagem();
	
	}
}
