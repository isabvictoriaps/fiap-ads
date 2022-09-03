package fintech.com;

public class CartegoriaInvestimento {

	private long id;
	private String nomeInvestimento;
	private String descInvestimento;
	private boolean statusCategoriaInvestimento;
	
	// método construtor
	
	public CartegoriaInvestimento(long id, String nomeInvestimento, String descInvestimento) {
		this.id = id;
		this.nomeInvestimento = nomeInvestimento;
		this.descInvestimento = descInvestimento;
	}	
	
	
	// métodos
	
	
	public void consultarCategoriaInvestimento() {
		System.out.println("Nome categoria: " + this.getNomeInvestimento() );
		System.out.println("Descrição investimento: " + this.getDescInvestimento());
	}


	public void cadastrarCategoria() {
		this.setStatusCategoriaInvestimento(true);
		System.out.println("Categoria de investimento cadastrado com sucesso!");
	}
	
	// getters e setters
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeInvestimento() {
		return nomeInvestimento;
	}

	public void setNomeInvestimento(String nomeInvestimento) {
		this.nomeInvestimento = nomeInvestimento;
	}

	public String getDescInvestimento() {
		return descInvestimento;
	}

	public void setDescInvestimento(String descInvestimento) {
		this.descInvestimento = descInvestimento;
	}



	public boolean isStatusCategoriaInvestimento() {
		return statusCategoriaInvestimento;
	}


	public void setStatusCategoriaInvestimento(boolean statusCategoriaInvestimento) {
		this.statusCategoriaInvestimento = statusCategoriaInvestimento;
	}
	
	
}
	