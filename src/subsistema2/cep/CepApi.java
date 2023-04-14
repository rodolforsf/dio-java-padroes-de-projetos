package subsistema2.cep;

public class CepApi {
	private static CepApi instancia = new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getInstancia() {
		return instancia;	
	}
	
	public String recuperarRua(String rua) {
		return "XV de Novembro";		
	}
	
	public String recuperarCidade(String cidade) {
		return "Aguai";		
	}
	
	public String recuperarEstado(String estado) {
		return "SP";		
	}

}


