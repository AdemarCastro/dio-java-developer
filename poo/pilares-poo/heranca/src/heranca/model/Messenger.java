package heranca.model;

public class Messenger {
	
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
