package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	// conosciamo sia Linked che Array Sono classi,che implementano l'interfaccia. List è un' interfaccia predefinita dentro java.util
	private List <Voto> voti ;
    // LinkedList e ArrayList dal punto di vista funzionale svolgono la stessa funzione, dal punto di vista delle prestazioni no.
	// IMPORTANTE !! quando possibile, definire le variabili nel modo più generale possibile: List. Pattern da usare sempre. Nel costruttore specificherò la classe.
	
	public Libretto() {
		this.voti= new ArrayList<Voto>();
	}
	
	
	// due versioni. qual è più utile? nel primo tipo ho i tre pezzi, mi devo creare l'oggetto voto e poi aggiungerlo alla lista. 
	// nel secondo metodo devo fare il richiamante.Cioè fuori dalla classe Libretto. 
	// la seconda soluzione è migliore. Perchè? perchè cosi è possibile modificare la classe interna senza dover modificare anche qui  
	
	
	public void add(int voto, String corso, LocalDate data) {
		
	}
	
	
	/**
	 * Aggiungere un voto al libretto
	 * @param v il voto da aggiungere
	 */
     public void add(Voto v) {
    	 voti.add(v);
		
	}
	
}
