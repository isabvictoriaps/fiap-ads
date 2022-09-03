package fintech.com;

public class NovaCategoria {
	
	private long id;
	private String nomeNovaCategoria;
	private String novaDescCategoria;
	private String corNovaCategoria;
	private boolean statusNovaCategoria;
	
	// construtores 
	
	public NovaCategoria(long id, String nomeNovaCategoria, String novaDescCategoria, String corNovaCategoria,
			boolean statusNovaCategoria) {
		super();
		this.id = id;
		this.nomeNovaCategoria = nomeNovaCategoria;
		this.novaDescCategoria = novaDescCategoria;
		this.corNovaCategoria = corNovaCategoria;
		this.statusNovaCategoria = statusNovaCategoria;
	}	
	
	
	// métodos 
	
	public void consultaNovaCategoria() {
		System.out.println("-------------------------");
		System.out.println("CONSULTA DE NOVA CATEGORIA");
		System.out.println("Id: " + this.getId());
		System.out.println("Nome categoria: " + this.getNomeNovaCategoria());
		System.out.println("Descrição categoria: " + this.getNovaDescCategoria());
		System.out.println("Cor da categoria: " + this.getCorNovaCategoria());
	}
 

	public void cadastrarNovaCategoria() {
		System.out.println("Nova categoria cadastrada com sucesso!");
	}
	
	public void editarNovaCategoria() {
		if (this.isStatusNovaCategoria()) {
		System.out.println("Nova categoria com sucesso!");
		}else {
		System.out.println("Nova categoria não existe!");
	}}
		
	
	public void apagarSaldo() {
		this.setStatusNovaCategoria(false);
	}

	
	// getters e setters
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNomeNovaCategoria() {
		return nomeNovaCategoria;
	}


	public void setNomeNovaCategoria(String nomeNovaCategoria) {
		this.nomeNovaCategoria = nomeNovaCategoria;
	}


	public String getNovaDescCategoria() {
		return novaDescCategoria;
	}


	public void setNovaDescCategoria(String novaDescCategoria) {
		this.novaDescCategoria = novaDescCategoria;
	}


	public String getCorNovaCategoria() {
		return corNovaCategoria;
	}


	public void setCorNovaCategoria(String corNovaCategoria) {
		this.corNovaCategoria = corNovaCategoria;
	}


	public boolean isStatusNovaCategoria() {
		return statusNovaCategoria;
	}


	public void setStatusNovaCategoria(boolean statusNovaCategoria) {
		this.statusNovaCategoria = statusNovaCategoria;
	}	
	
	

}
