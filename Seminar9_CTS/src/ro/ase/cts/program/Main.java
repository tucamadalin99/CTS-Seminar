package ro.ase.cts.program;

import ro.ase.cts.classes.Card;
import ro.ase.cts.classes.Cash;
import ro.ase.cts.classes.Client;

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
