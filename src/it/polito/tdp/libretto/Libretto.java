package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	// conosciamo sia Linked che Array Sono classi,che implementano l'interfaccia. List � un' interfaccia predefinita dentro java.util
	private List <Voto> voti ;
    // LinkedList e ArrayList dal punto di vista funzionale svolgono la stessa funzione, dal punto di vista delle prestazioni no.
	// IMPORTANTE !! quando possibile, definire le variabili nel modo pi� generale possibile: List. Pattern da usare sempre. Nel costruttore specificher� la classe.
	
	public Libretto() {
		this.voti= new ArrayList<Voto>();
	}
	
	
	// due versioni. qual � pi� utile? nel primo tipo ho i tre pezzi, mi devo creare l'oggetto voto e poi aggiungerlo alla lista. 
	// nel secondo metodo devo fare il richiamante.Cio� fuori dalla classe Libretto. 
	// la seconda soluzione � migliore. Perch�? perch� cosi � possibile modificare la classe interna senza dover modificare anche qui  
	
	
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
