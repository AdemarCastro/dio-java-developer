package abstracao.model;

public class Telegram extends Messenger{
	
	public void validarUsuario() {
		// A questão aqui é que cada plataforma pode ter seu próprio método de
		// autenticação, assim como seu próprio método de enviar e receber mensagem.
		// Sendo assim, não seria possível apneas fornecer o código pronto para elas,
		// mas através do abstração eu posso garantir que as subclasses terão esses
		// métodos definidos da sua forma.
		System.out.println("Verificando autenticação do usuario...");
		System.out.println("Usuário autenticado!");
	}
	
	public void conectarAoTelegram() {
		System.out.println("Conectando ao Telegram...");
		System.out.println("Conexão bem sucessidade!");
	}
}
