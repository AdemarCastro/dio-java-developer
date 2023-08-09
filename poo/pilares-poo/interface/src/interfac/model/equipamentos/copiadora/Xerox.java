package interfac.model.equipamentos.copiadora;

// Como estamos lidando com Interface, agora não iremos extender e sim implementar. 
// No caso, serão os métodos "abstrados" por assim dizer da interface implementada.
public class Xerox implements Copiadora {
	public void copiar() {
		System.out.println("COPIANDO! UTILIZANDO XEROX");
	}
}
