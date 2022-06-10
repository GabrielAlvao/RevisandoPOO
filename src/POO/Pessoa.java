package POO;

public class Pessoa {
	
	private String primeiroNome;
	private String nomeDoMeio;
	private String ultimoNome;
	
	public Pessoa(String primeiro,String meio, String ultimo) {
//	
		primeiroNome = primeiro;
		nomeDoMeio = meio;
		ultimoNome = ultimo;	
	}
	public String getNomeCompleto() {
		String nomeCompleto = this.primeiroNome+" "+this.nomeDoMeio+" "+this.ultimoNome;
		return nomeCompleto;
	}


}
