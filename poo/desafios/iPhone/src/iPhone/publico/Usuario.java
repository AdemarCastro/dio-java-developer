package iPhone.publico;

import iPhone.produtos.IPhone;
import iPhone.produtos.interfaces.aparelhoTelefonico.AparelhoTelefonico;
import iPhone.produtos.interfaces.navegadorNaInternet.NavegadorNaInternet;
import iPhone.produtos.interfaces.reprodutorMusical.ReprodutorMusical;

public class Usuario {
	public static void main(String[] args) {
		
		IPhone apa = new IPhone();
		
		AparelhoTelefonico apatel = apa;
		NavegadorNaInternet navint = apa;
		ReprodutorMusical repmus = apa;
		
		apatel.ligar();
		apatel.atender();
		apatel.iniciarCorreioVoz();
		
		navint.exibirPagina();
		navint.adicionarNovaAba();
		navint.atualizarPagina();
		
		repmus.selecionarMusica();
		repmus.tocar();
		repmus.pausar();
		
	}
}
