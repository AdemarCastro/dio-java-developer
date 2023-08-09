package iPhone.produtos;

import iPhone.produtos.interfaces.aparelhoTelefonico.AparelhoTelefonico;
import iPhone.produtos.interfaces.navegadorNaInternet.NavegadorNaInternet;
import iPhone.produtos.interfaces.reprodutorMusical.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical{

	@Override
	public void tocar() {
		System.out.println("TOCANDO MÚSICA COM O IPHONE!");
	}

	@Override
	public void pausar() {
		System.out.println("PAUSANDO MÚSICA COM O IPHONE!");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("SELECIONANDO MÚSICA COM O IPHONE!");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("EXIBINDO MÚSICA COM O IPHONE!");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA COM O IPHONE!");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PÁGINA COM O IPHONE!");
		
	}

	@Override
	public void ligar() {
		System.out.println("LIGANDO COM O IPHONE!");
		
	}

	@Override
	public void atender() {
		System.out.println("ATENDENDO COM O IPHONE!");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ COM O IPHONE!");
		
	}
	
}
