package canis;

public class VaiRex extends Atributos{
	
	
	public double Precificacao(int CaesPequenos, int CaesGrandes, int DiaDaSemana, double Preco) {
		if(DiaDaSemana >= 1 && DiaDaSemana <= 5) {
			Preco = (CaesPequenos * 15 ) + (CaesGrandes * 50);
		}else  {
			Preco = (CaesPequenos * 20) + (CaesGrandes * 55);
		}
		return Preco;
	}
	

}
