package canis;

public class VaiRex extends Atributos{
	
	
	public double Precificacao(int CaesPequenos, int CaesGrandes, String DiaDaSemana, double Preco) {
		if(DiaDaSemana == "0" | DiaDaSemana == "6") {
			Preco = (CaesPequenos * 20) + (CaesGrandes * 55);
		}else  {
			Preco = (CaesPequenos * 15 ) + (CaesGrandes * 50);
		}
		return Preco;
	}
	

}
