package fintech.com;

public class TesteFintech {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario(1, "Isabelle Victoria Pereira de Souza", "Isabellevictoria.urs@gmail.com","1234","11954852961", new Saldo(1,12, "Despesa - Conta de luz", "Conta - fixa"), new CategoriaSaldo(1, "Variável"));
		u1.cadastrarUsuario();
		u1.consultarUsuario();
		
		
		
	}

}
