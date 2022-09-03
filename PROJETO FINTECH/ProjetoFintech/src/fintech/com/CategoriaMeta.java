package fintech.com;

public class CategoriaMeta {
	
	private long id;
	private String nomeCategoriaMeta;
	private boolean statusCategoriaMeta;

	// método construtor 

	public CategoriaMeta(long id, String nomeCategoriaMeta) {
		super();
		this.id = id;
		this.nomeCategoriaMeta = nomeCategoriaMeta;
	}
	

	//  método 
	
	public void cadastrarCategoriaMeta() {
		this.setStatusCategoriaMeta(true);
		System.out.println("Cadastro de meta realizado com com sucesso!");
	}
	
	public void editarCategoriaMeta() {
		if (this.isStatusCategoriaMeta()) {
		System.out.println("Categoria meta editado com sucesso!");
	} else {
		System.out.println("Categoria meta não existe!");
	}
		}
	
	public void apagarUsuario() {
		this.setStatusCategoriaMeta(false);
	}
	
	// método getter e setter

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeCategoriaMeta() {
		return nomeCategoriaMeta;
	}

	public void setNomeCategoriaMeta(String nomeCategoriaMeta) {
		this.nomeCategoriaMeta = nomeCategoriaMeta;
	}

	public boolean isStatusCategoriaMeta() {
		return statusCategoriaMeta;
	}

	public void setStatusCategoriaMeta(boolean statusCategoriaMeta) {
		this.statusCategoriaMeta = statusCategoriaMeta;
	}
	}
	
