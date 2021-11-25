package it.shop;

public class Main {

	public static void main(String[] args) {
		Prodotto product= new Prodotto();
		product.setDescrizione("nuovo Samsung");
		product.setNome("telefono");
		product.setPrezzo(1250);
		product.setIva(22);
		System.out.println("il prodotto è un "+product.getNome()+ "\nPrecisamente è un "+product.getDescrizione());
		System.out.println("il nome completo è "+product.nomeEsteso());
		System.out.println("questo prodotto costa senza iva "+product.prezzoBase()+"\nSe aggiungo l'iva costa "+product.prezzoCompleto());
		product.setDescrizione(null);
		product.setIva(0);
		product.setNome(null);
		product.setPrezzo(0);
		System.out.println("il prodotto è un "+product.getNome()+ "\nPrecisamente è un "+product.getDescrizione());
		System.out.println("il nome completo è "+product.nomeEsteso());
		System.out.println("questo prodotto costa senza iva "+product.prezzoBase()+"\nSe aggiungo l'iva costa "+product.prezzoCompleto());
	}

}
