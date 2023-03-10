package canis;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a data");
		
		System.out.print("Dia: ");
		String dia = entrada.next();
		
		System.out.print("M?s: : ");
		String mes = entrada.next();
		
		System.out.print("Ano: ");
		String ano = entrada.next();
		
		String DiaDaSemana =  getDayWeek(dia +"/"+ mes +"/"+ ano);
		
		
		System.out.println("Caes pequenos: ");
		int CaesPequenos = entrada.nextInt();
		
		System.out.println("Caes Grandes: ");
		int CaesGrandes = entrada.nextInt();
		
		entrada.close();
		
		//Canino Feliz
		CaninoFeliz canil1 = new CaninoFeliz();
		canil1.setDistanciaKm(2);
		canil1.setPreco(0);
		canil1.setNome("Canino Feliz");
		double precoCanil1 = canil1.Precificacao(CaesPequenos, CaesGrandes, DiaDaSemana, canil1.getPreco());
		
		//Vai Rex
		VaiRex canil2 = new VaiRex();
		canil2.setDistanciaKm(1.7);
		canil2.setPreco(0);
		canil2.setNome("Vai Rex");
		double precoCanil2 = canil2.Precificacao(CaesPequenos, CaesGrandes, DiaDaSemana, canil2.getPreco());
		
		//ChowChawgas
		ChowChawgas canil3 = new ChowChawgas();
		canil3.setDistanciaKm(0.8);
		canil3.setPreco(0);
		canil3.setNome("ChowChawgas");
		double precoCanil3 = canil3.Precificacao(CaesPequenos, CaesGrandes, canil3.getPreco());
		
		if(precoCanil1 < precoCanil2 && precoCanil1 < precoCanil3) {
			System.out.println("O melhor lugar ser? o " + canil1.getNome() +" e o pre?o ser? R$" + precoCanil1);
		} else if (precoCanil2 < precoCanil1 && precoCanil2 < precoCanil1) {
			System.out.println("O melhor lugar ser? o " + canil2.getNome() + " e o pre?o ser? R$" + precoCanil2);
		} else if(precoCanil3 < precoCanil1 && precoCanil3 < precoCanil2) {
			System.out.println("O melhor lugar ser? o " + canil3.getNome() + " e o pre?o ser? R$" + precoCanil3);
		} else if(precoCanil1 == precoCanil2 ) {
			System.out.println("O melhor lugar ser? o " + canil2.getNome() + " e o pre?o ser? R$" + precoCanil2);
		} else if(precoCanil1 == precoCanil3) {
			System.out.println("O melhor lugar ser? o " + canil3.getNome() + " e o pre?o ser? R$" + precoCanil3);
		} else if(precoCanil2 == precoCanil3) {
			System.out.println("O melhor lugar ser? o " + canil3.getNome() + " e o pre?o ser? R$" + precoCanil3);
		}
	
	}
	
	 public static String getDayWeek(String date){ //ex 07/03/2017
		    String dayWeek = "---";
		    GregorianCalendar gc = new GregorianCalendar();
		    try {
		        gc.setTime(new SimpleDateFormat("dd/MM/yyyy").parse(date));
		        switch (gc.get(Calendar.DAY_OF_WEEK)) {
		            case Calendar.SUNDAY:
		                dayWeek = "0";
		                break;
		            case Calendar.MONDAY:
		                dayWeek = "1";
		                break;
		            case Calendar.TUESDAY:
		                dayWeek = "2";
		            break;
		            case Calendar.WEDNESDAY:
		                dayWeek = "3";
		                break;
		            case Calendar.THURSDAY:
		                dayWeek = "4";
		                break;
		            case Calendar.FRIDAY:
		                dayWeek = "5";
		                break;
		            case Calendar.SATURDAY:
		                dayWeek = "6";
		        }
		    } catch (ParseException e) {
		        e.printStackTrace();
		    }
		    return dayWeek;
		}
}
