package interfac.model.equipamentos.multifuncional;

import interfac.model.equipamentos.copiadora.Copiadora;
import interfac.model.equipamentos.digitalizadora.Digitalizadora;
import interfac.model.equipamentos.impressora.Impressora;

// Não é possível extender Copiadora, Digitalizadora e Impressora ao mesmo tempo.
// Quando houver a necessidade de Herança Múltipla, deve-se criar uma Interface.
// Interface é um nível mais abstrato da representação do real para o programa.
public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
	
	public void copiar() {
		System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL!");
		
	}

	public void imprimir() {
		System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL!");
		
	}

	public void digitalizar() {
		System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL!");
		
	}
	
}
