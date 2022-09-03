package fintech.com;

public class Usuario {
	
	private long id;
	private String nome;
	private String amail;
	private String senha;
	private String telefone;
	private boolean statusCadastro;
	private Saldo saldo; // aqui nós instanciamos outra classe
	private CategoriaSaldo categoriaSaldo;
	

	// método construtor 
	
	public Usuario(long id, String nome, String amail, String senha, String telefone, Saldo saldo, CategoriaSaldo categoriaSaldo) {
		this.id = id;
		this.nome = nome;
		this.amail = amail;
		this.senha = senha;
		this.telefone = telefone;
		this.saldo = saldo; // nós trazemos a classe para o método construtor 
		this.categoriaSaldo = categoriaSaldo;
	}
	
	
	// métodos
	
	public void consultarUsuario() {
		if (this.isStatusCadastro()) {
		System.out.println("-------------------------");
		System.out.println("CONSULTA DE USUÁRIO");
		System.out.println("Nome: " + this.getNome());
		System.out.println("E-mail: " + this.getAmail());
		System.out.println("Senha: " + this.getSenha());
		System.out.println("Telefone: " + this.getTelefone());
		System.out.println("Valor do saldo: " + saldo.getValor());
		System.out.println("Descrição do valor " + saldo.getDescValor());
		System.out.println("Data: " + saldo.getDataValor());
		System.out.println("Tipo de saldo: " + categoriaSaldo.getTipoCategoria());
		}
		else {
			System.out.println("Cadastro não encontrado!");
		}
	}


	public void cadastrarUsuario() {
		this.setStatusCadastro(true);
		System.out.println("Conta aberta com sucesso!");
	}
	
	public void editarUsuario() {
		if (this.isStatusCadastro()) {
		System.out.println("Usuário editado com sucesso!");
	} else {
		System.out.println("Usuário não existe!");
	}
		}
	
	public void apagarUsuario() {
		this.setStatusCadastro(false);
	}
	
	
	// getters e setters
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAmail() {
		return amail;
	}
	public void setAmail(String amail) {
		this.amail = amail;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public boolean isStatusCadastro() {
		return statusCadastro;
	}

	public void setStatusCadastro(boolean statusCadastro) {
		this.statusCadastro = statusCadastro;
	}

	public Saldo getSaldo() {
		return saldo;
	}

	public void setSaldo(Saldo saldo) {
		this.saldo = saldo;
	}


	public CategoriaSaldo getCategoriaSaldo() {
		return categoriaSaldo;
	}


	public void setCategoriaSaldo(CategoriaSaldo categoriaSaldo) {
		this.categoriaSaldo = categoriaSaldo;
	}
	
	
}
