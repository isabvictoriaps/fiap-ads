package fintech.com;

public class Divida {
	
	private long id;
	private String nomeConta;
	private String valorConta;
	private String dataVencimento;
	private String dataPagamento;
	private boolean statusDivida;
	
	// métodos construtores
	
	public Divida(long id, String nomeConta, String valorConta, String dataVencimento, String dataPagamento,
			boolean statusDivida) {
		this.id = id;
		this.nomeConta = nomeConta;
		this.valorConta = valorConta;
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
		this.statusDivida = statusDivida;
	}
	
	// métodos 
	
	public void consultaNovaCategoria() {
		
		System.out.println("Id: " + this.getId());
		System.out.println("Nome da conta: " + this.getNomeConta());
		System.out.println("Valor da conta" + this.getValorConta());
		System.out.println("Data de vencimento: " + this.getDataVencimento());
		System.out.println("Data de pagamento: " + this.getDataPagamento());
	}
	
	public void cadastrarNovaCategoriaDivida() {
		System.out.println("Divida cadastrada com sucesso!");
	}
	
	public void editarDivida() {
		if (this.isStatusDivida()) {
		System.out.println("Divida editado com sucesso!");
		}else {
		System.out.println("Divida não existe!");
	}}
	

	public void apagarDivida() {
		this.setStatusDivida(false);
	}
	
	
	
	// métodos getters e setters

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeConta() {
		return nomeConta;
	}

	public void setNomeConta(String nomeConta) {
		this.nomeConta = nomeConta;
	}

	public String getValorConta() {
		return valorConta;
	}

	public void setValorConta(String valorConta) {
		this.valorConta = valorConta;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public String getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(String dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public boolean isStatusDivida() {
		return statusDivida;
	}

	public void setStatusDivida(boolean statusDivida) {
		this.statusDivida = statusDivida;
	}
	
}
	
	
	
