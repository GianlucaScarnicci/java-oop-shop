package it.shop;

import java.util.Random;

public class Prodotto {
	//attributi
	private int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private int iva;
	
	//costruttore
	public Prodotto(){
		this.codice=genCodice();
	}
	//getter and setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public int getCodice() {
		return codice;
	}
	//metodo che genera un numero casuale
	private int genCodice() {
		Random numCasuale=new Random();
		return numCasuale.nextInt(100);
	}
	//metodo che restituisce il prezzo base
	public double prezzoBase() {
		return prezzo;
	}
	//metodo che restituisce il prezzo compreso l'iva
	public double prezzoCompleto() {
		return prezzo+=prezzo*(double)iva/100.0;
	}
	//metodo che concatena codice e nome
	public String nomeEsteso() {
		return codice+""+nome;
	}
}
