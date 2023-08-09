package interfac.estabelecimento;

import interfac.model.equipamentos.impressora.Impressora;
import interfac.model.equipamentos.digitalizadora.Digitalizadora;
import interfac.model.equipamentos.copiadora.Copiadora;
import interfac.model.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		
		// Meu Equiapamento Funcional pode ser uma Impressora, Digitalizadora e uma Copiadora
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
		
	}
}
