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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((corso == null) ? 0 : corso.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voto other = (Voto) obj;
		if (corso == null) {
			if (other.corso != null)
				return false;
		} else if (!corso.equals(other.corso))
			return false;
		return true;
	}
	
	
	
	

}
