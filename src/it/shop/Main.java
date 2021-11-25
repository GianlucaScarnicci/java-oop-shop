package it.shop;

public class Main {

	public static void main(String[] args) {
		Prodotto product= new Prodotto();
		product.setDescrizione("nuovo Samsung");
		product.setNome("telefono");
		product.setPrezzo(1250);
		product.setIva(22);
		System.out.println("il prodotto è un "+product.getNome()+ "\nPrecisamente è un "+product.getDescrizione());
		System.out.println("questo prodotto costa senza iva "+product.prezzoBase()+"\nSe aggiungo l'iva costa "+product.prezzoCompleto());

	}

}
