package lanchonete.atendimento.cozinha;

public class Cozinheiro {
	
	Almoxarife almoxarife = new Almoxarife();
	int gas = 3;
	
	//pode ser default
	public void adicionarLancheNoBalcao() {
		
		System.out.println("ADICIONANDO LANCHE NATURAL HAMBÚRGUER NO BALCÃO");
	}
	//pode ser default
	public void adicionarSucoNoBalcao() {
		System.out.println("ADICIONANDO SUCO NO BALCÃO");
	}
	//pode ser default
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	private void prepararLanche() {
		pedirIngredientes(almoxarife);
		selecionarIngredientesLanche();
		lavarIngredientes();
		
		if(gas > 0) {
			fritarIngredientesLanche();
			System.out.println("PREPARANDO LANCHE TIPO HAMBÚRGUER");
			gas--;
		}else{
			pedirParaTrocarGas(almoxarife);
		}
		
	}
	private void prepararVitamina() {
		selecionarIngredientesVitamina();
		lavarIngredientes();
		baterVitaminaLiquidificador();
		System.out.println("PREPARANDO SUCO");
	}
	public void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	private void selecionarIngredientesLanche() {
		System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
	}
	private void selecionarIngredientesVitamina() {
		System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
	}
	private void lavarIngredientes() {
		System.out.println("LAVANDO INGREDIENTES");
	}
	private void baterVitaminaLiquidificador() {
		System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
	}
	private void fritarIngredientesLanche() {
		System.out.println("FRITANDO A CARNE E OVO PARA O HAMBÚRGUER");
	}
	private void pedirParaTrocarGas(Almoxarife almoxarife) {
		almoxarife.trocarGas();
	}
	private void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes(); // Default permite o compartilhamento no mesmo pacote
	}
}

