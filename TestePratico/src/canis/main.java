package canis;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a data");
		
		System.out.print("Dia: ");
		int d = entrada.nextInt();
		
		System.out.print("M�s: : ");
		int m = entrada.nextInt();
		if(m == 1) {
			m = 11;
		} else if (m == 2) {
			m = 12;
		} else if (m == 3) {
			m = 1;
		} else if (m == 4) {
			m = 2;
		}else if (m == 5) {
			m = 3;
		} else if (m == 6) {
			m = 4;
		} else if (m == 7) {
			m = 5;
		} else if (m == 8) {
			m = 6;
		} else if (m == 9) {
			m = 7;
		}else if (m == 10) {
			m = 8;
		} else if (m == 11) {
			m = 9;
		} else if (m == 12) {
			m = 10;
		} else {
			System.out.println("m�s inv�lido. Recome�e!");
			System.exit(0);
		}
		System.out.print("Ano: ");
		int a = entrada.nextInt();
		a = a - 2000;
		int c = 20;
		int DiaDaSemana = ( d + Math.round((13 * m - 1) / 5) + a + Math.round(a/4) + Math.round(c / 4) + Math.round(5 * c) ) % 7;
		
		
		System.out.println("Caes pequenos: ");
		int CaesPequenos = entrada.nextInt();
		
		System.out.println("Caes Grandes: ");
		int CaesGrandes = entrada.nextInt();
		
		
		//Canino Feliz
		CaninoFeliz C1 = new CaninoFeliz();
		C1.setDistanciaKm(2);
		C1.setPreco(0);
		double P1 = C1.Precificacao(CaesPequenos, CaesGrandes, DiaDaSemana, C1.getPreco());
		
		//Vai Rex
		VaiRex C2 = new VaiRex();
		C2.setDistanciaKm(1.7);
		C2.setPreco(0);
		double P2 = C2.Precificacao(CaesPequenos, CaesGrandes, DiaDaSemana, C2.getPreco());
		
		//ChowChawgas
		ChowChawgas C3 = new ChowChawgas();
		C3.setDistanciaKm(0.8);
		C3.setPreco(0);
		double P3 = C3.Precificacao(CaesPequenos, CaesGrandes, C3.getPreco());
		
		if(P1 < P2 && P1 < P3) {
			System.out.println("O melhor lugar ser� o Canino Feliz e o pre�o ser� R$" + P1);
		} else if (P2 < P1 && P2 < P1) {
			System.out.println("O melhor lugar ser� o Vai Rex e o pre�o ser� R$" + P2);
		} else if(P3 < P1 && P3 < P2) {
			System.out.println("O melhor lugar ser� o ChowChawgas e o pre�o ser� R$" + P3);
		} else if(P1 == P2 ) {
			System.out.println("O melhor lugar ser� o Vai Rex e o pre�o ser� R$" + P2);
		} else if(P1 == P3) {
			System.out.println("O melhor lugar ser� o ChowChawgas e o pre�o ser� R$" + P3);
		} else if(P2 == P3) {
			System.out.println("O melhor lugar ser� o ChowChawgas e o pre�o ser� R$" + P3);
		}
	
	}
}
