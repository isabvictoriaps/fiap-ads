package fintech.com;

public class CategoriaDivida {
	
	private long id;
	private String nomeCategoriaDividaString;
	private boolean statusCategoriaDivida;
	
	// métodos construtores
	
	public CategoriaDivida(long id, String nomeCategoriaDividaString) {
		super();
		this.id = id;
		this.nomeCategoriaDividaString = nomeCategoriaDividaString;
	}
	
	// métodos 
	
	public void consultaNovaCategoria() {
		
		System.out.println("Id: " + this.getId());
		System.out.println("Nome da categoria da dívida: " + this.getNomeCategoriaDividaString());
	}
	
	public void cadastrarNovaCategoriaDivida() {
		System.out.println("Nova categoria de divida cadastrada com sucesso!");
	}
	
	public void editarCategoriaDivida() {
		if (this.isStatusCategoriaDivida()) {
		System.out.println("Categoria da divida editado com sucesso!");
		}else {
		System.out.println("Categoria da divida não existe!");
	}}
	
	public void apagarCategoriaDivida() {
		this.setStatusCategoriaDivida(false);
	}

	// métodos getters e setters
	
	
	
	
	public long getId() {
		return id;
	}

	public boolean isStatusCategoriaDivida() {
		return statusCategoriaDivida;
	}

	public void setStatusCategoriaDivida(boolean statusCategoriaDivida) {
		this.statusCategoriaDivida = statusCategoriaDivida;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeCategoriaDividaString() {
		return nomeCategoriaDividaString;
	}

	public void setNomeCategoriaDividaString(String nomeCategoriaDividaString) {
		this.nomeCategoriaDividaString = nomeCategoriaDividaString;
	}
	
	
	
	

}
