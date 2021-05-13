package observer.main;

import observer.classes.ClientAbonat;
import observer.classes.Sala;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClientAbonat cl1 = new ClientAbonat("Ionel");
		ClientAbonat cl2 = new ClientAbonat("Dorel");
		Sala sala = new Sala("Polivalenta");
		
		sala.aboneazaClient(cl1);
		sala.aboneazaClient(cl2);
		sala.anuntaMeciBasket();
		sala.dezaboneazaClient(cl2);
		sala.anuntaMeciFotbal();
	}
	

}
