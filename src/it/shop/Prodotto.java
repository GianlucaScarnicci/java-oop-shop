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
		if(isStringNullOrEmpty(nome)) {
			System.out.println("errore.Il nome non è adeguato.Tengo i parametri precedenti");
		}else {
		this.nome = nome;
		}
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		if(isStringNullOrEmpty(descrizione)) {
			System.out.println("errore.La descrizione non è adeguata.Tengo i parametri precedenti");
		}else {
		this.descrizione = descrizione;
		}
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		if(isPriceOrIvaCorrect(prezzo)) {
		this.prezzo = prezzo;
		}else {
			System.out.println("errore nel prezzo. Deve essere maggiore di zero.Tengo i parametri precedenti");
		}
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		if(isPriceOrIvaCorrect(iva)) {
		this.iva = iva;
		}else {
			System.out.println("errore nell'iva. Deve essere maggiore di zero.Tengo i parametri precedenti");
		}
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
		return codice+" "+nome;
	}
	//metodo che controlla se una stringa è nulla o vuota
	private boolean isStringNullOrEmpty(String s) {
		return s==null || s.length()==0;
	}
	//metodo che controlla se il prezzo o l'iva è maggiore o uguale a zero
	private boolean isPriceOrIvaCorrect(double prezzo) {
		return prezzo>0;
	}
}
