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
     
    // public void StampaVoti ( int voto) {}
     //public String StampVoti2 ( int voto ) {}
     // la migliore è la 3. Mi serve anche pensando all'interfaccia grafica 
     //CLASSE CHE gestisce i dati, non le interessa la formattazione. 
     
     
     
     //sono gli stessi oggetti. Non ho fatto una copia,copio solo il riferimento dell'oggetto gia creato. Non c'è new. Se modifico 
     //qualcosa nell'oggetto verrà modificato in entrambe le liste 
     
     
     
     public List <Voto> cercaVoti(int voto){
    	 List<Voto> result = new ArrayList(); 
    	  for(Voto v : this.voti) {
    		  if(v.getPunti()==voto) {
    			  result.add(v);
    		  }
    	  }
    	  return result;
    	 
    	 
     }
     
     // con == controllo se hanno la stessa posizione in memoria 
     //devo usare equals se voglio vedere che il contenuto sia uguale
     // == va bene se devo controllare null o due interi 
     
     // compareTo ci dice quale viene prima, non sempre due oggetti sono comparabili. 
     
     public Voto cercaEsame(String nomeEsame) {
    	 //for(Voto v : this.voti) {
    		// if(v.getCorso().equals(nomeEsame)) {
    		//	 return v;
    		 //}
    	 //}
    	 //return null;
    	 
    	 
    	 Voto voto = new Voto(0,nomeEsame,null);
    	 int pos= this.voti.indexOf(voto);
    	 if(pos==1) 
    		 return null; 
    	 else return this.voti.get(pos);
     }
     
     
     
     /**
      * Dato un {@link Voto}, determina se esiste gia un voto con uguale punteggio. 
      * 
      * @param v
      * @return {@code true} se ha trovato un corso e punteggio uguali,
      *         {@code false} se non ha trovato il corso, opp se l'ha trovato con voto diverso. 
      */
     public boolean esisteGiaVoto (Voto v ) {
    	 int pos= this.voti.indexOf(v);
    	 if(pos==1)
    		 return false;
    	 else {
    		 //if(v.getPunti()==this.voti.get(pos).getPunti())
    		   // return true;
    		   // else
    		    	//return false;
    		 return v.getPunti()==this.voti.get(pos).getPunti();
    	 }
    	 //Voto trovato = this.cercaEsame(v.getCorso());
    	 //if(trovato==null)
    		// return false;
    	 //if(trovato.getPunti()==v.getPunti()) {
    		// return false; 
    	 //}else {
    		// return false;
    	 //}
    	 
     }
     
     
     
     
}
