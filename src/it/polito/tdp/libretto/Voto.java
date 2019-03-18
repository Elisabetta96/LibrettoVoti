package it.polito.tdp.libretto;

import java.time.LocalDate;

public class Voto {
	
	private int punti; 
	private String corso; 
	
	// come si rappresenta una data in java? 
	// modo piu sbagliato : String data; non è facilemente modificabile
	// ho bisogno di un oggetto che conosca e sappia gestire il calendario.. esempio Date o Calendar ( versioni vecchie ) 
	// Uso LocalDate ( da java7 con una libreria java.time) 
	
	
	private LocalDate data;

	public Voto(int voto, String corso, LocalDate data) {
		super();
		this.punti = voto;
		this.corso = corso;
		this.data = data;
	}

	public int getPunti() {
		return punti;
	}

	public void setPunti(int voto) {
		this.punti = voto;
	}

	public String getCorso() {
		return corso;
	}

	public void setCorso(String corso) {
		this.corso = corso;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return String.format("Voto [punti=%s, corso=%s, data=%s]", punti, corso, data);
	}
	
	
	
	

}
