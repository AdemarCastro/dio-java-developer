
public class AnotacaoAulaUml {
	/*
	 * UML - Linguagem de Modelagem Unificada
	 * 
	 * - É como se fosse um manual de instrução para que possamos dar nossos
	 * primeiros passos na codificação de sistemas
	 * 
	 * Anotação bem definida por uma convenção de como vai ser meu projeto
	 * 
	 * DIAGRAMAS:
	 * 
	 * Diagramas, Elementos e Relacionamentos
	 * 
	 * - Diagrama de Classes: Utilizado para fazer a representação de estruturas de
	 * classes de negócio
	 * 
	 * - Diagrama de Objetos: Representa os objetos existentes em um determinado
	 * instante ou fato na aplicação
	 * 
	 * - Relacionamentos: Classes podem existir de forma independente, mas haverá
	 * alguma etapa da aplicação e necessidade de algumas se relacionarem
	 * 
	 * ASSOCIAÇÃO:
	 * 
	 * - Associação Simples: Navegação de A para B
	 * 
	 * - Associação Bidirecional: Pouco usada, mas muito funcional. Associação de A
	 * para B ou de B para A
	 * 
	 * - Agregação: B é um conjunto pertecente a A, no entanto, se A deixar de
	 * existir, B ainda irá existirá
	 * 
	 * - Composição: B é um conjunto pertecente a A, se A deixar de existir, então B
	 * também deixará. Além disso, não faz sentido eu criar a classe B se a A não
	 * existir.
	 * 
	 * MULTIPLICIDADE:
	 * 
	 * Nem sempre o relacionamento entre as classes será um para um, um determinado
	 * cenário poderá exisgir multiplicidades específicas conforme opções abaixo:
	 * 
	 * 1. -> Representa uma associação contendo um elemento
	 * 
	 * *. -> Representa uma associação contendo uma lista de elementos
	 * 
	 * 0..1 -> Representa uma associação contendo zero ou um elemento
	 * 
	 * 0..* -> Representa uma associação contendo zero ou uma lista de elementos
	 * 
	 * VISIBILIDADE:
	 * 
	 * Os atributos e métodos de uma classe podem receber níveis de visibilidade, e
	 * na UML existem símbolos que representam cada um deles.
	 * 
	 * (+) Visibilidade pública
	 * 
	 * (#) Visibilidade protegida (muita associada com herança)
	 * 
	 * (-) Visibilidade privada
	 * 
	 * Exemplo:
	 * 
	 * # Diagrama de Classes

		## Classe: Identificação
		Classe genérica representando uma identificação.
		
		### Atributos
		- atributoPrivado: int
		- atributoProtegido: String
		+ atributoPublico: double
		
		### Métodos
		+ metodoSemRetorno() : void
		+ metodoComRetorno() : String
		+ metodoComParametro(param1 : int) : void
	 *
	 *
	 * 
	 */
}
