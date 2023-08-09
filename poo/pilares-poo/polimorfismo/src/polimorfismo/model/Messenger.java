package polimorfismo.model;

public abstract class Messenger {
	// Método abstrato para as subclasses - Obrigatórios
	protected abstract void validarUsuario(); // Polimorfismo - Cada subclasse será obrigada a implementar o próprio
												// método de validação

	public void enviarMensagem() {
		System.out.println("Mensagem enviada");
		salvarHistoricoMensagem();
	}

	public void receberMensagem() {
		System.out.println("Mensagem recebida");
		salvarHistoricoMensagem();
	}

	protected void validarConectadoInternet() { // Protected - Muito ligado ao Polimorfismo
		System.out.println("Verificando conexão de Internet...");
		System.out.println("Conectado a Internet");
	}

	private void salvarHistoricoMensagem() { // Encapsulamento
		System.out.println("Salvando mensagem...");
		System.out.println("Mensagem salva");
	}

}
