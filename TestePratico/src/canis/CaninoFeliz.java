package canis;

public class CaninoFeliz extends Atributos{
	
	
	public double Precificacao(int CaesPequenos, int CaesGrandes, String DiaDaSemana, double Preco) {
		if(DiaDaSemana == "0" | DiaDaSemana == "6") {
			Preco = (CaesPequenos * 24) + (CaesGrandes * 48);
		}else {
			
			Preco = (CaesPequenos * 20 ) + (CaesGrandes * 40);
		}
		return Preco;
	}
	
	
}
