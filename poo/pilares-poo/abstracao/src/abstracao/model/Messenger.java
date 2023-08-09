package abstracao.model;

public abstract class Messenger {
	// Método abstrato para as subclasses - Obrigatórios
	public abstract void validarUsuario();
	
	public void enviarMensagem() {
		System.out.println("Mensagem enviada");
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Mensagem recebida");
		salvarHistoricoMensagem();
	}
	public void validarConectadoInternet() {
		System.out.println("Verificando conexão de Internet...");
		System.out.println("Conectado a Internet");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando mensagem...");
		System.out.println("Mensagem salva");
	}
	
}
