package canis;

public class Atributos {
	private double DistanciaKm;
	private double Preco;
	private String nome;
	
	
	public double getDistanciaKm() {
		return DistanciaKm;
	}
	public void setDistanciaKm(double distanciaKm) {
		DistanciaKm = distanciaKm;
	}
	public double getPreco() {
		return Preco;
	}
	public void setPreco(double preco) {
		Preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public void Precificacao() {
		System.out.println("precificacao ");
	}
	
	

}
