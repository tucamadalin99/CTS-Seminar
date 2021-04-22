package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.classes.Card;
import ro.ase.cts.strategy.classes.Cash;
import ro.ase.cts.strategy.classes.Client;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client("Dani");
		client.setModPlata(new Cash());
		client.platesteNota(200.50f);
		
		client.setModPlata(new Card(1000f));
		client.platesteNota(500);
		client.platesteNota(501);
	}

}
