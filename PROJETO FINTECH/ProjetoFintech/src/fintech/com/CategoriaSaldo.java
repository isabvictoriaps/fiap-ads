package fintech.com;

public class CategoriaSaldo {

	private long id;
	private String tipoCategoria;
	
	
	// construtor
	
	public CategoriaSaldo(long id, String tipoCategoria) {
		this.id = id;
		this.tipoCategoria = tipoCategoria;
	}
	
	
	// métodos
	
	public void adicionarSaldoCategoria() {
		
	}
	
	
	// getters e setters
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTipoCategoria() {
		return tipoCategoria;
	}
	public void setTipoCategoria(String tipoCategoria) {
		this.tipoCategoria = tipoCategoria;
	}
	
	
}
