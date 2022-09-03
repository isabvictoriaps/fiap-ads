package fintech.com;

public class CarteiraInvestimento {

	private long id;
	private float valorTotalInvestido;
	
	
	// método construtor
	
	public CarteiraInvestimento(long id, float valorTotalInvestido) {
		super();
		this.id = id;
		this.valorTotalInvestido = valorTotalInvestido;
	}
	
	// métodos
	
	public float consultarCarteirAInvestimento() {
		return valorTotalInvestido;
	}
	
	// getters e setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public float getValorTotalInvestido() {
		return valorTotalInvestido;
	}
	public void setValorTotalInvestido(float valorTotalInvestido) {
		this.valorTotalInvestido = valorTotalInvestido;
	}
	
	
	
	
	
}
