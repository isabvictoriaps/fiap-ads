package fintech.com;

public class Meta {
	
	private long id;
	private String descricaoMeta;
	private String valor;
	private String dataInicio;
	private String dataFinal;
	private boolean concluida;
	private boolean statusMeta;
	
	

	// método construtor 
	
	public Meta(long id, String descricaoMeta, String valor, String dataInicio, String dataFinal, boolean concluida) {
		super();
		this.id = id;
		this.descricaoMeta = descricaoMeta;
		this.valor = valor;
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
		this.concluida = concluida;
	}

	//  método 
	
	public void cadastrarMeta() {
		this.setStatusMeta(true);
		System.out.println("Meta cadastrada com sucesso!");
	}

	public void editarMeta() {
		if (this.isStatusMeta()) {
		System.out.println("Meta editada com sucesso!");
	} else {
		System.out.println("Meta não existe!");
	}
		}
	
	public void apagarUsuario() {
		this.setStatusMeta(false);
	}

	// getters e setters
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricaoMeta() {
		return descricaoMeta;
	}

	public void setDescricaoMeta(String descricaoMeta) {
		this.descricaoMeta = descricaoMeta;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}

	public boolean isConcluida() {
		return concluida;
	}

	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}

	public boolean isStatusMeta() {
		return statusMeta;
	}

	public void setStatusMeta(boolean statusMeta) {
		this.statusMeta = statusMeta;
	}
	
	
}
	
