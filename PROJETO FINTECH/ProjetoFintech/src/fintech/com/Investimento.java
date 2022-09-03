package fintech.com;

public class Investimento {
	
	private long id;
	private float valor;
	private String localInvest;
	private String dataInicio;
	private String dataTermino;
	private float rentabilidade;
	private boolean statusInvestimento;
	
	
	// construtor
	
	public Investimento(long id, float valor, String localInvest, String dataInicio, String dataTermino,
			float rentabilidade, boolean statusInvestimento) {
		this.id = id;
		this.valor = valor;
		this.localInvest = localInvest;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.rentabilidade = rentabilidade;
		this.statusInvestimento = statusInvestimento;
	}
	
	// métodos 
	
		public void consultaInvestimento() {
		
		System.out.println("Id: " + this.getId());
		System.out.println("Valor: " + this.getValor());
		System.out.println("Local investimento" + this.getLocalInvest());
		System.out.println("Data início: " + this.getDataInicio());
		System.out.println("Data de término: " + this.getDataTermino());
		System.out.println("Rentabilidade: " + this.getRentabilidade());
	}
	
	public void cadastrarNovaCategoriaDivida() {
		this.setStatusInvestimento(true);
		System.out.println("Divida cadastrada com sucesso!");
	}
	
	public void editarDivida() {
		if (this.isStatusInvestimento()) {
		System.out.println("Investimento editado com sucesso!");
		}else {
		System.out.println("Investimento não existe!");
	}}
	

	public void apagarDivida() {
		this.setStatusInvestimento(false);
	}

	
	// getters e setters 

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}


	public String getLocalInvest() {
		return localInvest;
	}


	public void setLocalInvest(String localInvest) {
		this.localInvest = localInvest;
	}


	public String getDataInicio() {
		return dataInicio;
	}


	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}


	public String getDataTermino() {
		return dataTermino;
	}


	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}


	public float getRentabilidade() {
		return rentabilidade;
	}


	public void setRentabilidade(float rentabilidade) {
		this.rentabilidade = rentabilidade;
	}


	public boolean isStatusInvestimento() {
		return statusInvestimento;
	}


	public void setStatusInvestimento(boolean statusInvestimento) {
		this.statusInvestimento = statusInvestimento;
	}

}
