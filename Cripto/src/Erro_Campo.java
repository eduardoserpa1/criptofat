
public class Erro_Campo extends Exception{
	
	private static final long serialVersionUID = 1L;

	public String Erro_a() {
		return "A chave não pode possuir apenas a letra - a";
	}
	
	public String Erro_1letra() {
		return "A chave não pode possuir apenas uma letra!";
	}
	
	public String Erro_void() {
		return "Por favor, digite uma chave de criptografia.!";
	}
	
	
}
