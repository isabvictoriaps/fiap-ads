package fintech.com;

import java.time.LocalDate;

public class Saldo {

	private long id;
	private float valor;
	private String descValor;
    private LocalDate dataValor = LocalDate.now();
    private String tipoSaldo;
    private boolean statusSaldo;
    
    // método construtror 
    
	public Saldo(long id, float valor, String descValor, String tipoSaldo) {
		super();
		this.id = id;
		this.valor = valor;
		this.descValor = descValor;
		this.tipoSaldo = tipoSaldo;
		}
    
    // métodos
    
    public void consultaSaldo() {
		if (this.isStatusSaldo()) {
		System.out.println("-------------------------");
		System.out.println("CONSULTA DE SALDO");
		System.out.println("valor: " + this.getValor());
		System.out.println("Descrição: " + this.getDescValor());
		System.out.println("Data: " + this.getDataValor());
		System.out.println("Tipo: (Receita ou despesa) " + this.getTipoSaldo());
		}
		else {
			System.out.println("Cadastro não encontrado!");
		}
	}
 
    public void cadastrarSaldo() {
		this.setStatusSaldo(true);
		System.out.println("Saldo cadastrado com sucesso!");
	}
	
	public void editarSaldo() {
		if (this.isStatusSaldo()) {
		System.out.println("Saldo editado com sucesso!");
	} else {
		System.out.println("Saldo não existe!");
	}
		}
	
	public void apagarSaldo() {
		this.setStatusSaldo(false);
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
	public String getDescValor() {
		return descValor;
	}
	public void setDescValor(String descValor) {
		this.descValor = descValor;
	}
	public LocalDate getDataValor() {
		return dataValor;
	}
	public void setDataValor(LocalDate dataValor) {
		this.dataValor = dataValor;
	}
	public String getTipoSaldo() {
		return tipoSaldo;
	}
	public void setTipoSaldo(String tipoSaldo) {
		this.tipoSaldo = tipoSaldo;
	}

	public boolean isStatusSaldo() {
		return statusSaldo;
	}

	public void setStatusSaldo(boolean statusSaldo) {
		this.statusSaldo = statusSaldo;
	}
	
	
}
