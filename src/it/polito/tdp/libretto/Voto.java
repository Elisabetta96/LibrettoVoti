package it.polito.tdp.libretto;

import java.time.LocalDate;

public class Voto {
	
	private int voto; 
	private String corso; 
	
	// come si rappresenta una data in java? 
	// modo piu sbagliato : String data; non è facilemente modificabile
	// ho bisogno di un oggetto che conosca e sappia gestire il calendario.. esempio Date o Calendar ( versioni vecchie ) 
	// Uso LocalDate ( da java7 con una libreria java.time) 
	
	
	private LocalDate data;

	public Voto(int voto, String corso, LocalDate data) {
		super();
		this.voto = voto;
		this.corso = corso;
		this.data = data;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
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
	
	

}
