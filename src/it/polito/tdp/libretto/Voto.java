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

}
