package canis;

public class ChowChawgas extends Atributos {
	
		
	public double Precificacao(int CaesPequenos, int CaesGrandes,  double Preco) {
			Preco = (CaesPequenos * 30) + (CaesGrandes * 45);
			return Preco;
	}
	

}
