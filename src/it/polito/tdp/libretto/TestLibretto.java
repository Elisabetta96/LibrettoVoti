package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto {

	//perchè una classe separata?mi permette di essere sicuro che io non usi dati privati neanche per sbaglio. 
	// richio anche di vedere una variabile private ( es il voto ). Non sarebbe un test realistico. 
	
	
	//questa classe non stampa niente,non da errori,ma c'è un altro modo per vedere se il mio p
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libretto libr= new Libretto();
		libr.add(new Voto(30,"Analisi I",LocalDate.of(2017, 1, 15)));
		libr.add(new Voto(21,"Analisi II",LocalDate.of(2018, 1, 15)));
		libr.add(new Voto(25,"Fisica I",LocalDate.of(2017, 6, 10)));
		libr.add(new Voto(28,"Fisica II",LocalDate.of(2018, 9, 3)));
		libr.add(new Voto(18,"Geometria",LocalDate.of(2017, 1, 15)));
		libr.add(new Voto(20,"Economia",LocalDate.of(2017, 1, 15)));
		libr.add(new Voto(25,"RicercaOperativa",LocalDate.of(2018, 1, 28)));
		libr.add(new Voto(24,"Complementi",LocalDate.of(2018, 6, 5)));
		libr.add(new Voto(25,"Logistica",LocalDate.of(2018, 2, 15)));
		libr.add(new Voto(27,"Programmazione a oggetti",LocalDate.of(2019, 1, 25)));
		
		
		List <Voto> venticinque= libr.cercaVoti(25); 
		System.out.println(venticinque);
		
		Voto a1=libr.cercaEsame("Analisi I");
		Voto a3=libr.cercaEsame("Analisi III");
		System.out.println(a1);
		System.out.println(a3);
		

	}

}
